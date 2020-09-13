package net.minecraft.world.gen.placement;

import com.mojang.datafixers.Dynamic;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import net.minecraft.util.math.BlockPos;

public class HeightBiasedRange extends SimplePlacement<CountRangeConfig> {
   public HeightBiasedRange(Function<Dynamic<?>, ? extends CountRangeConfig> p_i51388_1_) {
      super(p_i51388_1_);
   }

   public Stream<BlockPos> getPositions(Random random, CountRangeConfig p_212852_2_, BlockPos pos) {
      return IntStream.range(0, p_212852_2_.count).mapToObj((p_215057_3_) -> {
         int i = random.nextInt(16);
         int j = random.nextInt(random.nextInt(p_212852_2_.maximum - p_212852_2_.topOffset) + p_212852_2_.bottomOffset);
         int k = random.nextInt(16);
         return pos.add(i, j, k);
      });
   }
}