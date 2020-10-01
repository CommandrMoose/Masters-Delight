package commandrmoose.master.sounds;

import commandrmoose.master.Master;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;
import net.tardis.mod.Tardis;

import javax.annotation.CheckForNull;
import java.util.HashMap;

@Mod.EventBusSubscriber(modid = Master.MODID, bus = Bus.MOD)
@ObjectHolder(Master.MODID)
public class MSounds {


    public static final SoundEvent DRILL_LOOP = null;
    public static final SoundEvent THROTTLE_BLAST = null;
    public static final SoundEvent ALERT_ALARM = null;
    public static final SoundEvent TIME_VORTEX = null;
    public static final SoundEvent BELL_RING = null;

    private static HashMap<ResourceLocation, ISoundScheme> SCHEMES = new HashMap<ResourceLocation, ISoundScheme>();

    @SubscribeEvent
    public static void registerSound(RegistryEvent.Register<SoundEvent> event){
        event.getRegistry().registerAll(
                // SOUNDS
            setUpSound("drill_loop"),
            setUpSound("throttle_blast"),
            setUpSound("alert_alarm"),
            setUpSound("time_vortex"),
            setUpSound("bell_ring")

        );
    }

    public static SoundEvent setUpSound(String soundName) {
        return new SoundEvent(new ResourceLocation(Master.MODID, soundName)).setRegistryName(soundName);
    }

    public static void registerSoundScheme(ResourceLocation loc, ISoundScheme scheme) {
        scheme.setRegistryName(loc);
        SCHEMES.put(loc, scheme);
    }

    @CheckForNull
    public static ISoundScheme getSoundByRegistryName(ISoundScheme scheme) {
        return SCHEMES.getOrDefault(scheme, null);
    }

}
