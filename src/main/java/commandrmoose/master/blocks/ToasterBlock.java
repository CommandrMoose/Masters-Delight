package commandrmoose.master.blocks;

import commandrmoose.master.itemgroups.MItemGroups;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.DirectionalBlock;
import net.minecraft.block.SoundType;
import net.minecraft.fluid.IFluidState;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.Item;
import net.minecraft.state.IProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.tardis.mod.helper.VoxelShapeUtils;
import net.tardis.mod.misc.INeedItem;

public class ToasterBlock extends DirectionalBlock implements INeedItem {

    private BlockItem BLOCKITEM = new BlockItem(this, new Item.Properties().group(MItemGroups.MAIN));

    public static final VoxelShape NORTH = createVoxelShape();
    public static final VoxelShape EAST = VoxelShapeUtils.rotate(createVoxelShape(), Rotation.CLOCKWISE_90);
    public static final VoxelShape SOUTH = VoxelShapeUtils.rotate(createVoxelShape(), Rotation.CLOCKWISE_180);
    public static final VoxelShape WEST = VoxelShapeUtils.rotate(createVoxelShape(), Rotation.COUNTERCLOCKWISE_90);


    public ToasterBlock(Properties prop, SoundType soundType, float hardness, float resistance){
        super(prop.sound(soundType).hardnessAndResistance(hardness,resistance));
    }

    @Override
    public Item getItem() {
        return BLOCKITEM;
    }

    @Override
    public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {return 7;}

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
        return BlockRenderLayer.CUTOUT_MIPPED;
    }

    public static VoxelShape createVoxelShape() {
        VoxelShape shape = VoxelShapes.create(0.078125, 0, 0.21, 0.875, 0.359, 0.781);
        return shape;
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        switch(state.get(BlockStateProperties.HORIZONTAL_FACING)) {
            case EAST: return EAST;
            case SOUTH: return SOUTH;
            case WEST: return WEST;
            default: return NORTH;
        }
    }

    public BlockState getStateForPlacement(BlockItemUseContext context) {
        IFluidState fluid = context.getWorld().getFluidState(context.getPos());
        return (BlockState)((BlockState)((BlockState)super.getStateForPlacement(context).with(BlockStateProperties.HORIZONTAL_FACING, context.getPlayer().getHorizontalFacing().getOpposite())).with(BlockStateProperties.WATERLOGGED, fluid.getFluidState().isTagged(FluidTags.WATER)));
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(new IProperty[]{BlockStateProperties.WATERLOGGED});
        builder.add(new IProperty[]{BlockStateProperties.HORIZONTAL_FACING});
    }


}
