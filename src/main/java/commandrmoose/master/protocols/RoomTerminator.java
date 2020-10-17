package commandrmoose.master.protocols;

import commandrmoose.master.sounds.MSounds;
import jdk.nashorn.internal.ir.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.EndPortalTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.concurrent.TickDelayedTask;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.tardis.mod.blocks.TBlocks;
import net.tardis.mod.client.guis.monitors.IMonitorGui;
import net.tardis.mod.client.guis.monitors.InteriorEditScreen;
import net.tardis.mod.protocols.Protocol;
import net.tardis.mod.sounds.TSounds;
import net.tardis.mod.tileentities.ConsoleTile;
import net.tardis.mod.tileentities.CorridorKillTile;

import java.util.Iterator;
import java.util.Random;

public class RoomTerminator extends Protocol {

    public static TranslationTextComponent TRANSLATION = new TranslationTextComponent("protocol.master.deleteroom");

    @Override
    public void call(World world, PlayerEntity playerEntity, ConsoleTile consoleTile) {
        playerEntity.getEntityWorld().playSound(null, playerEntity.getPosition(), MSounds.BELL_RING, SoundCategory.BLOCKS, 1f, 1f);
        killAllRooms(consoleTile, playerEntity);
    }

    @Override
    public String getDisplayName() {
        return TRANSLATION.getFormattedText();
    }

    public String getSubmenu() {
        return "interior";
    }

    public void killAllRooms(ConsoleTile tile, PlayerEntity player){
        if (tile.getWorld() != null) {
            for(int i = -30; i <= 30; ++i) {
                for(int j = -30; j <= 30; ++j) {
                    Chunk chunk = tile.getWorld().getChunk(i, j);
                    for(TileEntity tileentity : chunk.getTileEntityMap().values()) {
                        if (tileentity instanceof CorridorKillTile) {
                            CorridorKillTile corridorKill = (CorridorKillTile) tileentity;

                            CompoundNBT tag = corridorKill.getUpdateTag();
                            BlockPos start = BlockPos.fromLong(tag.getLong("start"));
                            BlockPos end = BlockPos.fromLong(tag.getLong("end"));

                            // Start deleting the room.

                            if (!tile.getWorld().isRemote()) {
                                tile.getWorld().getServer().enqueue(new TickDelayedTask(1, () -> {

                                    Iterator var1 = BlockPos.getAllInBoxMutable(start, end).iterator();
                                    while(var1.hasNext()) {
                                        BlockPos pos = (BlockPos)var1.next();
                                        tile.getWorld().setBlockState(pos, Blocks.AIR.getDefaultState());
                                    }

                                    Iterator playerEntity = tile.getWorld().getEntitiesWithinAABB(ServerPlayerEntity.class, new AxisAlignedBB(start, end)).iterator();

                                    while (playerEntity.hasNext()) {
                                        Random rand = new Random();
                                        ServerPlayerEntity playerToTP = (ServerPlayerEntity) playerEntity.next();
                                        playerToTP.connection.setPlayerLocation(rand.doubles(-2, 2).findFirst().getAsDouble(), 129.0D, rand.doubles(-2, 2).findFirst().getAsDouble(), playerToTP.rotationYaw, playerToTP.rotationPitch);
                                        playerToTP.sendStatusMessage(new TranslationTextComponent("ars.message.room.deleted", new Object[0]), false);
                                        playerToTP.world.playSound((PlayerEntity)null, player.getPosition(), SoundEvents.ENTITY_SHULKER_TELEPORT, SoundCategory.PLAYERS, 1.0F, 1.0F);
                                    }
                                }));
                            }

                            // Once the room is done, replace the corridor blocker.

                            BlockPos corridorRestorePoint = new BlockPos(0, 129, -30);
                            BlockPos roomStarterPoint = new BlockPos(0, 129, -30);

                            for(int x = -1; x <= 1; ++x) {
                                for(int y = -1; y < 3; ++y) {
                                    tile.getWorld().setBlockState(corridorRestorePoint.add(x, y, 0), TBlocks.tech_wall_dark_blank.getDefaultState());
                                }
                            }

                            tile.getWorld().setBlockState(roomStarterPoint, TBlocks.corridor_spawn.getDefaultState());

                        }
                    }
                }
            }
        }
    }
}

