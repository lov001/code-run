package leetcode.arrays.problem239;

public class SlidingWindowMaximumUsingTwoArrays {


   public int[] maxSlidingWindow(int[] nums, int k) {
      int length = nums.length;
      int[] result = new int[length - k + 1];
      int[] left = new int[length];
      int[] right = new int[length];
      left[0] = nums[0];
      right[length - 1] = nums[length - 1];

      for (int i = 1; i < length; i++) {
         left[i] = (i % k) == 0 ? nums[i] : Math.max(left[i - 1], nums[i]);
         int j = length - i - 1;
         right[j] = (j % k) == 0 ? nums[j] : Math.max(right[j + 1], nums[j]);
      }
      for (int i = 0, j = 0; i + k <= length; i++) {
         result[j++] = Math.max(right[i], left[i + k - 1]);
      }
      return result;
   }
}