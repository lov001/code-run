package practice.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxDistanceBetweenGasStationsTest {

   MaxDistanceBetweenGasStations classObj = new MaxDistanceBetweenGasStations();

   @Test
   void test_minimiseMaxDistance_expect0Point5_whenNIs7AndKIs6() {
      int[] input = {1, 2, 3, 4, 5, 6, 7};
      Assertions.assertEquals(0.5, classObj.minimiseMaxDistance(input, 6));
      Assertions.assertEquals(0.5, classObj.minimiseMaxDistanceUsingPriorityQueue(input, 6));
      Assertions.assertEquals(0.5, classObj.minimiseMaxDistanceBinarySearch(input, 6));
   }

   @Test
   void test_minimiseMaxDistance_expect0Point5_whenNIs5AndKIs4() {
      int[] input = {1, 2, 3, 4, 5};
      Assertions.assertEquals(0.5, classObj.minimiseMaxDistance(input, 4));
      Assertions.assertEquals(0.5, classObj.minimiseMaxDistanceUsingPriorityQueue(input, 4));
      Assertions.assertEquals(0.5, classObj.minimiseMaxDistanceBinarySearch(input, 4));
   }

   @Test
   void test_minimiseMaxDistance_expect1_whenNIs10AndKIs1() {
      int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      Assertions.assertEquals(1, classObj.minimiseMaxDistance(input, 1));
      Assertions.assertEquals(1, classObj.minimiseMaxDistanceUsingPriorityQueue(input, 1));
      Assertions.assertEquals(1, classObj.minimiseMaxDistanceBinarySearch(input, 1));
   }
}
