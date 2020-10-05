package commandrmoose.master.blocks.exteriors;

import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.util.BlockRenderLayer;
import net.tardis.mod.blocks.ExteriorBlock;

public class BoothExteriorBlock extends ExteriorBlock {


    @Override
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT;
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

}
