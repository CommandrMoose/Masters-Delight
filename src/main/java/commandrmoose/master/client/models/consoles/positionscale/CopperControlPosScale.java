package commandrmoose.master.client.models.consoles.positionscale;

import commandrmoose.master.client.models.consoles.ConsoleControlTransform;
import commandrmoose.master.tiles.console.CopperConsoleTile;
import net.minecraft.entity.MoverType;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.server.ServerWorld;
import net.tardis.mod.controls.BaseControl;
import net.tardis.mod.controls.CommunicatorControl;
import net.tardis.mod.controls.IControl;
import net.tardis.mod.entity.ControlEntity;
import net.tardis.mod.entity.TEntities;
import net.tardis.mod.tileentities.ConsoleTile;

import javax.vecmath.Vector3d;

public class CopperControlPosScale extends ConsoleControlTransform {

    public static void moveControlPositions(TileEntity tile)
    {
        if (tile != null && tile instanceof CopperConsoleTile)
        {
            ConsoleTile consoleTile = (ConsoleTile) tile;
            for (ControlEntity control : consoleTile.getControlList())
            {
                setControlPos(consoleTile, control, new Vec3d(0,1,0));

                if (control.getControl() instanceof CommunicatorControl) {
                }
            }

        }

    }

    public static void updateControlSize(TileEntity tile)
    {

    }


    static void setControlPos(ConsoleTile console, ControlEntity control, Vec3d offset)
    {
        BlockPos controlLoc = new BlockPos(console.getPos().getX() + 0.5f + offset.x, console.getPos().getY() + 1f + offset.y,console.getPos().getZ() + 0.5f + offset.z);
        control.moveToBlockPosAndAngles(console.getPos(), 0, 0);
        control.moveToBlockPosAndAngles(controlLoc, 0, 0);
    }

}
