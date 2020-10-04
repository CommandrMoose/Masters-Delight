package commandrmoose.master.recipe;

import commandrmoose.master.blocks.MBlocks;
import commandrmoose.master.items.MItems;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.tardis.mod.items.TItems;
import net.tardis.mod.recipe.WeldRecipe;

public class MQuantiscopeRecipies {

    public static void addRecipies(){
        WeldRecipe.WELD_RECIPE.add(new WeldRecipe(Item.getItemFromBlock(MBlocks.temporal_siphon), false, TItems.CIRCUITS));
        MinecraftForge.EVENT_BUS.register(new MQuantiscopeRecipies());

    }

}
