package leetcode.arrays.problem238;

import java.util.Arrays;

public class ArrayProductWithoutSelfUsingPrefixWiithoutExtraSpace {


   public int[] productExceptSelf(int[] nums) {
      int prefix = 1;
      int[] result = new int[nums.length];
      Arrays.fill(result, 1);

      for (int i = 0; i < nums.length; i++) {
         result[i] = prefix;
         prefix *= nums[i];
      }

      int postfix = 1;
      for (int i = nums.length - 1; i >= 0; i--) {
         result[i] *= postfix;
         postfix *= nums[i];
      }

      return result;
   }

}
