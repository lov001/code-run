package leetcode.arrays.problem215;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KthLargestElementTest {


   KthLargestElement classObj = new KthLargestElement();

   @Test
   void test_findKthLargest_expect5_whenKIs2() {
      int[] input = {3, 2, 1, 5, 6, 4};
      Assertions.assertEquals(5, classObj.findKthLargest(input, 2));
   }

   @Test
   void test_findKthLargest_expect4_whenKIs4() {
      int[] input = {3, 2, 3, 1, 2, 4, 5, 5, 6};
      Assertions.assertEquals(4, classObj.findKthLargest(input, 4));
   }

}
