package net.minecraft.world.gen.placement;

import com.mojang.datafixers.Dynamic;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import net.minecraft.util.math.BlockPos;

public class CountRange extends SimplePlacement<CountRangeConfig> {
   public CountRange(Function<Dynamic<?>, ? extends CountRangeConfig> p_i51357_1_) {
      super(p_i51357_1_);
   }

   public Stream<BlockPos> getPositions(Random random, CountRangeConfig p_212852_2_, BlockPos pos) {
      return IntStream.range(0, p_212852_2_.count).mapToObj((p_215061_3_) -> {
         int i = random.nextInt(16);
         int j = random.nextInt(p_212852_2_.maximum - p_212852_2_.topOffset) + p_212852_2_.bottomOffset;
         int k = random.nextInt(16);
         return pos.add(i, j, k);
      });
   }
}