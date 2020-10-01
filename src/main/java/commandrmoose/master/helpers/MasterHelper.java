package commandrmoose.master.helpers;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.EndPortalTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.server.ServerWorld;
import net.tardis.mod.cap.Capabilities;
import net.tardis.mod.items.ArtronCapacitorItem;
import net.tardis.mod.tileentities.inventory.PanelInventory;

import java.util.concurrent.atomic.AtomicReference;

public class MasterHelper {

    public static boolean hasDragonBeenKilled(World worldln) {
        if (worldln != null) {
            for(int i = -8; i <= 8; ++i) {
                for(int j = -8; j <= 8; ++j) {
                    Chunk chunk = worldln.getChunk(i, j);
                    for(TileEntity tileentity : chunk.getTileEntityMap().values()) {
                        if (tileentity instanceof EndPortalTileEntity) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static PanelInventory getEngineInventory(World world, Direction direction)
    {
        world.getCapability(Capabilities.TARDIS_DATA).ifPresent(cap -> {

        });

        return null;
    }

}
