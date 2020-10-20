package commandrmoose.master.consoles;

import commandrmoose.master.Master;
import commandrmoose.master.blocks.MBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.tardis.mod.Tardis;
import net.tardis.mod.blocks.TBlocks;
import net.tardis.mod.registries.IRegisterable;
import net.tardis.mod.registries.TardisRegistries;
import net.tardis.mod.registries.consoles.Console;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = Master.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MConsole implements IRegisterable<Console> {

    public static Console COPPER;

    @Override
    public Console setRegistryName(ResourceLocation resourceLocation) {
        return null;
    }

    @Override
    public ResourceLocation getRegistryName() {
        return null;
    }

    @SubscribeEvent
    public static void eventBusSubscriber(FMLCommonSetupEvent event) {
        TardisRegistries.registerRegisters(() -> {
            COPPER = register(new Console(() -> MBlocks.console_copper.getDefaultState(), "copper"), "copper");


        });
    }

    private static Console register(Console console, String name) {
        console.setRegistryName(new ResourceLocation(Tardis.MODID, name));
        TardisRegistries.CONSOLE_REGISTRY.register(console.getRegistryName(), console);
        return console;
    }

}
