package practice.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MedianInRowWiseSortedMatrixTest {

   MedianInRowWiseSortedMatrix classObj = new MedianInRowWiseSortedMatrix();

   @Test
   void test_findMedian_expect10_whenNIs5MIs5() {
      int[][] input = {
         {1, 5, 7, 9, 11},
         {2, 3, 4, 8, 9},
         {4, 11, 14, 19, 20},
         {6, 10, 22, 99, 100},
         {7, 15, 17, 24, 28}
      };
      Assertions.assertEquals(10, classObj.findMedian(input, 5, 5));
   }

   @Test
   void test_findMedian_expect11_whenNIs3MIs5() {
      int[][] input = {
         {1, 2, 3, 4, 5},
         {8, 9, 11, 12, 13},
         {21, 23, 25, 27, 29}
      };
      Assertions.assertEquals(11, classObj.findMedian(input, 3, 5));
   }
}
