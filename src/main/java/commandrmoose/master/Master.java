package commandrmoose.master;

import commandrmoose.master.blocks.MBlocks;
import commandrmoose.master.data.LootTableCreation;
import commandrmoose.master.dimensions.MDimensions;
import commandrmoose.master.exterior.MasterExteriors;
import commandrmoose.master.protocols.ProtocolRegistry;
import commandrmoose.master.proxy.ClientProxy;
import commandrmoose.master.proxy.IProxy;
import commandrmoose.master.proxy.ServerProxy;
import commandrmoose.master.recipe.MQuantiscopeRecipies;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.*;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.tardis.mod.exterior.ExteriorRegistry;
import net.tardis.mod.items.TItems;
import net.tardis.mod.recipe.WeldRecipe;
import net.tardis.mod.registries.TardisRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

@Mod(Master.MODID)
public class Master {

    public static final String MODID = "master";

    public static IProxy proxy;

    private static final Logger LOGGER = LogManager.getLogger();

    public Master() {

        FMLJavaModLoadingContext.get().getModEventBus().register(this);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(new MDimensions());

    }

    private void commonSetup(FMLCommonSetupEvent event){
        DistExecutor.runWhenOn(Dist.DEDICATED_SERVER, () -> {
            return () -> proxy = new ServerProxy();
        });

        DistExecutor.runWhenOn(Dist.CLIENT, () -> () -> proxy = new ClientProxy());
        MasterExteriors.init();
        TardisRegistries.registerRegisters(ProtocolRegistry::registerAll);

    }

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public void onNewRegistries(RegistryEvent.NewRegistry e) {
        MDimensions.DIMENSIONS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }


    @SubscribeEvent
    public void gatherData(GatherDataEvent e) {
        e.getGenerator().addProvider(new LootTableCreation(e.getGenerator()));
    }


}
