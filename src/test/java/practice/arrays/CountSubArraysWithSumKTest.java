package practice.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountSubArraysWithSumKTest {

   CountSubArraysWithSumK classObj = new CountSubArraysWithSumK();

   @Test
   void test_numSubArraysWithSum_expect2_whenNIs3AndGoalIs2() {
      int[] input = {1, 1, 1};
      Assertions.assertEquals(2, classObj.findAllSubArraysWithGivenSum(input, 2));
   }

   @Test
   void test_numSubArraysWithSum_expect2_whenNIs3AndGoalIs3() {
      int[] input = {1, 2, 3};
      Assertions.assertEquals(2, classObj.findAllSubArraysWithGivenSum(input, 3));
   }
}
