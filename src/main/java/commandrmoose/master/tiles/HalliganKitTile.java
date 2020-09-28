package commandrmoose.master.tiles;

import commandrmoose.master.blocks.MBlocks;
import commandrmoose.master.sounds.MSounds;
import jdk.nashorn.internal.ir.Block;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.sounds.TSounds;
import net.tardis.mod.tileentities.ConsoleTile;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;

import java.util.Random;


public class HalliganKitTile extends TileEntity implements ITickableTileEntity {

    public int time = 0;
    int second = 20;
    int minute = second * 60;
    int hour = minute * 60;
    SoundEvent[] calculationSounds = {TSounds.GENERIC_ONE, TSounds.GENERIC_TWO, TSounds.GENERIC_THREE};

    public int totalProcessTime = minute / 2;


    public HalliganKitTile() {
        super(MTiles.HALLIGAN_KIT);
    }


    @Override
    public void tick() {
        WorkTheMagic(getPos().north());
        WorkTheMagic(getPos().east());
        WorkTheMagic(getPos().west());
        WorkTheMagic(getPos().south());

    }

    void WorkTheMagic(BlockPos tilePos){
        if (getWorld().getTileEntity(tilePos) instanceof ExteriorTile) {
            ExteriorTile exterior = (ExteriorTile) getWorld().getTileEntity(tilePos);

            if (exterior.getLocked()) {
                time++;
                if (this.time > totalProcessTime) {
                    UnlockTARDIS(exterior);
                }

                Random rand = new Random();

                if(world.getGameTime() % 20 == 0) {
                    world.playSound(null, getPos(), calculationSounds[rand.nextInt(calculationSounds.length)], SoundCategory.BLOCKS, 0.25f, 1f);
                }

            }
        }
    }

    void UnlockTARDIS(ExteriorTile exterior){
        getWorld().playSound(null, getPos(), MSounds.THROTTLE_BLAST, SoundCategory.BLOCKS, 2f, 1f);
        exterior.setLocked(false);
        exterior.setDoorState(EnumDoorState.BOTH);

        //ServerWorld interior = getWorld().getServer().func_71218_a(exterior.getInterior());

        //TardisHelper.getConsoleInWorld(interior).ifPresent(tile -> {
        //    tile.getInteriorManager().setAlarmOn(true);
        //});

        getWorld().destroyBlock(getPos(), false);

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
