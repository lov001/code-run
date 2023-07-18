package leetcode.arrays.problem26;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesFromSortedArrayTest {


   RemoveDuplicatesFromSortedArray classObj = new RemoveDuplicatesFromSortedArray();


   @Test
   void test_removeDuplicates_expect_when() {
      int[] nums = {1, 1, 2};
      Assertions.assertEquals(2, classObj.removeDuplicates(nums));
   }

   @Test
   void test_removeDuplicates_expect_when1() {
      int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
      Assertions.assertEquals(5, classObj.removeDuplicates(nums));
   }

}
