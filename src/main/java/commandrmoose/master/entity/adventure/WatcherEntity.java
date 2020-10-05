package commandrmoose.master.entity.adventure;

import com.mojang.authlib.GameProfile;
import commandrmoose.master.entity.MEntities;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.item.ArmorStandEntity;
import net.minecraft.entity.passive.BatEntity;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class WatcherEntity extends CreatureEntity {

    public WatcherEntity(EntityType<? extends WatcherEntity> p_i50290_1_, World p_i50290_2_) {
        super(p_i50290_1_, p_i50290_2_);
    }

    public WatcherEntity(World world) {this(MEntities.WATCHER, world);}

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new LookAtGoal(this, PlayerEntity.class, 50.0F));

    }
}
