package leetcode.arrays.problem80;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesFromSortedArray2Test {


   RemoveDuplicatesFromSortedArray2 classObj = new RemoveDuplicatesFromSortedArray2();


   @Test
   void test_removeDuplicates_expect5_when() {
      int[] nums = {1, 1, 1, 2, 2, 3};
      Assertions.assertEquals(5, classObj.removeDuplicates(nums));
   }

   @Test
   void test_removeDuplicates_expect7_when1() {
      int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
      Assertions.assertEquals(7, classObj.removeDuplicates(nums));
   }

   @Test
   void test_removeDuplicates_expect5_when55() {
      int[] nums = {1, 1, 1, 1, 2, 2, 3};
      Assertions.assertEquals(5, classObj.removeDuplicates(nums));
   }
}
