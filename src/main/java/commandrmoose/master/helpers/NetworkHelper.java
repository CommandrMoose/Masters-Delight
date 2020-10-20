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
            Socket soc=new Socket("192.168.0.120",3001);
            DataOutputStream dout=new DataOutputStream(soc.getOutputStream());
            dout.writeBytes(msg);
            dout.flush();
            dout.close();
            soc.close();
        }catch(Exception e){
            e.printStackTrace();}
    }

}
