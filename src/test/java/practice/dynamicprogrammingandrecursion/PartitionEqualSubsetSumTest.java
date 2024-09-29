package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PartitionEqualSubsetSumTest {

   PartitionEqualSubsetSum classObj = new PartitionEqualSubsetSum();

   @Test
   void test_canPartition_expectTrue_whenNIs6() {
      int[] array = {3, 1, 1, 2, 2, 1};
      Assertions.assertTrue(classObj.canPartition(array, 6));
   }

   @Test
   void test_canPartition_expectFalse_whenNIs9() {
      int[] array = {2, 2, 1, 1, 1, 1, 1, 3, 3};
      Assertions.assertFalse(classObj.canPartition(array, 9));
   }

   @Test
   void test_canPartition_expectFalse_whenNIs5() {
      int[] array = {5, 6, 5, 11, 6};
      Assertions.assertFalse(classObj.canPartition(array, 5));
   }

   @Test
   void test_canPartition_expectTrue_whenNIs6_() {
      int[] array = {8, 7, 6, 12, 4, 5};
      Assertions.assertTrue(classObj.canPartition(array, 6));
   }
}
