package commandrmoose.master.events;

import commandrmoose.master.Master;
import commandrmoose.master.sounds.MSounds;
import net.minecraft.client.GameConfiguration;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerModelPart;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundCategory;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.tardis.mod.controls.CommunicatorControl;
import net.tardis.mod.controls.HandbrakeControl;
import net.tardis.mod.controls.IControl;
import net.tardis.mod.controls.ThrottleControl;
import net.tardis.mod.dimensions.TDimensions;
import net.tardis.mod.entity.ControlEntity;
import net.tardis.mod.entity.DalekEntity;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.sounds.TSounds;
import net.tardis.mod.tileentities.ConsoleTile;

@Mod.EventBusSubscriber(modid = Master.MODID)
public class CommonEvents {

    @SubscribeEvent
    public static void onAttack(AttackEntityEvent event) {
        if (event.getTarget() instanceof ControlEntity){
            ControlEntity entity = (ControlEntity) event.getTarget();

            // Throttle Umph sound.
            if (entity.getControl() instanceof ThrottleControl) {
                if (entity.getControl().getConsole().canFly() && !entity.getControl().getConsole().isInFlight() && !event.getPlayer().isSneaking()){
                    IControl control = entity.getControl().getConsole().getControl(HandbrakeControl.class);
                    // Check to make sure the handbreak isn't on.
                    if (control instanceof HandbrakeControl){
                        if (((HandbrakeControl) control).isFree()) {
                            event.getTarget().world.playSound(null, entity.getControl().getConsole().getPos(), MSounds.THROTTLE_BLAST, SoundCategory.BLOCKS, 0.4f,1f);
                        }
                    }
                }
            }
        }
    }
}
