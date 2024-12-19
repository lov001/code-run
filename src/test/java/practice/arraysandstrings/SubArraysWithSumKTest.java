package practice.arraysandstrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubArraysWithSumKTest {

   SubArraysWithSumK classObj = new SubArraysWithSumK();

   @Test
   void test_numSubArraysWithSum_expect2_whenNIs3AndGoalIs2() {
      int[] input = {1, 1, 1};
      Assertions.assertEquals(2, classObj.numSubArraysWithSumBruteForce(input, 2));
      Assertions.assertEquals(2, classObj.numSubArraysWithSum(input, 2));
   }

   @Test
   void test_numSubArraysWithSum_expect2_whenNIs3AndGoalIs3() {
      int[] input = {1, 2, 3};
      Assertions.assertEquals(2, classObj.numSubArraysWithSumBruteForce(input, 3));
      Assertions.assertEquals(2, classObj.numSubArraysWithSum(input, 3));
   }
}
