package leetcode.arrays.problem238;

public class ArrayProductWithoutSelf {


   public int[] productExceptSelf(int[] nums) {
      int product = nums[0];
      int count = product == 0 ? 1 : 0;
      for (int i = 1; i < nums.length; i++) {
         if (nums[i] == 0) {
            count++;
         } else if (count == 1 && product == 0) {
            product = nums[i];
         } else {
            product *= nums[i];
         }
      }
      for (int i = 0; i < nums.length; i++) {
         if (count > 0 && nums[i] != 0) {
            nums[i] = 0;
         } else if (count == 1) {
            nums[i] = product;
         } else if (count > 1) {
            nums[i] = 0;
         } else {
            nums[i] = product / nums[i];
         }
      }
      return nums;
   }

}
