package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PartitionArrayWithMaximumSumTest {

   PartitionArrayWithMaximumSum classObj = new PartitionArrayWithMaximumSum();

   @Test
   void test_maximumSubArray_expect80_whenNIs6AndKIs3() {
      int[] input = {1, 20, 13, 4, 4, 1};
      Assertions.assertEquals(80, classObj.maximumSubArray(input, 3));
      Assertions.assertEquals(80, classObj.maximumSubArrayTabulation(input, 3));
   }

   @Test
   void test_maximumSubArray_expect56_whenNIs5AndKIs2() {
      int[] input = {1, 21, 1, 5, 4};
      Assertions.assertEquals(56, classObj.maximumSubArray(input, 2));
      Assertions.assertEquals(56, classObj.maximumSubArrayTabulation(input, 2));
   }

   @Test
   void test_maximumSubArray_expect6_whenNIs1AndKIs1() {
      int[] input = {6};
      Assertions.assertEquals(6, classObj.maximumSubArray(input, 1));
      Assertions.assertEquals(6, classObj.maximumSubArrayTabulation(input, 1));
   }
}
