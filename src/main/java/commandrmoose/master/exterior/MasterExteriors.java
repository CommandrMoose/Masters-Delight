package commandrmoose.master.exterior;

import commandrmoose.master.Master;
import commandrmoose.master.blocks.MBlocks;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.tardis.mod.exterior.ExteriorRegistry;
import net.tardis.mod.exterior.IExterior;
import net.tardis.mod.exterior.TwoBlockBasicExterior;
import net.tardis.mod.misc.IDoorType;

import java.util.ArrayList;

public class MasterExteriors {

    public static TwoBlockBasicExterior BOOTH;


    // Registers all the exteriors.
    public static <T extends IExterior> T register(ResourceLocation key, T ext) {
        ext.setRegistryName(key);
        ExteriorRegistry.register(key, ext);
        return ext;
    }

    public static IExterior getExterior(ResourceLocation key) {return ExteriorRegistry.getExterior(key);}

    public static ArrayList<IExterior> getDefExteriors(){
        ArrayList<IExterior> list = new ArrayList<>();
        // Get all unlocked exteriors.
        for (IExterior ext : ExteriorRegistry.getRegistry().values()) {
            if(ext.isDefault())
                list.add(ext);
        }
        return list;
    }

    public static void init() {
        //BOOTH = register(new ResourceLocation(Master.MODID, "booth"), new TwoBlockBasicExterior(() -> MBlocks.exterior_booth.getDefaultState(), true, IDoorType.EnumDoorType.TT_CAPSULE, new ResourceLocation(Master.MODID, "textures/gui/exteriors/woah.png")));
    }

}
