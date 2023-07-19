package leetcode.arrays.problem189;


import java.util.Arrays;

public class RotateArrayApproach4Reversing {


   public void rotate(int[] nums, int k) {
      int length = nums.length;
      if (k == 0) {
         return;
      }
      k = k % length;
      reverse(nums, 0, length - 1);
      reverse(nums, 0, k - 1);
      reverse(nums, k, length - 1);
   }

   private void reverse(int nums[], int start, int end) {
      while (start <= end) {
         int temp = nums[start];
         nums[start] = nums[end];
         nums[end] = temp;
         start++;
         end--;
      }
   }

}
