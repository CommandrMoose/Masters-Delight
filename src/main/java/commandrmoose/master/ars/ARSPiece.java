package commandrmoose.master.ars;

import commandrmoose.master.Master;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.tardis.mod.Tardis;
import net.tardis.mod.ars.ARSPieces;
import net.tardis.mod.registries.TardisRegistries;

@Mod.EventBusSubscriber(modid = Master.MODID, bus = Bus.MOD)
public class ARSPiece extends ARSPieces {

    @SubscribeEvent
    public static void register(FMLCommonSetupEvent event){

        //register("test", new net.tardis.mod.ars.ARSPiece("test", new BlockPos(3, 3, 9)));
    }

    public static net.tardis.mod.ars.ARSPiece register(String name, net.tardis.mod.ars.ARSPiece piece) {
        TardisRegistries.ARS_PIECES.register(name, piece);
        return piece;
    }


}
