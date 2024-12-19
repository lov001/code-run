package practice.slidingwindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySubArraysWithSumTest {

   BinarySubArraysWithSum classObj = new BinarySubArraysWithSum();

   @Test
   void test_numSubArraysWithSum_expect4_whenNIs5AndGoalIs2() {
      int[] input = {1, 0, 1, 0, 1};
      Assertions.assertEquals(4, classObj.numSubArraysWithSum(input, 2));
   }

   @Test
   void test_numSubArraysWithSum_expect15_whenNIs5AndGoalIs0() {
      int[] input = {0, 0, 0, 0, 0};
      Assertions.assertEquals(15, classObj.numSubArraysWithSum(input, 0));
   }
}
