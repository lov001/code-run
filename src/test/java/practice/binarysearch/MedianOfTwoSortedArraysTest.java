package practice.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MedianOfTwoSortedArraysTest {

   MedianOfTwoSortedArrays classObj = new MedianOfTwoSortedArrays();


   @Test
   void test_median_expect5_whenNIs6AndMIs4() {
      int[] a = {1, 3, 4, 7, 10, 12};
      int[] b = {2, 3, 6, 15};
      Assertions.assertEquals(5, classObj.median(a, b));
   }

   @Test
   void test_median_expect3Point5_whenNIs3AndMIs3() {
      int[] a = {2, 4, 6};
      int[] b = {1, 3, 5};
      Assertions.assertEquals(3.5, classObj.median(a, b));
   }

   @Test
   void test_median_expect3_whenNIs3AndMIs2() {
      int[] a = {2, 4, 6};
      int[] b = {1, 3};
      Assertions.assertEquals(3, classObj.median(a, b));
   }

   @Test
   void test_median_expect2_whenNIs3AndMIs3() {
      int[] a = {1, 2, 2};
      int[] b = {2, 4, 4};
      Assertions.assertEquals(2, classObj.median(a, b));
   }
}
