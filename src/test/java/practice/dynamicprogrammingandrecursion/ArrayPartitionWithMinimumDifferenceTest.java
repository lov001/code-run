package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayPartitionWithMinimumDifferenceTest {

   ArrayPartitionWithMinimumDifference classObj = new ArrayPartitionWithMinimumDifference();

   @Test
   void test_minSubsetSumDifference_expect0_whenNIs4() {
      int[] array = {1, 2, 3, 4};
      Assertions.assertEquals(0, classObj.minSubsetSumDifference(array, 4));
   }

   @Test
   void test_minSubsetSumDifference_expect3_whenNIs3() {
      int[] array = {8, 6, 5};
      Assertions.assertEquals(3, classObj.minSubsetSumDifference(array, 3));
   }
}
