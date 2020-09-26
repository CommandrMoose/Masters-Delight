package commandrmoose.master.sounds;

import net.minecraft.util.ResourceLocation;
import net.tardis.mod.tileentities.ConsoleTile;

public interface ISoundScheme {


    void playFlightLoop(ConsoleTile console);
    void playInteriorTakeOff(ConsoleTile console);
    void playExteriorTakeOff(ConsoleTile console);
    void playInteriorLand(ConsoleTile console);
    void playExteriorLand(ConsoleTile console);
    void playInteriorLandAfter(ConsoleTile console);

    //Use these in most cases
    void playTakeoffSounds(ConsoleTile console);
    void playLandSounds(ConsoleTile console);

    /*
     * Should be zero only if you enjoy / by zero errors
     */
    int getLoopTime();
    int getLandTime();
    int getTakeoffTime();

    ISoundScheme setRegistryName(ResourceLocation name);
    ResourceLocation getRegistryName();


}
