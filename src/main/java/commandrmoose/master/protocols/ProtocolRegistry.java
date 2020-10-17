package commandrmoose.master.protocols;

import commandrmoose.master.Master;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.tardis.mod.constants.Constants;
import net.tardis.mod.protocols.*;
import net.tardis.mod.registries.TardisRegistries;
import net.tardis.mod.tileentities.ConsoleTile;

public abstract class ProtocolRegistry extends Protocol {

    public static void registerAll() {
        TardisRegistries.registerRegisters(() -> {
            TardisRegistries.PROTOCOL_REGISTRY.register(new ResourceLocation(Master.MODID, "kill_rooms"), new RoomTerminator());
        });
    }

}
