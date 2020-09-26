package commandrmoose.master.blocks;

import net.minecraft.block.*;
import net.minecraft.fluid.IFluidState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.IProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.Direction;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;

public class HalliganKitBlock extends DirectionalBlock {
    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    public HalliganKitBlock(Properties prop, SoundType soundType, float hardness, float resistance){
        super(prop.sound(soundType).hardnessAndResistance(hardness,resistance));
    }

    @Override
    public boolean isNormalCube(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return false;
    }

    @Override
    public boolean causesSuffocation(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return false;
    }

    @Override
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT;
    }

    public BlockState getStateForPlacement(BlockItemUseContext context) {
        IFluidState fluid = context.getWorld().getFluidState(context.getPos());
        return (BlockState)((BlockState)((BlockState)super.getStateForPlacement(context).with(BlockStateProperties.HORIZONTAL_FACING, context.getPlayer().getHorizontalFacing().getOpposite())).with(BlockStateProperties.WATERLOGGED, fluid.getFluidState().isTagged(FluidTags.WATER))).with(BlockStateProperties.HANGING, context.getFace() == Direction.DOWN);
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(new IProperty[]{BlockStateProperties.WATERLOGGED});
        builder.add(new IProperty[]{BlockStateProperties.HORIZONTAL_FACING});
        builder.add(new IProperty[]{BlockStateProperties.HANGING});
    }

    public BlockState rotate(BlockState state, IWorld world, BlockPos pos, Rotation direction) {
        return (BlockState)state.with(BlockStateProperties.HORIZONTAL_FACING, direction.rotate((Direction)state.get(BlockStateProperties.HORIZONTAL_FACING)));
    }

}
