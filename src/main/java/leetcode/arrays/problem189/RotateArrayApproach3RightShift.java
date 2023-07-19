package leetcode.arrays.problem189;

public class RotateArrayApproach3RightShift {


   public void rotate(int[] nums, int k) {
      int length = nums.length;
      if (k == 0) {
         return;
      }
      k = k > length ? k % length : k;
      for (int shift = 0; shift < k; shift++) {
         int last = nums[length - 1];
         for (int i = length - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
         }
         nums[0] = last;
      }
   }

}
