package commandrmoose.master;

import commandrmoose.master.data.LootTableCreation;
import commandrmoose.master.proxy.ClientProxy;
import commandrmoose.master.proxy.IProxy;
import commandrmoose.master.proxy.ServerProxy;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.*;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

@Mod(Master.MODID)
public class Master {

    public static final String MODID = "master";

    public static IProxy proxy;

    private static final Logger LOGGER = LogManager.getLogger();

    public Master() {

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(FMLCommonSetupEvent event){

        DistExecutor.runWhenOn(Dist.DEDICATED_SERVER, () -> {

            return () -> proxy = new ServerProxy();

        });

        DistExecutor.runWhenOn(Dist.CLIENT, () -> () -> proxy = new ClientProxy());

    }

    @SubscribeEvent
    public void gatherData(GatherDataEvent e) {
        e.getGenerator().addProvider(new LootTableCreation(e.getGenerator()));
    }


}
