package commandrmoose.master.tiles;

import commandrmoose.master.sounds.MSounds;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.SoundCategory;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.sounds.TSounds;


public class HalliganKitTile extends TileEntity implements ITickableTileEntity {

    private int time = 0;
    int second = 20;
    int minute = second * 60;
    int hour = minute * 60;


    public HalliganKitTile() {
        super(MTiles.HALLIGAN_KIT);
    }


    @Override
    public void tick() {
        time++;
        if (this.time == (hour/2)) {

        }

    }


    @Override
    public void read(CompoundNBT compound){
        super.read(compound);
        this.time = compound.getInt("processed_time");
    }

    @Override
    public CompoundNBT write(CompoundNBT compound) {
        compound.putInt("processed_time", this.time);
        return super.write(compound);
    }

}
