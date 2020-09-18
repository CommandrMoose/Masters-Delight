package commandrmoose.master.items;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.tardis.mod.properties.Prop;

import java.util.List;

public class DummyItem extends Item {

    public DummyItem() {
        super(Prop.Items.ONE.get().maxDamage(255).group(ItemGroup.REDSTONE));
    }


}
