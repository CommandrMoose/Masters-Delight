package commandrmoose.master.tiles.exterior;

import commandrmoose.master.tiles.MTiles;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.math.AxisAlignedBB;
import net.tardis.mod.exterior.IExterior;
import net.tardis.mod.tileentities.TTiles;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;

public class BoothExteriorTile extends ExteriorTile{

    public static final AxisAlignedBB RENDER_BOX = new AxisAlignedBB(-2, -2, -2, 2, 5, 2);

    public static final AxisAlignedBB NORTH_BOX = new AxisAlignedBB(0, -1, -0.1, 1, 2, 1);
    public static final AxisAlignedBB EAST_BOX = new AxisAlignedBB(0, -1, 0, 1.1, 2, 1);
    public static final AxisAlignedBB SOUTH_BOX = new AxisAlignedBB(0, -1, 0, 1, 2, 1.1);
    public static final AxisAlignedBB WEST_BOX = new AxisAlignedBB(-0.1, -1, 0, 1, 2, 1);

    public BoothExteriorTile(TileEntityType<BoothExteriorTile> tileEntityTypeIn) {
        super(tileEntityTypeIn);
    }

    /*public BoothExteriorTile() {
        super(MTiles.EXTERIOR_BOOTH);
    }*/


    public void tick() {

        System.out.println("Ticking");

    }

    @Override
    public AxisAlignedBB getDoorAABB() {
        if(world.getBlockState(getPos()).has(BlockStateProperties.HORIZONTAL_FACING)) {
            switch(world.getBlockState(getPos()).get(BlockStateProperties.HORIZONTAL_FACING)) {
                case EAST: return EAST_BOX;
                case SOUTH: return SOUTH_BOX;
                case WEST: return WEST_BOX;
                default: return NORTH_BOX;
            }
        }
        return NORTH_BOX;
    }

}
