package commandrmoose.master.helpers;

import com.google.gson.internal.$Gson$Preconditions;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.tardis.mod.dimensions.TDimensions;
import net.tardis.mod.helper.PlayerHelper;
import net.tardis.mod.helper.TardisHelper;
import sun.nio.ch.Net;

import java.io.*;
import java.net.*;
import java.util.concurrent.atomic.AtomicReference;

public class NetworkHelper {

    public static void sendMessage(String msg) {

        try{
            Socket soc=new Socket("localhost",2004);
            DataOutputStream dout=new DataOutputStream(soc.getOutputStream());
            dout.writeBytes(msg);
            dout.flush();
            dout.close();
            soc.close();
        }catch(Exception e){
            e.printStackTrace();}
    }


    public static void onWorldTick(TickEvent.WorldTickEvent event) {

        if (event.world.getDimension().getType().getModType() == TDimensions.TARDIS) {
            TardisHelper.getConsoleInWorld(event.world).ifPresent(tile -> {
                if (event.world.getGameTime() % 20 == 0) {
                    if (tile.getInteriorManager().isAlarmOn()) {
                        NetworkHelper.sendMessage("alarmOn");
                    } else {
                        NetworkHelper.sendMessage("alarmOff");
                    }
                }


            });
        }

    }

}
