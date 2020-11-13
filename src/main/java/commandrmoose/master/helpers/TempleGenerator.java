package commandrmoose.master.helpers;

import commandrmoose.master.structure.TempleRoom;
import net.minecraft.block.Blocks;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.EnderChestTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.concurrent.TickDelayedTask;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.server.ServerWorld;
import net.tardis.mod.helper.Helper;
import net.tardis.mod.helper.TardisHelper;

import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Stream;

public class TempleGenerator {

    boolean test;


    public static void GenerateTemple(ServerWorld world){

        System.out.println("Beginning to Generate Temple");
        TempleRoom room = TempleRoom.ROOM_A;

        Template template = world.getStructureTemplateManager().getTemplate(room.getFilepath());
        template.addBlocksToWorld(world, new BlockPos(0,128,0).subtract(room.getOffset()), new PlacementSettings().setIgnoreEntities(false));

        world.getServer().enqueue(new TickDelayedTask(1, () -> {
            for (int i = -25; i <= 25; ++i) {
                for (int j = -25; j <= 25; ++j) {
                    Chunk chunk = world.getChunk(i, j);

                    for (TileEntity tileEntity : chunk.getTileEntityMap().values()) {
                        if (tileEntity instanceof EnderChestTileEntity) {

                            GenerateRoom(world);

                            for (TileEntity tileEntity2 : chunk.getTileEntityMap().values()) {
                                if (tileEntity2 instanceof EnderChestTileEntity) {
                                    GenerateRoom(world);

                                    for (TileEntity tileEntity3 : chunk.getTileEntityMap().values()) {
                                        if (tileEntity3 instanceof EnderChestTileEntity) {
                                            GenerateRoom(world);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }));
    }


    static void GenerateRoom(ServerWorld world){

        if (!world.isRemote()) {
            world.getServer().enqueue(new TickDelayedTask(1, () -> {
                for (int i = -15; i <= 15; ++i) {
                    for (int j = -15; j <= 15; ++j) {
                        Chunk chunk = world.getChunk(i, j);

                        for (TileEntity tileEntity : chunk.getTileEntityMap().values()) {
                            if (tileEntity instanceof EnderChestTileEntity) {
                                Random rand = new Random();

                                System.out.println("The size is: " + TempleRoom.TEMPLES.size());

                                int getID = rand.nextInt((TempleRoom.TEMPLES.size() / 2) );
                                if (getID < 0) {
                                    getID = 0;
                                }

                                TempleRoom room1 = TempleRoom.TEMPLES.get(getID);

                                Direction dir = tileEntity.getWorld().getBlockState(tileEntity.getPos()).get(BlockStateProperties.HORIZONTAL_FACING);
                                Vec3i converted = room1.getOffset();
                                BlockPos offset = Helper.rotateBlockPos(new BlockPos(converted.getX(), converted.getY(), converted.getZ()), dir);

                                Template template1 = world.getStructureTemplateManager().getTemplate(room1.getFilepath());

                                BlockPos tilestartingPos = tileEntity.getPos();
                                BlockPos tileoffset = tileEntity.getPos().add(Helper.rotateBlockPos(new BlockPos(room1.getOffset()), dir)).add(Helper.rotateBlockPos(new BlockPos(0,0,1), dir));

                                BlockPos startingPos = tilestartingPos.add(-1, 0, tileoffset.getX());

                                BlockPos endingPos = tileEntity.getPos().add(Helper.rotateBlockPos(template1.getSize().north().west(), dir));

                                if (IsEmpty(world, startingPos, endingPos)){
                                    template1.addBlocksToWorld(world, tileEntity.getPos().subtract(offset), new PlacementSettings().setIgnoreEntities(false).setRotation(Helper.getRotationFromDirection(dir)));
                                } else {
                                    TryGenerateCorridor(world, tileEntity, dir);
                                }
                            }
                        }
                    }
                }
            }));
        }
    }

    static boolean IsEmpty(ServerWorld world, BlockPos pos, BlockPos endPos) {

        for(BlockPos check : BlockPos.getAllInBoxMutable(pos, endPos)) {
            if(!world.getBlockState(check).isAir(world, check)) {
                return false;
            }
        }


        return true;
    }

    static void TryGenerateCorridor(ServerWorld world, TileEntity tileEntity, Direction direction){
        TempleRoom corridor = TempleRoom.CORRIDOR_SMALL;
        Template room = world.getStructureTemplateManager().getTemplate(corridor.getFilepath());


        BlockPos tilestartingPos = tileEntity.getPos();
        BlockPos tileoffset = tileEntity.getPos().add(Helper.rotateBlockPos(new BlockPos(corridor.getOffset()), direction)).add(Helper.rotateBlockPos(new BlockPos(0,0,1), direction));

        System.out.println("PING: " + tileoffset.getX());
        BlockPos startingPos = tilestartingPos.add(-1, 0, tileoffset.getX());

        BlockPos endingPos = tileEntity.getPos().add(Helper.rotateBlockPos(room.getSize().north().west(), direction));

        Vec3i converted = corridor.getOffset();
        BlockPos offset = Helper.rotateBlockPos(new BlockPos(converted.getX(), converted.getY(), converted.getZ()), direction);

        if (IsEmpty(world, startingPos, endingPos)){
            room.addBlocksToWorld(world, tileEntity.getPos().subtract(offset), new PlacementSettings().setIgnoreEntities(false).setRotation(Helper.getRotationFromDirection(direction)));
        }


    }


}
