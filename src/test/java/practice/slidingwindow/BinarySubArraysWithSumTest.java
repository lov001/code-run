package practice.slidingwindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySubArraysWithSumTest {

   BinarySubArraysWithSum classObj = new BinarySubArraysWithSum();

   @Test
   void test_numSubArraysWithSum_expect4_whenNIs5AndGoalIs2() {
      int[] input = {1, 0, 1, 0, 1};
      Assertions.assertEquals(4, classObj.numSubArraysWithSumBruteForce(input, 2));
      Assertions.assertEquals(4, classObj.numSubArraysWithSumUsingPrefixSum(input, 2));
      int output = classObj.numSubArraysWithSumUsingSlidingWindow(input, 2)
         - classObj.numSubArraysWithSumUsingSlidingWindow(input, 1);
      Assertions.assertEquals(4, output);
   }

   @Test
   void test_numSubArraysWithSum_expect15_whenNIs5AndGoalIs0() {
      int[] input = {0, 0, 0, 0, 0};
      Assertions.assertEquals(15, classObj.numSubArraysWithSumBruteForce(input, 0));
      Assertions.assertEquals(15, classObj.numSubArraysWithSumUsingPrefixSum(input, 0));
      int output = classObj.numSubArraysWithSumUsingSlidingWindow(input, 0)
         - classObj.numSubArraysWithSumUsingSlidingWindow(input, -1);
      Assertions.assertEquals(15, output);
   }
}
