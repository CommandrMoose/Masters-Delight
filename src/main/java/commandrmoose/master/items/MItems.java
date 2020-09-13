package commandrmoose.master.items;

import commandrmoose.master.Master;
import commandrmoose.master.blocks.MBlocks;
import commandrmoose.master.blocks.TemporalSiphonBlock;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Master.MODID, bus = Bus.MOD)
public class MItems {


    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(

        );

        for(Item item : MBlocks.ITEMS){
            event.getRegistry().register(item);
        }
    }

    public static <T extends Item> T createItem(T item, String name){
        item.setRegistryName(Master.MODID, name);
        return item;
    }
}


