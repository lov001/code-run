package revision;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TappingRainWaterTest {

   TappingRainWater classObj = new TappingRainWater();

   @Test
   void test_getTrappedWater_expect10_whenNIs6() {
      long[] input = {3, 0, 0, 2, 0, 4};
      Assertions.assertEquals(10, classObj.getTrappedWaterBruteForce(input, 6));
      Assertions.assertEquals(10, classObj.getTrappedWaterPreCompute(input, 6));
      Assertions.assertEquals(10, classObj.getTrappedWater(input, 6));
   }

   @Test
   void test_getTrappedWater_expect2_whenNIs4() {
      long[] input = {2, 1, 1, 4};
      Assertions.assertEquals(2, classObj.getTrappedWaterBruteForce(input, 4));
      Assertions.assertEquals(2, classObj.getTrappedWaterPreCompute(input, 4));
      Assertions.assertEquals(2, classObj.getTrappedWater(input, 4));
   }

   @Test
   void test_getTrappedWater_expect9_whenNIs5() {
      long[] input = {8, 1, 8, 2, 4};
      Assertions.assertEquals(9, classObj.getTrappedWaterBruteForce(input, 5));
      Assertions.assertEquals(9, classObj.getTrappedWaterPreCompute(input, 5));
      Assertions.assertEquals(9, classObj.getTrappedWater(input, 5));
   }
}
