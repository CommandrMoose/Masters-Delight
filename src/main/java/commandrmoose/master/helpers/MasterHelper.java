package commandrmoose.master.helpers;

import commandrmoose.master.Master;
import net.minecraft.advancements.Advancement;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.tileentity.EndPortalTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.server.ServerWorld;
import net.tardis.mod.Tardis;
import net.tardis.mod.tileentities.ConsoleTile;

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
}