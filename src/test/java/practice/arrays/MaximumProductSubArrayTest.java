package practice.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumProductSubArrayTest {

   MaximumProductSubArray classObj = new MaximumProductSubArray();

   @Test
   void test_subArrayWithMaxProduct_expect24_whenNIs4() {
      int[] input = {-2, 3, -4, 0};
      Assertions.assertEquals(24, classObj.subArrayWithMaxProductBruteForce(input));
//      Assertions.assertEquals(11, classObj.maxSubArraySumUsingKadaneAlgorithm(input, 9));
   }

   @Test
   void test_subArrayWithMaxProduct_expect24__whenNIs4() {
      int[] input = {1, -2, 3, -4};
      Assertions.assertEquals(24, classObj.subArrayWithMaxProductBruteForce(input));
//      Assertions.assertEquals(60, classObj.maxSubArraySumUsingKadaneAlgorithm(input, 6));
   }

   @Test
   void test_subArrayWithMaxProduct_expect3_whenNIs5() {
      int[] input = {-1, 3, 0, -4, 3};
      Assertions.assertEquals(3, classObj.subArrayWithMaxProductBruteForce(input));
//      Assertions.assertEquals(0, classObj.maxSubArraySumUsingKadaneAlgorithm(input, 3));
   }
}
