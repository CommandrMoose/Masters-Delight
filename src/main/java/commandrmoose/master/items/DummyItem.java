package commandrmoose.master.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.tardis.mod.properties.Prop;

public class DummyItem extends Item {

    public DummyItem() {
        super(Prop.Items.ONE.get().maxDamage(255).group(ItemGroup.REDSTONE));
    }

}
