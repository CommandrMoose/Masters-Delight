package commandrmoose.master.damagesrc;

import commandrmoose.master.Master;
import net.minecraft.util.DamageSource;

public class MDamageSource {

    public static final DamageSource ELECTRICITY = new DamageSource(Master.MODID + ":electricity").setDamageIsAbsolute();

}
