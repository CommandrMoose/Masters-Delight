package commandrmoose.master.events;

import com.google.common.eventbus.Subscribe;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.blaze3d.platform.GlStateManager;
import commandrmoose.master.Master;
import commandrmoose.master.blocks.MBlocks;
import commandrmoose.master.entity.passive.TemporalBatEntity;
import commandrmoose.master.helpers.Helper;
import commandrmoose.master.items.MItems;
import commandrmoose.master.sounds.MSounds;
import net.minecraft.client.GameConfiguration;
import net.minecraft.client.Minecraft;
import net.minecraft.client.MinecraftGame;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.network.play.NetworkPlayerInfo;
import net.minecraft.client.renderer.entity.model.PlayerModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerModelPart;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.projectile.FishingBobberEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.FishingRodItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.EndPortalTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.dimension.Dimension;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.dimension.EndDimension;
import net.minecraft.world.end.DragonFightManager;
import net.minecraft.world.gen.feature.structure.StrongholdPieces;
import net.minecraft.world.gen.placement.EndIsland;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.client.event.EntityViewRenderEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.common.extensions.IForgeWorldServer;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.EntityMountEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.ItemFishedEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.tardis.mod.blocks.ExteriorBlock;
import net.tardis.mod.controls.*;
import net.tardis.mod.dimensions.TDimensions;
import net.tardis.mod.entity.ControlEntity;
import net.tardis.mod.entity.DoorEntity;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.sounds.TSounds;
import net.tardis.mod.subsystem.ShieldGeneratorSubsystem;
import net.tardis.mod.subsystem.Subsystem;
import net.tardis.mod.tileentities.ConsoleTile;
import net.tardis.mod.tileentities.console.misc.DistressSignal;
import net.tardis.mod.tileentities.exteriors.*;
import net.tardis.mod.tileentities.inventory.PanelInventory;
import net.tardis.mod.trades.ItemTrade;
import net.tardis.mod.trades.Villager;
import org.apache.logging.log4j.core.jmx.Server;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Mod.EventBusSubscriber(modid = Master.MODID)
public class CommonEvents {

    @SubscribeEvent
    public static void onAttack(AttackEntityEvent event) {
        if (event.getTarget() instanceof ControlEntity){
            ControlEntity entity = (ControlEntity) event.getTarget();

            // Throttle Umph sound.
            if (entity.getControl() instanceof ThrottleControl) {
                if (entity.getControl().getConsole().canFly() && !entity.getControl().getConsole().isInFlight() && !event.getPlayer().isSneaking()){
                    IControl control = entity.getControl().getConsole().getControl(HandbrakeControl.class);
                    // Check to make sure the handbreak isn't on.
                    if (control instanceof HandbrakeControl){
                        if (((HandbrakeControl) control).isFree()) {
                            event.getTarget().world.playSound(null, entity.getControl().getConsole().getPos(), MSounds.THROTTLE_BLAST, SoundCategory.BLOCKS, 0.4f,1f);
                        }
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public static void onWorldTick(TickEvent.WorldTickEvent event) {

        if (event.world.getDimension().getType().getModType() == TDimensions.TARDIS){

            TardisHelper.getConsoleInWorld(event.world).ifPresent(tile -> {
                Random rand = new Random();

                if (rand.nextInt(5000) <= 1 && tile.isInFlight()) {
                    TemporalBatEntity bat = new TemporalBatEntity(event.world);
                    bat.setPosition(tile.getPos().getX() + 0.5f, tile.getPos().getY() + 1, tile.getPos().getZ() + 0.5f);
                    event.world.addEntity(bat);

                }
            });


            TardisHelper.getConsoleInWorld(event.world).ifPresent(tile -> {
                if (tile.getDestinationDimension() != null)
                    if (tile.getDestinationDimension() == DimensionType.THE_END){
                        if (tile.isInFlight()){
                            ServerWorld world = tile.getWorld().getServer().func_71218_a(tile.getDestinationDimension());
                            if (world != null){
                                if (!Helper.hasDragonBeenKilled(world)) {
                                    Random rand = new Random();
                                    tile.setDestination(DimensionType.OVERWORLD, new BlockPos(-1000 + rand.nextInt(2000), 64, -1000 + rand.nextInt(2000)));
                                    tile.getInteriorManager().setAlarmOn(true);
                                    tile.getWorld().playSound(null, tile.getPos(), MSounds.ALERT_ALARM, SoundCategory.BLOCKS, 0.4f,1f);

                                }
                            }
                        }
                    }

                if (!tile.getDistressSignals().isEmpty() && tile.getExterior().getExterior(tile).getWorld().getGameTime() % 100 == 0 && !tile.isInFlight())
                {
                    ExteriorTile exteriorBlock = tile.getExterior().getExterior(tile);

                    if ( exteriorBlock instanceof ModernPoliceBoxExteriorTile || exteriorBlock instanceof PoliceBoxExteriorTile || exteriorBlock instanceof RedExteriorTile) {
                        exteriorBlock.getWorld().playSound(null, tile.getExterior().getExterior(tile).getPos(), TSounds.COMMUNICATOR_RING, SoundCategory.BLOCKS, 1f, 1f);
                    }



                }

                if (tile.getExterior().getExterior(tile).getWorld().getGameTime() % 70 == 0 && !tile.isInFlight())
                {
                    ExteriorTile exteriorBlock = tile.getExterior().getExterior(tile);

                    if (tile.getInteriorManager().isAlarmOn()) {
                        exteriorBlock.getWorld().playSound(null, tile.getExterior().getExterior(tile).getPos(), TSounds.SINGLE_CLOISTER, SoundCategory.BLOCKS, 2f, 1f);
                    }
                }

            });
        }
    }

    @SubscribeEvent
    public static void onEntityJoin(EntityJoinWorldEvent event){
        if(event.getWorld().getDimension().getType().getModType() == TDimensions.VORTEX) {
            if (event.getEntity() instanceof ServerPlayerEntity) {
                event.getWorld().playSound(null, event.getEntity().getPosition(), MSounds.TIME_VORTEX, SoundCategory.MUSIC, 100f , 1);
            }

        }
    }

    @SubscribeEvent
    public static void rightClickItem(PlayerInteractEvent.RightClickItem event){
        if (event.getItemStack().getItem() instanceof FishingRodItem) {
            if (event.getPlayer().fishingBobber != null) {

                // Open doors with a rod.
                if (event.getPlayer().fishingBobber.caughtEntity instanceof DoorEntity) {
                    DoorEntity door = (DoorEntity) event.getPlayer().fishingBobber.caughtEntity;
                    if (door.getOpenState() == EnumDoorState.CLOSED && !door.isLocked()) {
                        door.setOpenState(EnumDoorState.BOTH);
                    }
                }

            }
        }

    }

    @SubscribeEvent
    public static void registerTrades(VillagerTradesEvent event) {

        if(event.getType() == Villager.STORY_TELLER) {
            event.getTrades().get(1).add(new ItemTrade(new ItemStack(Items.EMERALD, 8), new ItemStack(MBlocks.toaster), 1, 3));

        }
    }

}
