package practice.arrays;

import java.util.Arrays;

public class FirstMissingPositiveNumber {

   public int firstMissingPositiveUsingSorting(int[] nums) {
      int min = 1;
      int n = nums.length;
      if (n == 1) {
         return nums[0] == 1 ? 2 : 1;
      }
      Arrays.sort(nums);
      for (int i = 0; i < n; i++) {
         int current = nums[i];
         if (current <= 0) {
            continue;
         }
         if (i > 0 && current == nums[i - 1]) {
            continue;
         }

         if (current == min) {
            min++;
         } else if (current > min) {
            return min;
         }
      }
      return min;
   }
}
