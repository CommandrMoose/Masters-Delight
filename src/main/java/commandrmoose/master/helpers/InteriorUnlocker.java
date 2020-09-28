package commandrmoose.master.helpers;

import commandrmoose.master.Master;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.tardis.mod.ars.ConsoleRoom;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.helper.Helper;
import net.tardis.mod.sounds.TSounds;

import javax.annotation.Nullable;

public class InteriorUnlocker {

    public static void checkAchievementsForUnlock(EntityJoinWorldEvent event) {
        interiorAdvancementCheck(event, new ResourceLocation(Master.MODID,"interior/crystalline_interior"), new ResourceLocation(Master.MODID, "interior_crystalline"));
        interiorAdvancementCheck(event, new ResourceLocation(Master.MODID,"interior/victorian_interior"), new ResourceLocation(Master.MODID, "interior_victorian"));
        interiorAdvancementCheck(event, new ResourceLocation(Master.MODID,"interior/potent_interior"), new ResourceLocation(Master.MODID, "interior_potent"));
    }


    private static void interiorAdvancementCheck(EntityJoinWorldEvent event, ResourceLocation advancement, ResourceLocation interior)
    {
        if(event.getEntity() instanceof ServerPlayerEntity) {
            ServerPlayerEntity player = (ServerPlayerEntity)event.getEntity();

            Helper.doIfAdvancementPresentOther(advancement, player, () ->{
                TardisHelper.getConsoleInWorld(event.getWorld()).ifPresent(console -> {
                    ConsoleRoom room = ConsoleRoom.REGISTRY.get(interior);
                    net.tardis.mod.helper.Helper.unlockInterior(console, player, room);
                });
            });


        }

    }
}
