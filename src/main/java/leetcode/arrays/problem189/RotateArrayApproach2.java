package leetcode.arrays.problem189;


import java.util.Arrays;

public class RotateArrayApproach2 {


   public void rotate(int[] nums, int k) {
      int length = nums.length;
      if (k == 0) {
         return;
      }
      k = k % length;
      int[] subArray = Arrays.copyOfRange(nums, 0, k + 1 >= length ? k : k + 1);
      int j = 0;
      for (int i = length - k; i < length; i++) {
         nums[j++] = nums[i];
      }
      for (int i = 0; i <= k && j < length; i++) {
         nums[j++] = subArray[i];
      }
   }

}
