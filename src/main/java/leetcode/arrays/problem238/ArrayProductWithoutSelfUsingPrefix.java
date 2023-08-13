package leetcode.arrays.problem238;

public class ArrayProductWithoutSelfUsingPrefix {


   public int[] productExceptSelf(int[] nums) {
      int length = nums.length;
      int[] prefix = new int[length];
      int[] suffix = new int[length];

      prefix[0] = nums[0];
      suffix[length - 1] = nums[length - 1];

      for (int i = 1; i < nums.length; i++) {
         prefix[i] = prefix[i - 1] * nums[i];
      }
      for (int i = length - 2; i >= 0; i--) {
         suffix[i] = suffix[i + 1] * nums[i];
      }

      for (int i = 0; i < length; i++) {
         if (i == 0) {
            nums[i] = suffix[i + 1];
         } else if (i == length - 1) {
            nums[i] = prefix[i - 1];
         } else {
            nums[i] = prefix[i - 1] * suffix[i + 1];
         }
      }
      return nums;
   }

}
