package commandrmoose.master.entity.aggressive;

import commandrmoose.master.entity.MEntities;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.controller.MovementController;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.monster.SlimeEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

import java.util.EnumSet;

public class TempleGolemEntity extends IronGolemEntity {


    public TempleGolemEntity(EntityType<? extends IronGolemEntity> type, World worldIn) {
        super(type, worldIn);

        this.moveController = new TempleGolemEntity.MoveHelperController(this);

        this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue((double)(20));
        this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue((double)(0.5f));

    }

    public TempleGolemEntity(World world) {this(MEntities.TEMPLEGOLEM, world);}

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(1, new TempleGolemEntity.AttackGoal(this));
        this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 0.5f, false));
        this.goalSelector.addGoal(2, new LookRandomlyGoal(this));
        this.goalSelector.addGoal(5, new TempleGolemEntity.HopGoal(this));

        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, 10, true, false, (p_213811_1_) -> {
            return Math.abs(p_213811_1_.posY - this.posY) <= 4.0D;
        }));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, IronGolemEntity.class, true));
    }


    protected boolean makesSoundOnJump() {
        return true;
    }

    protected SoundEvent getJumpSound() {
        return SoundEvents.BLOCK_ANVIL_LAND;
    }

    protected int getJumpDelay() {
        return this.rand.nextInt(20) + 10;
    }

    static class HopGoal extends Goal {
        private final TempleGolemEntity tg;

        public HopGoal(TempleGolemEntity slimeIn) {
            this.tg = slimeIn;
            this.setMutexFlags(EnumSet.of(Goal.Flag.JUMP, Goal.Flag.MOVE));
        }

        public boolean shouldExecute() {
            return !this.tg.isPassenger();
        }

        public void tick() {
            ((TempleGolemEntity.MoveHelperController)this.tg.getMoveHelper()).setSpeed(1.0D);
        }
    }


    static class AttackGoal extends Goal {
        private final TempleGolemEntity slime;
        private int growTieredTimer;

        public AttackGoal(TempleGolemEntity slimeIn) {
            this.slime = slimeIn;
            this.setMutexFlags(EnumSet.of(Goal.Flag.LOOK));
        }

        public boolean shouldExecute() {
            LivingEntity livingentity = this.slime.getAttackTarget();
            if (livingentity == null) {
                return false;
            } else if (!livingentity.isAlive()) {
                return false;
            } else {
                return livingentity instanceof PlayerEntity && ((PlayerEntity)livingentity).abilities.disableDamage ? false : this.slime.getMoveHelper() instanceof TempleGolemEntity.MoveHelperController;
            }
        }

        public void startExecuting() {
            this.growTieredTimer = 300;
            super.startExecuting();
        }

        public boolean shouldContinueExecuting() {
            LivingEntity livingentity = this.slime.getAttackTarget();
            if (livingentity == null) {
                return false;
            } else if (!livingentity.isAlive()) {
                return false;
            } else if (livingentity instanceof PlayerEntity && ((PlayerEntity)livingentity).abilities.disableDamage) {
                return false;
            } else {
                return --this.growTieredTimer > 0;
            }
        }

        public void tick() {
            this.slime.faceEntity(this.slime.getAttackTarget(), 10.0F, 10.0F);
            ((TempleGolemEntity.MoveHelperController)this.slime.getMoveHelper()).setDirection(this.slime.rotationYaw, this.slime.canDamagePlayer());
        }
    }

    private boolean canDamagePlayer() {
        return true;
    }


    static class MoveHelperController extends MovementController {
        private float yRot;
        private int jumpDelay;
        private final TempleGolemEntity golemEntity;
        private boolean isAggressive;

        public MoveHelperController(TempleGolemEntity tge) {
            super(tge);
            this.golemEntity = tge;
            this.yRot = 180.0F * tge.rotationYaw / (float)Math.PI;
        }

        public void setDirection(float yRotIn, boolean aggressive) {
            this.yRot = yRotIn;
            this.isAggressive = aggressive;
        }

        public void setSpeed(double speedIn) {
            this.speed = speedIn;
            this.action = MovementController.Action.MOVE_TO;
        }

        public void tick() {
            this.mob.rotationYaw = this.limitAngle(this.mob.rotationYaw, this.yRot, 90.0F);
            this.mob.rotationYawHead = this.mob.rotationYaw;
            this.mob.renderYawOffset = this.mob.rotationYaw;
            if (this.action != MovementController.Action.MOVE_TO) {
                this.mob.setMoveForward(0.0F);
            } else {
                this.action = MovementController.Action.WAIT;
                if (this.mob.onGround) {
                    this.mob.setAIMoveSpeed((float)(this.speed * this.mob.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getValue()));
                    if (this.jumpDelay-- <= 0) {
                        this.jumpDelay = this.golemEntity.getJumpDelay();
                        if (this.isAggressive) {
                            this.jumpDelay /= 7;
                        }

                        this.golemEntity.getJumpController().setJumping();
                        if (this.golemEntity.makesSoundOnJump()) {
                            this.golemEntity.playSound(this.golemEntity.getJumpSound(), this.golemEntity.getSoundVolume(), ((this.golemEntity.getRNG().nextFloat() - this.golemEntity.getRNG().nextFloat()) * 0.2F + 1.0F) * 0.8F);
                        }
                    } else {
                        this.golemEntity.moveStrafing = 0.0F;
                        this.golemEntity.moveForward = 0.0F;
                        this.mob.setAIMoveSpeed(0.0F);
                    }
                } else {
                    this.mob.setAIMoveSpeed((float)(this.speed * this.mob.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getValue()));
                }

            }
        }
    }

}
