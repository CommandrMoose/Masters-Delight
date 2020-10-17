package commandrmoose.master.tiles.console;

import commandrmoose.master.consoles.positionscale.CopperControlPosScale;
import commandrmoose.master.tiles.MTiles;
import net.minecraft.entity.EntitySize;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.server.ServerWorld;
import net.tardis.mod.controls.ControlRegistry;
import net.tardis.mod.controls.IControl;
import net.tardis.mod.entity.ControlEntity;
import net.tardis.mod.entity.TEntities;
import net.tardis.mod.tileentities.ConsoleTile;

import java.util.ArrayList;
import java.util.Iterator;

public class CopperConsoleTile extends ConsoleTile implements ITickableTileEntity {

    private static final AxisAlignedBB CONRTROL_HITBOX = new AxisAlignedBB(-1.0D, 0.0D, -1.0D, 2.0D, 2.0D, 2.0D);
    private ArrayList<ControlEntity> controls = new ArrayList();
    private ArrayList<ControlRegistry.ControlEntry<?>> controlEntries = new ArrayList();

    public CopperConsoleTile() {
        super(MTiles.CONSOLE_COPPER);
        registerControlEntry(ControlRegistry.DEMAT);
        registerControlEntry(ControlRegistry.THROTTLE);
        registerControlEntry(ControlRegistry.RANDOM);
        registerControlEntry(ControlRegistry.DIMENSION);
        registerControlEntry(ControlRegistry.FACING);
        registerControlEntry(ControlRegistry.X);
        registerControlEntry(ControlRegistry.Y);
        registerControlEntry(ControlRegistry.Z);
        registerControlEntry(ControlRegistry.INC_MOD);
        registerControlEntry(ControlRegistry.LAND_TYPE);
        registerControlEntry(ControlRegistry.REFUELER);
        registerControlEntry(ControlRegistry.FAST_RETURN);
        registerControlEntry(ControlRegistry.TELEPATHIC);
        registerControlEntry(ControlRegistry.STABILIZERS);
        registerControlEntry(ControlRegistry.SONIC_PORT);
        registerControlEntry(ControlRegistry.COMMUNICATOR);
        registerControlEntry(ControlRegistry.DOOR);
    }

    public CopperConsoleTile(TileEntityType<?> type) {
        super(type);
    }

    @Override
    public void getOrCreateControls() {
        this.gatherOldControls();
        if (!this.world.isRemote && this.controls.size() < this.controlEntries.size()) {
            this.removeControls();
            Iterator var1 = this.controlEntries.iterator();

            while(var1.hasNext()) {
                ControlRegistry.ControlEntry<?> controlEntry = (ControlRegistry.ControlEntry)var1.next();
                IControl control = controlEntry.spawn(this);
                ControlEntity entity = (ControlEntity) TEntities.CONTROL.create(this.world);
                CopperControlPosScale.moveControlPositions(this, entity, control);
                entity.setControl(control);
                entity.setConsole(this);
                ((ServerWorld)this.world).addEntityIfNotDuplicate(entity);
                controls.add(entity);
            }
        }

        this.updateClient();
    }


    private void gatherOldControls() {
        controls.clear();
        Iterator var1 = this.world.getEntitiesWithinAABB(ControlEntity.class, CONRTROL_HITBOX.offset(this.getPos()).grow(5.0D)).iterator();

        while(var1.hasNext()) {
            ControlEntity control = (ControlEntity)var1.next();
            if (!control.removed) {
                control.setConsole(this);
                controls.add(control);
            }
        }

    }

    @Override
    public void removeControls() {
        Iterator var1 = this.world.getEntitiesWithinAABB(ControlEntity.class, CONRTROL_HITBOX.offset(this.getPos()).grow(5.0D)).iterator();

        while(var1.hasNext()) {
            ControlEntity control = (ControlEntity)var1.next();
            control.remove();
        }

        this.controls.clear();
    }

    @Override
    public void registerControlEntry(ControlRegistry.ControlEntry<?> entry) {
        if (controlEntries != null && entry != null) {
            controlEntries.add(entry);
        }
    }

}
