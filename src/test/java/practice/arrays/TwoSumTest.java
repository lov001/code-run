package practice.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumTest {

   TwoSum classObj = new TwoSum();

   @Test
   void test_twoSum_expect0And1_whenTargetIs9() {
      int[] input = {2, 7, 11, 15};
      int[] expected = {0, 1};
      Assertions.assertArrayEquals(expected, classObj.twoSum(input, 4, 9));
      Assertions.assertArrayEquals(expected, classObj.twoSumTwoPointers(input, 4, 9));
   }

   @Test
   void test_twoSum_expectMinus1_whenTargetIs6() {
      int[] input = {3, 2, 8};
      int[] expected = {-1, -1};
      Assertions.assertArrayEquals(expected, classObj.twoSum(input, 3, 6));
      Assertions.assertArrayEquals(expected, classObj.twoSumTwoPointers(input, 3, 6));
   }

   @Test
   void test_twoSum_expectOAnd1_whenTargetIs6() {
      int[] input = {3, 3, 3};
      int[] expected = {0, 1};
      Assertions.assertArrayEquals(expected, classObj.twoSum(input, 3, 6));
      Assertions.assertArrayEquals(expected, classObj.twoSumTwoPointers(input, 3, 6));
   }

   @Test
   void test_twoSum_expectMinus1_whenTargetIsMinus10() {
      int[] input = {-8, 4, -1, 0, 2};
      int[] expected = {-1, -1};
      Assertions.assertArrayEquals(expected, classObj.twoSum(input, 5, -10));
      Assertions.assertArrayEquals(expected, classObj.twoSumTwoPointers(input, 5, -10));
   }

   @Test
   void test_twoSum_expectMinus1_whenTargetIs13() {
      int[] input = {-7, -1, -2, -6, -4, 3};
      int[] expected = {-1, -1};
      Assertions.assertArrayEquals(expected, classObj.twoSum(input, 6, 13));
      Assertions.assertArrayEquals(expected, classObj.twoSumTwoPointers(input, 6, 13));
   }

   @Test
   void test_twoSum_expect0And3_whenTargetIs5() {
      int[] input = {4, 3, 2, 1};
      int[] expected = {0, 3};
      Assertions.assertArrayEquals(expected, classObj.twoSum(input, 4, 5));
      Assertions.assertArrayEquals(expected, classObj.twoSumTwoPointers(input, 4, 5));
   }
}
