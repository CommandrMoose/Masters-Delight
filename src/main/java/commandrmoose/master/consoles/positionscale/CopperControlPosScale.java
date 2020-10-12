package commandrmoose.master.consoles.positionscale;

import commandrmoose.master.client.models.consoles.ConsoleControlTransform;
import commandrmoose.master.tiles.console.CopperConsoleTile;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.tardis.mod.controls.*;
import net.tardis.mod.entity.ControlEntity;
import net.tardis.mod.tileentities.ConsoleTile;

public class CopperControlPosScale extends ConsoleControlTransform {

    public static void moveControlPositions(TileEntity tile, ControlEntity controlEntity, IControl control)
    {
        if (tile != null)
        {
            ConsoleTile consoleTile = (ConsoleTile) tile;
            if (control instanceof FacingControl) {
                setControlPos(consoleTile, controlEntity, new Vec3d(-0.7636831926274561, 1.0, -0.3422868457334372));
            }

            if (control instanceof CommunicatorControl) {
                setControlPos(consoleTile, controlEntity, new Vec3d(0.017707658735901965, 0.90625, 0.7656454269880992));
            }

            if (control instanceof StabilizerControl) {
                setControlPos(consoleTile, controlEntity, new Vec3d(-1.1451144902340333, 0.5, 0.3625304178273101));
            }

            if (control instanceof TelepathicControl){
                setControlPos(consoleTile, controlEntity, new Vec3d(0.5917223227887751, 0.9375, 0.3736432940903941));
            }

            if (control instanceof XControl){
                setControlPos(consoleTile, controlEntity, new Vec3d(0.7023716815692471, 0.625, -0.5773699056510256));
            }

            if (control instanceof YControl){
                setControlPos(consoleTile, controlEntity, new Vec3d(0.7602416050976457, 0.53125, -0.6879527291183164));
            }

            if (control instanceof ZControl){
                setControlPos(consoleTile, controlEntity, new Vec3d(0.9061849738087098, 0.46875, -0.7002638179970925));
            }

        }

    }

    public static void updateControlSize(TileEntity tile)
    {

    }


    static void setControlPos(ConsoleTile console, ControlEntity control, Vec3d offset)
    {
        control.teleportKeepLoaded(console.getPos().getX() + 0.5f + offset.x, console.getPos().getY() + 0.5f + offset.y,console.getPos().getZ() + 0.5f + offset.z);
    }

}
