package commandrmoose.master.consoles.positionscale;

import commandrmoose.master.client.models.consoles.ConsoleControlTransform;
import commandrmoose.master.tiles.console.CopperConsoleTile;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.tardis.mod.controls.CommunicatorControl;
import net.tardis.mod.entity.ControlEntity;
import net.tardis.mod.tileentities.ConsoleTile;

public class CopperControlPosScale extends ConsoleControlTransform {

    public static void moveControlPositions(TileEntity tile)
    {
        if (tile != null)
        {
            ConsoleTile consoleTile = (ConsoleTile) tile;
            for (ControlEntity control : consoleTile.getControlList())
            {
                setControlPos(consoleTile, control, new Vec3d(0,1,0));
            }

        }

    }

    public static void updateControlSize(TileEntity tile)
    {

    }


    static void setControlPos(ConsoleTile console, ControlEntity control, Vec3d offset)
    {
        control.teleportKeepLoaded(console.getPos().getX() + 0.5f + offset.x, console.getPos().getY() + 1f + offset.y,console.getPos().getZ() + 0.5f + offset.z);
    }

}
