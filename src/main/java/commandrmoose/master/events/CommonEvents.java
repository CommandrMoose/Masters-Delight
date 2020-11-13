package commandrmoose.master.events;

import com.google.common.collect.Maps;
import commandrmoose.master.Master;
import commandrmoose.master.blocks.MBlocks;
import commandrmoose.master.consoles.positionscale.CopperControlPosScale;
import commandrmoose.master.entity.passive.TemporalBatEntity;
import commandrmoose.master.helpers.InteriorUnlocker;
import commandrmoose.master.helpers.MasterHelper;
import commandrmoose.master.sounds.MSounds;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.FishingRodItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerXpEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.tardis.mod.cap.Capabilities;
import net.tardis.mod.controls.*;
import net.tardis.mod.dimensions.TDimensions;
import net.tardis.mod.entity.ControlEntity;
import net.tardis.mod.entity.DoorEntity;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.events.TardisEvent;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.items.ArtronCapacitorItem;
import net.tardis.mod.items.SonicItem;
import net.tardis.mod.items.TItems;
import net.tardis.mod.network.Network;
import net.tardis.mod.network.packets.RecipeSyncMessage;
import net.tardis.mod.recipe.WeldRecipe;
import net.tardis.mod.sounds.TSounds;
import net.tardis.mod.tileentities.exteriors.*;
import net.tardis.mod.tileentities.inventory.PanelInventory;
import net.tardis.mod.trades.ItemTrade;
import net.tardis.mod.trades.Villager;

import java.util.ArrayList;
import java.util.Random;

@Mod.EventBusSubscriber(modid = Master.MODID)
public class CommonEvents {

    // Fucking finally.
    // That's because he generates drama daily. He thinks every idea he has for the mod must be added and added instantly or we're persecuting him.
    // No idea why he left but I hope he doesn't come back.


    @SubscribeEvent
    public static void syncDataPacks(PlayerEvent.PlayerLoggedInEvent event) {
        if(event.getPlayer() instanceof ServerPlayerEntity) {
            //Network.sendTo(new RecipeSyncMessage(new ArrayList<>(WeldRecipe.WELD_RECIPE), Maps.newHashMap()), (ServerPlayerEntity)event.getPlayer());
        }
    }

    @SubscribeEvent
    public static void damaged(LivingDamageEvent event) {

        if (event.getEntity() instanceof ServerPlayerEntity) {
           // NetworkHelper.sendMessage("2");
        }
    }

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
                           // NetworkHelper.main("TARDIS Taking Off.");
                            event.getTarget().world.playSound(null, entity.getControl().getConsole().getPos(), MSounds.THROTTLE_BLAST, SoundCategory.BLOCKS, 0.4f,1f);
                        }
                    }
                }
            }
        }
    }


    @SubscribeEvent
    public static void onWorldJoin(PlayerEvent.PlayerLoggedInEvent event) {
        WeldRecipe.WELD_RECIPE.forEach(item -> System.out.println(item.getOutput()));
    }

    @SubscribeEvent
    public static void onXP(PlayerXpEvent event) {
       // NetworkHelper.sendMessage("3");
    }

    @SubscribeEvent
    public static void onWorldTick(TickEvent.WorldTickEvent event) {

        if (event.world.getDimension().getType().getModType() == TDimensions.TARDIS){

            TardisHelper.getConsoleInWorld(event.world).ifPresent(tile -> {
                Random rand = new Random();

                event.world.getCapability(Capabilities.TARDIS_DATA).ifPresent(cap -> {
                    PanelInventory panel = cap.getEngineInventoryForSide(Direction.EAST);
                    PanelInventory comp = cap.getEngineInventoryForSide(Direction.NORTH);

                    if (comp != null) {

                        boolean isPresent = false;

                        for(int i = 0; i < comp.getSizeInventory(); ++i) {
                            ItemStack stack = comp.getStackInSlot(i);
                            if (stack.getItem() == TItems.SHEILD_GENERATOR) {
                                isPresent = true;
                            }

                        }

                        if (isPresent != true) {
                            if (rand.nextInt(5000) <= 1 && tile.isInFlight()) {
                                TemporalBatEntity bat = new TemporalBatEntity(event.world);
                                bat.setPosition(tile.getPos().getX() + 0.5f, tile.getPos().getY() + 1, tile.getPos().getZ() + 0.5f);
                                event.world.addEntity(bat);
                            }
                        }

                    }

                    if (panel != null) {
                        for(int i = 0; i < panel.getSizeInventory(); ++i) {
                            ItemStack stack = panel.getStackInSlot(i);

                            if(stack.getItem() == Items.CHICKEN ) {
                                if (rand.nextInt(100 * stack.getStack().getCount()) == 1) {
                                    ItemStack item = new ItemStack(Items.COOKED_CHICKEN);
                                    item.setCount(stack.getStack().getCount());
                                    panel.removeStackFromSlot(i);
                                    panel.setInventorySlotContents(i, item);
                                    tile.getWorld().playSound(null, tile.getPos(), MSounds.BELL_RING, SoundCategory.BLOCKS, 10f,1.5f);
                                }

                                if (rand.nextInt(100 * stack.getStack().getCount()) == 2){
                                    ItemStack item = new ItemStack(Items.ROTTEN_FLESH);
                                    item.setCount(stack.getStack().getCount());
                                    panel.removeStackFromSlot(i);
                                    panel.setInventorySlotContents(i, item);
                                    tile.getWorld().playSound(null, tile.getPos(), MSounds.BELL_RING, SoundCategory.BLOCKS, 10f,1.5f);
                                }
                            }

                            if(stack.getItem() == Items.BEEF ) {
                                if (rand.nextInt(100 * stack.getStack().getCount()) == 1) {
                                    ItemStack item = new ItemStack(Items.COOKED_BEEF);
                                    item.setCount(stack.getStack().getCount());
                                    panel.removeStackFromSlot(i);
                                    panel.setInventorySlotContents(i, item);
                                    tile.getWorld().playSound(null, tile.getPos(), MSounds.BELL_RING, SoundCategory.BLOCKS, 10f,1.5f);
                                }

                                if (rand.nextInt(100 * stack.getStack().getCount()) == 2){
                                    ItemStack item = new ItemStack(Items.ROTTEN_FLESH);
                                    item.setCount(stack.getStack().getCount());
                                    panel.removeStackFromSlot(i);
                                    panel.setInventorySlotContents(i, item);
                                    tile.getWorld().playSound(null, tile.getPos(), MSounds.BELL_RING, SoundCategory.BLOCKS, 10f,1.5f);
                                }
                            }

                            if(stack.getItem() == Items.MUTTON ) {
                                if (rand.nextInt(100 * stack.getStack().getCount()) == 1) {
                                    ItemStack item = new ItemStack(Items.COOKED_MUTTON);
                                    item.setCount(stack.getStack().getCount());
                                    panel.removeStackFromSlot(i);
                                    panel.setInventorySlotContents(i, item);
                                    tile.getWorld().playSound(null, tile.getPos(), MSounds.BELL_RING, SoundCategory.BLOCKS, 10f,1.5f);
                                }

                                if (rand.nextInt(100 * stack.getStack().getCount()) == 2){
                                    ItemStack item = new ItemStack(Items.ROTTEN_FLESH);
                                    item.setCount(stack.getStack().getCount());
                                    panel.removeStackFromSlot(i);
                                    panel.setInventorySlotContents(i, item);
                                    tile.getWorld().playSound(null, tile.getPos(), MSounds.BELL_RING, SoundCategory.BLOCKS, 10f,1.5f);
                                }
                            }

                            if(stack.getItem() == Items.PORKCHOP ) {
                                if (rand.nextInt(100 * stack.getStack().getCount()) == 1) {
                                    ItemStack item = new ItemStack(Items.COOKED_PORKCHOP);
                                    item.setCount(stack.getStack().getCount());
                                    panel.removeStackFromSlot(i);
                                    panel.setInventorySlotContents(i, item);
                                    tile.getWorld().playSound(null, tile.getPos(), MSounds.BELL_RING, SoundCategory.BLOCKS, 10f,1.5f);
                                }

                                if (rand.nextInt(100 * stack.getStack().getCount()) == 2){
                                    ItemStack item = new ItemStack(Items.ROTTEN_FLESH);
                                    item.setCount(stack.getStack().getCount());
                                    panel.removeStackFromSlot(i);
                                    panel.setInventorySlotContents(i, item);
                                    tile.getWorld().playSound(null, tile.getPos(), MSounds.BELL_RING, SoundCategory.BLOCKS, 10f,1.5f);
                                }
                            }

                            if(stack.getItem() == Items.COD ) {
                                if (rand.nextInt(100 * stack.getStack().getCount()) == 1) {
                                    ItemStack item = new ItemStack(Items.COOKED_COD);
                                    item.setCount(stack.getStack().getCount());
                                    panel.removeStackFromSlot(i);
                                    panel.setInventorySlotContents(i, item);
                                    tile.getWorld().playSound(null, tile.getPos(), MSounds.BELL_RING, SoundCategory.BLOCKS, 10f,1.5f);
                                }

                                if (rand.nextInt(100 * stack.getStack().getCount()) == 2){
                                    ItemStack item = new ItemStack(Items.ROTTEN_FLESH);
                                    item.setCount(stack.getStack().getCount());
                                    panel.removeStackFromSlot(i);
                                    panel.setInventorySlotContents(i, item);
                                    tile.getWorld().playSound(null, tile.getPos(), MSounds.BELL_RING, SoundCategory.BLOCKS, 10f,1.5f);
                                }
                            }

                            if(stack.getItem() == Items.SALMON ) {
                                if (rand.nextInt(100 * stack.getStack().getCount()) == 1) {
                                    ItemStack item = new ItemStack(Items.COOKED_SALMON);
                                    item.setCount(stack.getStack().getCount());
                                    panel.removeStackFromSlot(i);
                                    panel.setInventorySlotContents(i, item);
                                    tile.getWorld().playSound(null, tile.getPos(), MSounds.BELL_RING, SoundCategory.BLOCKS, 10f,1.5f);
                                }

                                if (rand.nextInt(100 * stack.getStack().getCount()) == 2){
                                    ItemStack item = new ItemStack(Items.ROTTEN_FLESH);
                                    item.setCount(stack.getStack().getCount());
                                    panel.removeStackFromSlot(i);
                                    panel.setInventorySlotContents(i, item);
                                    tile.getWorld().playSound(null, tile.getPos(), MSounds.BELL_RING, SoundCategory.BLOCKS, 10f,1.5f);
                                }
                            }

                            if(stack.getItem() == Items.RABBIT ) {
                                if (rand.nextInt(100 * stack.getStack().getCount()) == 1) {
                                    ItemStack item = new ItemStack(Items.COOKED_RABBIT);
                                    item.setCount(stack.getStack().getCount());
                                    panel.removeStackFromSlot(i);
                                    panel.setInventorySlotContents(i, item);
                                    tile.getWorld().playSound(null, tile.getPos(), MSounds.BELL_RING, SoundCategory.BLOCKS, 10f,1.5f);
                                }

                                if (rand.nextInt(100 * stack.getStack().getCount()) == 2){
                                    ItemStack item = new ItemStack(Items.ROTTEN_FLESH);
                                    item.setCount(stack.getStack().getCount());
                                    panel.removeStackFromSlot(i);
                                    panel.setInventorySlotContents(i, item);
                                    tile.getWorld().playSound(null, tile.getPos(), MSounds.BELL_RING, SoundCategory.BLOCKS, 10f,1.5f);
                                }
                            }

                        }
                    }

                });


                if (tile.getSonicItem().getItem() != null) {
                    if (tile.getSonicItem().getItem() == TItems.SONIC) {
                        SonicItem sonic = (SonicItem) tile.getSonicItem().getItem();
                        ItemStack sonicStack = tile.getSonicItem().getStack();
                        if (event.world.getGameTime() % 20 == 0) {
                            sonic.charge(sonicStack, 1f);
                        }
                    }
                }

                if (tile.getDestinationDimension() != null)
                    if (tile.getDestinationDimension() == DimensionType.THE_END){
                        if (tile.isInFlight()){
                            ServerWorld world = tile.getWorld().getServer().func_71218_a(tile.getDestinationDimension());
                            if (world != null){
                                if (!MasterHelper.hasDragonBeenKilled(world)) {
                                    tile.setDestination(DimensionType.OVERWORLD, new BlockPos(-1000 + rand.nextInt(2000), 64, -1000 + rand.nextInt(2000)));
                                    tile.getInteriorManager().setAlarmOn(true);
                                    tile.getWorld().playSound(null, tile.getPos(), MSounds.ALERT_ALARM, SoundCategory.BLOCKS, 0.4f,1f);

                                }
                            }
                        }
                    }

                ExteriorTile exteriorBlock = tile.getExterior().getExterior(tile);
                if (exteriorBlock != null) {
                    if (!tile.getDistressSignals().isEmpty() && tile.getExterior().getExterior(tile).getWorld().getGameTime() % 100 == 0 && !tile.isInFlight()) {
                        if (exteriorBlock instanceof ModernPoliceBoxExteriorTile || exteriorBlock instanceof PoliceBoxExteriorTile || exteriorBlock instanceof RedExteriorTile) {
                            exteriorBlock.getWorld().playSound(null, tile.getExterior().getExterior(tile).getPos(), TSounds.COMMUNICATOR_RING, SoundCategory.BLOCKS, 1f, 1f);
                        }
                    }

                    if (tile.getExterior().getExterior(tile).getWorld().getGameTime() % 70 == 0 && !tile.isInFlight()) {
                        if (tile.getInteriorManager().isAlarmOn()) {
                            exteriorBlock.getWorld().playSound(null, tile.getExterior().getExterior(tile).getPos(), TSounds.SINGLE_CLOISTER, SoundCategory.BLOCKS, 2f, 1f);
                        }
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

        // Advancements
        if(event.getWorld().getDimension().getType().getModType() == TDimensions.TARDIS && !event.getWorld().isRemote) {
            InteriorUnlocker.checkAchievementsForUnlock(event);
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
