package commandrmoose.master.entity.passive;

import commandrmoose.master.entity.MEntities;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.BatEntity;
import net.minecraft.entity.passive.IFlyingAnimal;
import net.minecraft.world.World;

public class TemporalBatEntity extends BatEntity implements IFlyingAnimal {

    public TemporalBatEntity(EntityType<? extends BatEntity> p_i50290_1_, World p_i50290_2_) {
        super(p_i50290_1_, p_i50290_2_);
    }

    public TemporalBatEntity(World world) {this(MEntities.TEMPORAL_BAT, world);}
}
