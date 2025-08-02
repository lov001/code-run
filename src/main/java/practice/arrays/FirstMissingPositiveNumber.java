package practice.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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

   public int firstMissingPositiveUsingHashSet(int[] nums) {
      int min = 1;
      Set<Integer> integerSet = new HashSet<>();
      for (int number : nums) {
         if (number > 0) {
            integerSet.add(number);
         }
      }
      while (integerSet.contains(min)) {
         min++;
      }
      return min;
   }

   public int firstMissingPositiveOptimal(int[] nums) {
      int n = nums.length;
      for (int i = 0; i < n; i++) {
         if (nums[i] <= 0 || nums[i] > n) {
            nums[i] = n + 1;
         }
      }
      for (int i = 0; i < n; i++) {
         int abs = Math.abs(nums[i]);
         if (abs <= n) {
            nums[abs - 1] = -Math.abs(nums[abs - 1]);
         }
      }
      for (int i = 0; i < n; i++) {
         if (nums[i] > 0) {
            return i + 1;
         }
      }
      return n + 1;
   }
}
