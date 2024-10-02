package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountSubsetsWithSumKTest {

   CountSubsetsWithSumK classObj = new CountSubsetsWithSumK();

   @Test
   void test_findWays_expect3_whenNis4AndTargetIs5() {
      int[] input = {1, 1, 4, 5};
      Assertions.assertEquals(3, classObj.findWays(input, 5));
      Assertions.assertEquals(3, classObj.findWaysTabulation(input, 5));
      Assertions.assertEquals(3, classObj.findWaysSpaceOptimisation(input, 5));
   }

   @Test
   void test_findWays_expect3_whenNis3AndTargetIs2() {
      int[] input = {1, 1, 1};
      Assertions.assertEquals(3, classObj.findWays(input, 2));
      Assertions.assertEquals(3, classObj.findWaysTabulation(input, 2));
      Assertions.assertEquals(3, classObj.findWaysSpaceOptimisation(input, 2));
   }

   @Test
   void test_findWays_expect0_whenNis3AndTargetIs40() {
      int[] input = {2, 34, 5};
      Assertions.assertEquals(0, classObj.findWays(input, 40));
      Assertions.assertEquals(0, classObj.findWaysTabulation(input, 40));
      Assertions.assertEquals(0, classObj.findWaysSpaceOptimisation(input, 40));
   }

   @Test
   void test_findWays_expect2_whenNis3AndTargetIs4() {
      int[] input = {0, 1, 3};
      Assertions.assertEquals(1, classObj.findWays(input, 4));
      Assertions.assertEquals(2, classObj.findWaysTabulation(input, 4));
      Assertions.assertEquals(1, classObj.findWaysSpaceOptimisation(input, 4));
   }
}
