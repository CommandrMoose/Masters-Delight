package commandrmoose.master.entity.adventure;

import commandrmoose.master.entity.MEntities;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.item.ArmorStandEntity;
import net.minecraft.entity.passive.BatEntity;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.DamageSource;
import net.minecraft.world.Difficulty;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;

public class WatcherEntity extends CreatureEntity {

    private float view = 0f;
    private float viewRange = 25f;
    int aliveTick = 0;

    public WatcherEntity(EntityType<? extends WatcherEntity> p_i50290_1_, World p_i50290_2_) {
        super(p_i50290_1_, p_i50290_2_);
    }

    public WatcherEntity(World world) {this(MEntities.WATCHER, world);}

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new LookAtGoal(this, PlayerEntity.class, 50.0F));

    }

    @Override
    public boolean canBreatheUnderwater() {
        return true;
    }

    @Override
    public boolean canRenderOnFire() {
        return false;
    }

    @Override
    public boolean isInvulnerableTo(DamageSource source) {
        return super.isInvulnerableTo(source);
    }

    @Override
    public boolean canSpawn(IWorld worldIn, SpawnReason spawnReasonIn) {
        return worldIn.getDifficulty() != Difficulty.PEACEFUL && super.canSpawn(worldIn, spawnReasonIn);
    }

    @Override
    public void tick() {
        super.tick();

        aliveTick++;
        if (aliveTick == 1) {
            Random rand = new Random();
            if (rand.nextInt(100) > 1) {
                remove();
            }
        }


        if (aliveTick < 60) {
            PlayerEntity player = this.getEntity().getEntityWorld().getClosestPlayer(this, viewRange);
            if (player != null) {
                float distance = player.getDistance(this);
                view = (distance - 15) / viewRange;

                if (distance < 15) {
                    remove();
                }

            } else {
                view = 1f;
            }
        }


    }

    public float getView() {
        return view;
    }
}
