package commandrmoose.master.dimensions;

import commandrmoose.master.Master;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.ModDimension;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.world.RegisterDimensionsEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.tardis.mod.Tardis;
import net.tardis.mod.dimensions.SingleModDimension;
import net.tardis.mod.dimensions.SpaceDimension;
import net.tardis.mod.dimensions.TDimensions;
import net.tardis.mod.dimensions.TardisDimension;
import net.tardis.mod.world.data.TardisWorldData;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = Master.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MDimensions {

    public static final DeferredRegister<ModDimension> DIMENSIONS = new DeferredRegister<>(ForgeRegistries.MOD_DIMENSIONS, Master.MODID);
    public static final RegistryObject<ModDimension> EVENTWORLD = DIMENSIONS.register("event", () -> registerDimensions(new SingleDimension(TardisDimension::new)));


    public static DimensionType EVENTWORLD_TYPE;

    @SubscribeEvent
    public void registerDim(RegisterDimensionsEvent event) {
        EVENTWORLD_TYPE = DimensionManager.registerOrGetDimension(new ResourceLocation(Master.MODID, "event"), EVENTWORLD.get(), null, false);
    }
    
   
    private static ModDimension registerDimensions(ModDimension type) {
        return type;
    }


}
