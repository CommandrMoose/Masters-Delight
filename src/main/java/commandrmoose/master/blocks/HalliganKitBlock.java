package commandrmoose.master.blocks;

import commandrmoose.master.Master;
import commandrmoose.master.itemgroups.MItemGroups;
import commandrmoose.master.other.IMakeItem;
import commandrmoose.master.sounds.MSounds;
import commandrmoose.master.tiles.HalliganKitTile;
import commandrmoose.master.tiles.TemporalSiphonTile;
import net.minecraft.block.*;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.IFluidState;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.IProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.FluidTags;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.tardis.mod.helper.Helper;
import net.tardis.mod.helper.PlayerHelper;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.helper.VoxelShapeUtils;

import static net.tardis.mod.blocks.ArtronTapBlock.createVoxelShape;

public class HalliganKitBlock extends TileBlock implements IMakeItem {

    private BlockItem BLOCKITEM = new BlockItem(this, new Item.Properties().group(MItemGroups.MAIN));

    public static final VoxelShape NORTH = createVoxelShape();
    public static final VoxelShape EAST = VoxelShapeUtils.rotate(createVoxelShape(), Rotation.CLOCKWISE_90);
    public static final VoxelShape SOUTH = VoxelShapeUtils.rotate(createVoxelShape(), Rotation.CLOCKWISE_180);
    public static final VoxelShape WEST = VoxelShapeUtils.rotate(createVoxelShape(), Rotation.COUNTERCLOCKWISE_90);

    public HalliganKitBlock(Properties prop, SoundType soundType, float hardness, float resistance){
        super(prop.sound(soundType).hardnessAndResistance(hardness,resistance));
    }

    @Override
    public Item getItem() {
        return BLOCKITEM;
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
        return (BlockState)((BlockState)((BlockState)super.getStateForPlacement(context).with(BlockStateProperties.HORIZONTAL_FACING, context.getPlayer().getHorizontalFacing().getOpposite())).with(BlockStateProperties.WATERLOGGED, fluid.getFluidState().isTagged(FluidTags.WATER)));
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(new IProperty[]{BlockStateProperties.WATERLOGGED});
        builder.add(new IProperty[]{BlockStateProperties.HORIZONTAL_FACING});
    }

    public BlockState rotate(BlockState state, IWorld world, BlockPos pos, Rotation direction) {
        return (BlockState)state.with(BlockStateProperties.HORIZONTAL_FACING, direction.rotate((Direction)state.get(BlockStateProperties.HORIZONTAL_FACING)));
    }

    @Override
    public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
        if(!worldIn.isRemote){

            if (player.isCreative()) {
                return;
            } else {
                TileEntity tileentity = worldIn.getTileEntity(pos);
                if (tileentity instanceof HalliganKitTile) {

                    ItemStack item = new ItemStack(MBlocks.halligan_kit);
                    ItemEntity itementity = new ItemEntity(worldIn, (double)pos.getX(), (double)pos.getY(), (double)pos.getZ(), item);
                    itementity.setDefaultPickupDelay();
                    worldIn.addEntity(itementity);
                }
            }
        }
    }

    public static VoxelShape createVoxelShape() {
        VoxelShape shape = VoxelShapes.create(0.1, 0, 0.6, 0.9, 1, 1);
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

}
