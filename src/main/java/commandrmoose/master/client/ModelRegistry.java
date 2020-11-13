package commandrmoose.master.client;

import commandrmoose.master.Master;
import commandrmoose.master.blocks.exteriors.BoothExteriorBlock;
import commandrmoose.master.client.renderers.consoles.CopperConsoleRenderer;
import commandrmoose.master.client.renderers.entity.adventure.WatcherRenderer;
import commandrmoose.master.client.renderers.entity.aggressive.TempleGolemRenderer;
import commandrmoose.master.client.renderers.entity.passive.TemporalBatRenderer;
import commandrmoose.master.client.renderers.exterior.BoothExteriorRenderer;
import commandrmoose.master.client.renderers.tile.BrokenEngineRenderer;
import commandrmoose.master.client.renderers.tile.TemporalSiphonRenderer;
import commandrmoose.master.entity.adventure.WatcherEntity;
import commandrmoose.master.entity.aggressive.TempleGolemEntity;
import commandrmoose.master.entity.passive.TemporalBatEntity;
import commandrmoose.master.tiles.BrokenEngineTile;
import commandrmoose.master.tiles.TemporalSiphonTile;
import commandrmoose.master.tiles.console.CopperConsoleTile;
import commandrmoose.master.tiles.exterior.BoothExteriorTile;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;


@Mod.EventBusSubscriber(value = Dist.CLIENT, modid = Master.MODID, bus = Bus.MOD)
public class ModelRegistry {

    @SubscribeEvent
    public static void register(FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(TemporalBatEntity.class, TemporalBatRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(WatcherEntity.class, WatcherRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(TempleGolemEntity.class, TempleGolemRenderer::new);


        ClientRegistry.bindTileEntitySpecialRenderer(BoothExteriorTile.class, new BoothExteriorRenderer());

        ClientRegistry.bindTileEntitySpecialRenderer(CopperConsoleTile.class, new CopperConsoleRenderer());
        ClientRegistry.bindTileEntitySpecialRenderer(TemporalSiphonTile.class, new TemporalSiphonRenderer());

        ClientRegistry.bindTileEntitySpecialRenderer(BrokenEngineTile.class, new BrokenEngineRenderer());

    }
}

