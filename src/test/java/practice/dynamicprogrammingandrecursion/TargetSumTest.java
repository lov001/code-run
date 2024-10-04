package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TargetSumTest {

   TargetSum classObj = new TargetSum();

   @Test
   void test_targetSum_expect5_whenNIs5AndTargetIs3() {
      int[] nums = {1, 1, 1, 1, 1};
      Assertions.assertEquals(5, classObj.targetSum(5, 3, nums));
   }

   @Test
   void test_targetSum_expect2_whenNIs4AndTargetIs3() {
      int[] nums = {1, 2, 3, 1};
      Assertions.assertEquals(2, classObj.targetSum(4, 3, nums));
   }

   @Test
   void test_targetSum_expect1_whenNIs3AndTargetIs2() {
      int[] nums = {1, 2, 3};
      Assertions.assertEquals(1, classObj.targetSum(3, 2, nums));
   }

   @Test
   void test_targetSum_expect5_whenNIs2AndTargetIs0() {
      int[] nums = {1, 1};
      Assertions.assertEquals(2, classObj.targetSum(2, 0, nums));
   }
}
