package practice.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumSubArraySumTest {

   MaximumSubArraySum classObj = new MaximumSubArraySum();

   @Test
   void test_maxSubArraySum_expect11_whenNIs9() {
      int[] input = {1, 2, 7, -4, 3, 2, -10, 9, 1};
      Assertions.assertEquals(11, classObj.maxSubArraySum(input, 9));
      Assertions.assertEquals(11, classObj.maxSubArraySumUsingKadaneAlgorithm(input, 9));
   }

   @Test
   void test_maxSubArraySum_expect60_whenNIs6() {
      int[] input = {10, 20, -30, 40, -50, 60};
      Assertions.assertEquals(60, classObj.maxSubArraySum(input, 6));
      Assertions.assertEquals(60, classObj.maxSubArraySumUsingKadaneAlgorithm(input, 6));
   }

   @Test
   void test_maxSubArraySum_expect0_whenNIs3() {
      int[] input = {-3, -5, -6};
      Assertions.assertEquals(0, classObj.maxSubArraySum(input, 3));
      Assertions.assertEquals(0, classObj.maxSubArraySumUsingKadaneAlgorithm(input, 3));
   }
}
