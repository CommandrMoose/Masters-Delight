package commandrmoose.master.tiles.console;

import commandrmoose.master.consoles.positionscale.CopperControlPosScale;
import commandrmoose.master.tiles.MTiles;
import net.minecraft.entity.EntitySize;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.server.ServerWorld;
import net.tardis.mod.controls.*;
import net.tardis.mod.entity.ControlEntity;
import net.tardis.mod.entity.TEntities;
import net.tardis.mod.tileentities.ConsoleTile;
import net.tardis.mod.tileentities.console.misc.ControlOverride;

import java.util.ArrayList;
import java.util.Iterator;

public class CopperConsoleTile extends ConsoleTile implements ITickableTileEntity {

    private static final AxisAlignedBB CONRTROL_HITBOX = new AxisAlignedBB(-1.0D, 0.0D, -1.0D, 2.0D, 2.0D, 2.0D);
    private ArrayList<ControlEntity> controls = new ArrayList();
    private ArrayList<ControlRegistry.ControlEntry<?>> controlEntries = new ArrayList();

    public CopperConsoleTile() {
        super(MTiles.CONSOLE_COPPER);

        this.controlOverrides.put(FacingControl.class, new ControlOverride(new Vec3d(-0.7534763617803086, 1.0, -0.36382471213789824), EntitySize.flexible(0.1875F, 0.1875F)));
        this.controlOverrides.put(StabilizerControl.class, new ControlOverride(new Vec3d(-1.1643087550660156, 0.5, 0.3481751412158103), EntitySize.flexible(0.1875F, 0.1875F)));
        this.controlOverrides.put(TelepathicControl.class, new ControlOverride(new Vec3d(0.5808923733179254, 0.9375, 0.37844622476966494), EntitySize.flexible(0.3125F, 0.3125F)));
        this.controlOverrides.put(CommunicatorControl.class, new ControlOverride(new Vec3d(-0.03427925665249065, 0.9375, 0.6399601835707498), EntitySize.flexible(0.3125F, 0.3125F)));
        this.controlOverrides.put(RefuelerControl.class, new ControlOverride(new Vec3d(-0.7957924223912113, 0.59375, -0.9627021071937257), EntitySize.flexible(0.25F, 0.25F)));
        this.controlOverrides.put(RandomiserControl.class, new ControlOverride(new Vec3d(-0.02549972424349578, 0.59375, 1.1994270443266681), EntitySize.flexible(0.375F, 0.375F)));
        this.controlOverrides.put(HandbrakeControl.class, new ControlOverride(new Vec3d(0.9018302967985694, 0.6875, 0.16320698191949234), EntitySize.flexible(0.3125F, 0.3125F)));
        this.controlOverrides.put(DoorControl.class, new ControlOverride(new Vec3d(1.0612555327866224, 0.625, -0.20421105175829007), EntitySize.flexible(0.1875F, 0.1875F)));
        this.controlOverrides.put(IncModControl.class, new ControlOverride(new Vec3d(-0.7819954465462516, 0.5, 0.9752763159530988), EntitySize.flexible(0.1875F, 0.1875F)));
        this.controlOverrides.put(DimensionControl.class, new ControlOverride(new Vec3d(-0.943399030463922, 0.46875, 0.6762460544720672), EntitySize.flexible(0.25F, 0.25F)));
        this.controlOverrides.put(LandingTypeControl.class, new ControlOverride(new Vec3d(-1.0773927240168533, 0.65625, 0.1583647495799516), EntitySize.flexible(0.25F, 0.25F)));
        this.controlOverrides.put(SonicPortControl.class, new ControlOverride(new Vec3d(-0.9046691972354738, 0.59375, 0.30652076157766595), EntitySize.flexible(0.25F, 0.25F)));
        this.controlOverrides.put(XControl.class, new ControlOverride(new Vec3d(0.7459119752741321, 0.59375, -0.6373257471276913), EntitySize.flexible(0.125F, 0.125F)));
        this.controlOverrides.put(YControl.class, new ControlOverride(new Vec3d(0.8036497612525688, 0.53125, -0.7272156070800373), EntitySize.flexible(0.125F, 0.125F)));
        this.controlOverrides.put(ZControl.class, new ControlOverride(new Vec3d(0.9447360798374431, 0.46875, -0.7307087149206982), EntitySize.flexible(0.125F, 0.125F)));
        this.controlOverrides.put(ThrottleControl.class, new ControlOverride(new Vec3d(-0.39533487419456625, 0.71875, -0.9099839260870719), EntitySize.flexible(0.375F, 0.375F)));
        this.controlOverrides.put(MonitorControl.class, new ControlOverride(new Vec3d(-0.8346974723292676, 1.71875, -0.482832463322669), EntitySize.flexible(0.5F, 0.5F)));
        this.controlOverrides.put(FastReturnControl.class, new ControlOverride(new Vec3d(0.3293461423898616, 0.65625, -0.9830153875983476), EntitySize.flexible(0.25F, 0.25F)));
    }

    public CopperConsoleTile(TileEntityType<?> type) {
        super(type);
    }


}
