package practice.slidingwindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubArraysWithKDistinctValuesTest {

   SubArraysWithKDistinctValues classObj = new SubArraysWithKDistinctValues();

   @Test
   void test_numSubArraysWithSum_expect3_whenNIs4AndGoalIs2() {
      int[] input = {1, 1, 2, 3};
      int output =
         classObj.kDistinctSubArrays(input, 4, 2) - classObj.kDistinctSubArrays(input, 4, 1);
      Assertions.assertEquals(3, output);
   }

   @Test
   void test_numSubArraysWithSum_expect4_whenNIs5AndGoalIs2() {
      int[] input = {2, 1, 3, 2, 4};
      int output =
         classObj.kDistinctSubArrays(input, 5, 2) - classObj.kDistinctSubArrays(input, 5, 1);
      Assertions.assertEquals(4, output);
   }

   @Test
   void test_numSubArraysWithSum_expect2_whenNIs5AndGoalIs4() {
      int[] input = {1, 2, 3, 4, 5};
      int output =
         classObj.kDistinctSubArrays(input, 5, 4) - classObj.kDistinctSubArrays(input, 5, 3);
      Assertions.assertEquals(2, output);
   }
}
