package commandrmoose.master.tiles;

import commandrmoose.master.blocks.TemporalSiphonBlock;
import commandrmoose.master.sounds.MSounds;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.sounds.TSounds;

import javax.annotation.Nullable;
import java.util.List;


public class TemporalSiphonTile extends TileEntity implements ITickableTileEntity {

    private float reduceNumber = 1f;

    public boolean isWorking;
    private float artronNumber;
    private boolean draining;

    public TemporalSiphonTile() {
        super(MTiles.TEMPORAL_SIPHON);
        this.isWorking = false;
    }


    @Override
    public void tick() {
        if (this.isWorking) {
            TardisHelper.getConsoleInWorld(this.world).ifPresent(tile -> {
                if (tile.getArtron() >= 1 && getArtronNumber() < 255) {
                    if(world.getGameTime() % 5 == 0) {
                        tile.setArtron(tile.getArtron() - this.reduceNumber);
                        artronNumber += this.reduceNumber;
                        this.world.playSound(null, this.getPos(), MSounds.DRILL_LOOP, SoundCategory.BLOCKS, 5f,1f);
                    }
                } else {
                    this.isWorking = false;
                    this.world.playSound(null, this.getPos(), TSounds.REACHED_DESTINATION, SoundCategory.BLOCKS, 5f,1f);

                }
            });
        }

        if (this.isDraining()) {
            TardisHelper.getConsoleInWorld(this.world).ifPresent(tile -> {
                if (getArtronNumber() > 0 && tile.getArtron() < tile.getMaxArtron()) {
                    if(world.getGameTime() % 5 == 0) {
                        tile.setArtron(tile.getArtron() + 1);
                        setArtronNumber(getArtronNumber() - 1);
                        this.world.playSound(null, this.getPos(), MSounds.DRILL_LOOP, SoundCategory.BLOCKS, 5f,0.7f);
                    }
                } else {
                    setDraining(false);
                    this.world.playSound(null, this.getPos(), TSounds.REACHED_DESTINATION, SoundCategory.BLOCKS, 5f,1f);

                }
            });
        }

    }



    public float getArtronNumber(){
        return this.artronNumber;
    }

    public void setArtronNumber(float artron){
        this.artronNumber = artron;
    }

    public void setDraining(boolean setDrain){
        this.draining = setDrain;
    }

    public boolean isDraining() {
        return this.draining;
    }

    @Override
    public void read(CompoundNBT compound){
        super.read(compound);
        this.artronNumber = compound.getFloat("stored_artron");
    }

    @Override
    public CompoundNBT write(CompoundNBT compound) {
        compound.putFloat("stored_artron", this.artronNumber);
        return super.write(compound);
    }

}
