package practice.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxConsecutiveOnesTest {

   MaxConsecutiveOnes classObj = new MaxConsecutiveOnes();

   @Test
   void test_consecutiveOnes_expect3_whenNIs8() {
      int[] input = {0, 1, 1, 0, 0, 1, 1, 1};
      Assertions.assertEquals(3, classObj.consecutiveOnes(8, input));
   }

   @Test
   void test_consecutiveOnes_expect2whenNIs4() {
      int[] input = {0, 1, 1, 0};
      Assertions.assertEquals(2, classObj.consecutiveOnes(4, input));
   }
}
