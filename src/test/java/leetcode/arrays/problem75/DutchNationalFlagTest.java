package leetcode.arrays.problem75;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DutchNationalFlagTest {


   DutchNationalFlag classObj = new DutchNationalFlag();

   @Test
   void test_sortColors_expectSortedArray_whenInputSizeIs6() {
      int[] nums = {2, 0, 2, 1, 1, 0};
      int[] output = {0, 0, 1, 1, 2, 2};
      classObj.sortColors(nums);
      Assertions.assertEquals(Arrays.toString(output), Arrays.toString(nums));
   }

   @Test
   void test_sortColors_expectSortedArray_whenInputSizeIs3() {
      int[] nums = {2, 0, 1};
      int[] output = {0, 1, 2};
      classObj.sortColors(nums);
      Assertions.assertEquals(Arrays.toString(output), Arrays.toString(nums));
   }

   @Test
   void test_sortColors_expectSortedArray_whenInputSizeIs12() {
      int[] nums = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
      int[] output = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2};
      classObj.sortColors(nums);
      Assertions.assertEquals(Arrays.toString(output), Arrays.toString(nums));
   }
}
