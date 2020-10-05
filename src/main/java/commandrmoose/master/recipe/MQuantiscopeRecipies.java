package commandrmoose.master.recipe;

import commandrmoose.master.Master;
import commandrmoose.master.blocks.MBlocks;
import commandrmoose.master.items.MItems;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.tardis.mod.items.TItems;
import net.tardis.mod.recipe.WeldRecipe;

@Mod.EventBusSubscriber(modid = Master.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MQuantiscopeRecipies {

    @SubscribeEvent
    public static void register(FMLCommonSetupEvent event){
        //WeldRecipe.WELD_RECIPE.add(new WeldRecipe(Item.getItemFromBlock(MBlocks.temporal_siphon), false, Items.ACACIA_LEAVES));
    }

}
