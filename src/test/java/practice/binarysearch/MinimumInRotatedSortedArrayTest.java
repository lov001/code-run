package practice.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumInRotatedSortedArrayTest {

   MinimumInRotatedSortedArray classObj = new MinimumInRotatedSortedArray();

   @Test
   public void test_findMin_expect1_whenSizeIs5() {
      int[] input = {3, 4, 5, 1, 2};
      Assertions.assertEquals(1, classObj.findMin(input));
   }

   @Test
   public void test_findMin_expect1_whenSizeIs4() {
      int[] input = {3, 4, 1, 2};
      Assertions.assertEquals(1, classObj.findMin(input));
   }

   @Test
   public void test_findMin_expect4_whenSizeIs5() {
      int[] input = {25, 30, 5, 10, 15, 20};
      Assertions.assertEquals(5, classObj.findMin(input));
   }
}
