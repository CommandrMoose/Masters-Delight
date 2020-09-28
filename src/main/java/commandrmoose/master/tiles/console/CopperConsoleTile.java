package commandrmoose.master.tiles.console;

import commandrmoose.master.tiles.MTiles;
import net.minecraft.tileentity.TileEntityType;
import net.tardis.mod.tileentities.ConsoleTile;

public class CopperConsoleTile extends ConsoleTile {
    public CopperConsoleTile() {
        super(MTiles.CONSOLE_COPPER);
    }

    public CopperConsoleTile(TileEntityType<?> type) {
        super(type);
    }

}
