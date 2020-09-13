package net.minecraft.client.renderer;

import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.platform.GlStateManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class GLAllocation {
   public static synchronized int generateDisplayLists(int range) {
      int i = GlStateManager.genLists(range);
      if (i == 0) {
         int j = GlStateManager.getError();
         String s = "No error code reported";
         if (j != 0) {
            s = GLX.getErrorString(j);
         }

         throw new IllegalStateException("glGenLists returned an ID of 0 for a count of " + range + ", GL error (" + j + "): " + s);
      } else {
         return i;
      }
   }

   public static synchronized void deleteDisplayLists(int list, int range) {
      GlStateManager.deleteLists(list, range);
   }

   public static synchronized void deleteDisplayLists(int list) {
      deleteDisplayLists(list, 1);
   }

   public static synchronized ByteBuffer createDirectByteBuffer(int capacity) {
      return ByteBuffer.allocateDirect(capacity).order(ByteOrder.nativeOrder());
   }

   public static FloatBuffer createDirectFloatBuffer(int capacity) {
      return createDirectByteBuffer(capacity << 2).asFloatBuffer();
   }
}