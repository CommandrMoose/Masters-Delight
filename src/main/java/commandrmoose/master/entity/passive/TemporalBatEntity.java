package commandrmoose.master.entity.passive;

import commandrmoose.master.entity.MEntities;
import net.minecraft.client.audio.Sound;
import net.minecraft.client.audio.SoundEngine;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.passive.BatEntity;
import net.minecraft.entity.passive.IFlyingAnimal;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;
import net.minecraftforge.client.event.sound.SoundEvent;
import net.tardis.mod.dimensions.TDimensions;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.sounds.TSounds;

import java.util.Random;

public class TemporalBatEntity extends BatEntity implements IFlyingAnimal {

    private int livingTime = 0;

    public TemporalBatEntity(EntityType<? extends BatEntity> p_i50290_1_, World p_i50290_2_) {
        super(p_i50290_1_, p_i50290_2_);
    }

    public TemporalBatEntity(World world) {this(MEntities.TEMPORAL_BAT, world);}

    @Override
    public boolean canSpawn(IWorld worldIn, SpawnReason spawnReasonIn) {
        return worldIn.getDimension().getType().getModType() == TDimensions.TARDIS && super.canSpawn(worldIn, spawnReasonIn);
    }

    @Override
    public boolean hitByEntity(Entity entityIn) {
        temporalJump();
        return super.hitByEntity(entityIn);
    }

    public void livingTick() {
        livingTime++;
        super.livingTick();

        Random rand = new Random();
        if(livingTime % ((10 + rand.nextInt(60)) * 20) == 0) {
            temporalJump();
        }

        TardisHelper.getConsoleInWorld(this.world).ifPresent(tile -> {
            float distance = (float) this.getPosition().distanceSq(tile.getPos());
            if (distance < 5 && livingTime % 20 == 0) {
                tile.setDestination(tile.getDestinationDimension(), new BlockPos(tile.getDestination().getX() + -100 + rand.nextInt(200), 64, tile.getDestination().getZ() + -100 + rand.nextInt(200)));
                tile.getWorld().playSound(null, tile.getPos(), TSounds.GENERIC_ONE, SoundCategory.BLOCKS, 1f, 0.8f + rand.nextInt(4) / 10);
            }

        });



    }

    private void temporalJump(){
        this.getEntityWorld().addParticle(ParticleTypes.CLOUD, this.getEntity().posX, this.getEntity().posY, this.getEntity().posZ, 0, 0, 0);
        this.getEntityWorld().playSound(null, getPosition(), TSounds.ELECTRIC_SPARK, SoundCategory.NEUTRAL, 1f,1f);
        remove();
    }

}
