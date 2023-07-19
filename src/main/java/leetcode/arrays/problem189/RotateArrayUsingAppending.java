package leetcode.arrays.problem189;


public class RotateArrayUsingAppending {


   public void rotate(int[] nums, int k) {
      int length = nums.length;
      if (k == 0) {
         return;
      }
      k = k % length;
      int[] modifiedArray = new int[length * 2];
      for (int i = 0; i < length; i++) {
         modifiedArray[i] = nums[i];
      }
      for (int i = length; i < length * 2; i++) {
         modifiedArray[i] = nums[i - length];
      }
      int j = 0;
      for (int i = length - k; j < length; i++) {
         nums[j++] = modifiedArray[i];
      }
   }

}
