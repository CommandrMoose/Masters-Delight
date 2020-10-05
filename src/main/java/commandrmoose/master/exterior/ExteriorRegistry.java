package commandrmoose.master.exterior;

import commandrmoose.master.Master;
import commandrmoose.master.blocks.MBlocks;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.tardis.mod.Tardis;
import net.tardis.mod.blocks.TBlocks;
import net.tardis.mod.exterior.IExterior;
import net.tardis.mod.exterior.TwoBlockBasicExterior;
import net.tardis.mod.misc.IDoorType;
import net.tardis.mod.texturevariants.TextureVariants;

import java.util.ArrayList;
import java.util.HashMap;

@Mod.EventBusSubscriber(modid = Master.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ExteriorRegistry {

    private static HashMap<ResourceLocation, IExterior> REGISTRY = new HashMap<>();

    public static TwoBlockBasicExterior BOOTH;


    // Registers all the exteriors.
    public static <T extends IExterior> T register(ResourceLocation key, T ext) {
        ext.setRegistryName(key);
        net.tardis.mod.exterior.ExteriorRegistry.register(key, ext);
        return ext;
    }

    public static IExterior getExterior(ResourceLocation key) {return REGISTRY.get(key);}

    public static ArrayList<IExterior> getDefExteriors(){
        ArrayList<IExterior> list = new ArrayList<>();
        // Get all unlocked exteriors.
        for (IExterior ext : REGISTRY.values()) {
            if(ext.isDefault())
                list.add(ext);
        }
        return list;
    }

    @SubscribeEvent
    public static void registerExteriors(FMLCommonSetupEvent event) {
        BOOTH = register(new ResourceLocation(Master.MODID, "booth"), new TwoBlockBasicExterior(() -> MBlocks.exterior_booth.getDefaultState(), true, IDoorType.EnumDoorType.TT_CAPSULE, new ResourceLocation(Master.MODID, "textures/gui/exteriors/woah.png")));
    }

}
