package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PartitionWithGivenDifferenceTest {

   PartitionWithGivenDifference classObj = new PartitionWithGivenDifference();

   @Test
   void test_findWays_expect1_whenNis4AndTargetIs3() {
      int[] input = {5, 2, 6, 4};
      Assertions.assertEquals(1, classObj.countPartitions(4, 3, input));
   }

   @Test
   void test_findWays_expect6_whenNis4AndTargetIs0() {
      int[] input = {1, 1, 1, 1};
      Assertions.assertEquals(6, classObj.countPartitions(4, 0, input));
   }

   @Test
   void test_findWays_expect1_whenNis3AndTargetIs1() {
      int[] input = {4, 6, 3};
      Assertions.assertEquals(1, classObj.countPartitions(3, 1, input));
   }

   @Test
   void test_findWays_expect6_whenNis5AndTargetIs0() {
      int[] input = {3, 1, 1, 2, 1};
      Assertions.assertEquals(6, classObj.countPartitions(5, 0, input));
   }

   @Test
   void test_findWays_expect3_whenNis5AndTargetIs1() {
      int[] input = {3, 2, 2, 5, 1};
      Assertions.assertEquals(3, classObj.countPartitions(5, 1, input));
   }
}
