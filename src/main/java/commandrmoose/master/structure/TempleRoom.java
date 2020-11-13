package commandrmoose.master.structure;

import commandrmoose.master.Master;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Mod.EventBusSubscriber(modid = Master.MODID)
public class TempleRoom {

    public static HashMap<ResourceLocation, TempleRoom> REGISTRY = new HashMap<>();
    public static ArrayList<TempleRoom> TEMPLES = new ArrayList<TempleRoom>();

    private ResourceLocation filepath;
    private Vec3i offset;

    public TempleRoom(ResourceLocation filepath, Vec3i offset) {
        this.filepath = filepath;
        this.offset = offset;
    }


    public static TempleRoom ROOM_A;
    public static TempleRoom ROOM_B;
    public static TempleRoom CORRIDOR_SMALL;

    @SubscribeEvent
    public static void registerTempleRooms(FMLServerStartingEvent event) {

       ROOM_A = register(new TempleRoom(new ResourceLocation(Master.MODID, "tardis/structures/temple/large_room_a"), new Vec3i(16,3,0)), "grand_room");
       ROOM_B = register(new TempleRoom(new ResourceLocation(Master.MODID, "tardis/structures/temple/large_room_b"), new Vec3i(14,3,0)), "grand_room_other");
       CORRIDOR_SMALL = register(new TempleRoom(new ResourceLocation(Master.MODID, "tardis/structures/temple/corridor_piece"), new Vec3i(5,3,0)), "corridor_piece");

    }


    public static TempleRoom register(TempleRoom room, String registryName) {
        REGISTRY.put(new ResourceLocation(Master.MODID, registryName), room);
        TEMPLES.add(room);
        return room;
    }


    public ResourceLocation getFilepath(){
        return this.filepath;
    }

    public Vec3i getOffset(){
        return this.offset;
    }


}
