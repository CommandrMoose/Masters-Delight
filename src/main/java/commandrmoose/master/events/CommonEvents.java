package commandrmoose.master.events;

import commandrmoose.master.Master;
import commandrmoose.master.entity.passive.TemporalBatEntity;
import commandrmoose.master.sounds.MSounds;
import net.minecraft.client.GameConfiguration;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.EnderCrystalEntity;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerModelPart;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.dimension.DimensionType;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.tardis.mod.cap.Capabilities;
import net.tardis.mod.controls.*;
import net.tardis.mod.dimensions.TDimensions;
import net.tardis.mod.entity.ControlEntity;
import net.tardis.mod.helper.TardisHelper;

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
                if (rand.nextInt(10000) <= 1) {
                    TemporalBatEntity bat = new TemporalBatEntity(event.world);
                    bat.setPosition(tile.getPos().getX() + 0.5f, tile.getPos().getY() + 1, tile.getPos().getZ() + 0.5f);
                    event.world.addEntity(bat);

                }
            });

            TardisHelper.getConsoleInWorld(event.world).ifPresent(tile -> {
                if (tile.getDestinationDimension() == DimensionType.THE_END){
                    if (tile.getDestination().withinDistance(new Vec3i(0,0,0), 300) && tile.isInFlight()){
                        tile.setDestination(DimensionType.OVERWORLD, new BlockPos(0,64,0));
                        tile.getInteriorManager().setAlarmOn(true);
                        tile.getWorld().playSound(null, tile.getPos(), MSounds.ALERT_ALARM, SoundCategory.BLOCKS, 0.4f,1f);
                        //
                    }
                }
            });
        }
    }
}
