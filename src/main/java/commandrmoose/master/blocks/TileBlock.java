package commandrmoose.master.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class TileBlock extends Block {
    TileEntityType<?> type;

    public TileBlock(Block.Properties prop) {
        super(prop);
    }

    public void setTileEntity(TileEntityType<?> type) {
        this.type = type;
    }

    public boolean hasTileEntity(BlockState state) {
        return this.type != null;
    }

    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return this.type.create();
    }

    public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return 0;
    }

    public boolean isNormalCube(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return false;
    }

    public boolean causesSuffocation(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return false;
    }

    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT;
    }
}