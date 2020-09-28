package commandrmoose.master.itemgroups;

import commandrmoose.master.Master;
import commandrmoose.master.blocks.MBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = Master.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MItemGroups {

    public static ItemGroup MAIN = new ItemGroup(Master.MODID + ".main") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(MBlocks.toaster);
        }
    };

    @SubscribeEvent
    public static void registerItemGroups(FMLCommonSetupEvent event) {}

}
