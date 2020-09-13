package net.minecraft.nbt;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

public class LongNBT extends NumberNBT {
   private long data;

   LongNBT() {
   }

   public LongNBT(long data) {
      this.data = data;
   }

   public void write(DataOutput output) throws IOException {
      output.writeLong(this.data);
   }

   public void read(DataInput input, int depth, NBTSizeTracker sizeTracker) throws IOException {
      sizeTracker.read(128L);
      this.data = input.readLong();
   }

   public byte getId() {
      return 4;
   }

   public String toString() {
      return this.data + "L";
   }

   public LongNBT copy() {
      return new LongNBT(this.data);
   }

   public boolean equals(Object p_equals_1_) {
      if (this == p_equals_1_) {
         return true;
      } else {
         return p_equals_1_ instanceof LongNBT && this.data == ((LongNBT)p_equals_1_).data;
      }
   }

   public int hashCode() {
      return (int)(this.data ^ this.data >>> 32);
   }

   public ITextComponent toFormattedComponent(String indentation, int indentDepth) {
      ITextComponent itextcomponent = (new StringTextComponent("L")).applyTextStyle(SYNTAX_HIGHLIGHTING_NUMBER_TYPE);
      return (new StringTextComponent(String.valueOf(this.data))).appendSibling(itextcomponent).applyTextStyle(SYNTAX_HIGHLIGHTING_NUMBER);
   }

   public long getLong() {
      return this.data;
   }

   public int getInt() {
      return (int)(this.data & -1L);
   }

   public short getShort() {
      return (short)((int)(this.data & 65535L));
   }

   public byte getByte() {
      return (byte)((int)(this.data & 255L));
   }

   public double getDouble() {
      return (double)this.data;
   }

   public float getFloat() {
      return (float)this.data;
   }

   public Number getAsNumber() {
      return this.data;
   }
}