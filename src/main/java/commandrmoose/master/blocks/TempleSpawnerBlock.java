package commandrmoose.master.blocks;

import commandrmoose.master.helpers.TempleGenerator;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class TempleSpawnerBlock extends Block {

    public TempleSpawnerBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void onBlockAdded(BlockState state, World worldIn, BlockPos pos, BlockState oldState, boolean isMoving) {
        if (!worldIn.isRemote) {

            TempleGenerator.GenerateTemple(worldIn.getServer().func_71218_a(worldIn.getDimension().getType()));

        }
    }


}
