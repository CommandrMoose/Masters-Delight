package commandrmoose.master.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class ToasterBlock extends Block {

    public ToasterBlock(Properties prop, SoundType soundType, float hardness, float resistance){
        super(prop.sound(soundType).hardnessAndResistance(hardness,resistance));
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
        return BlockRenderLayer.CUTOUT;
    }


}
