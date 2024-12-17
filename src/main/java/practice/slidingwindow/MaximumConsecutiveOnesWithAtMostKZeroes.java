package practice.slidingwindow;

public class MaximumConsecutiveOnesWithAtMostKZeroes {

   public int longestOnesOptimised(int[] nums, int k) {
      int n = nums.length;
      int maxLength = 0;
      int l = 0;
      int r = 0;
      int zeroes = 0;
      while (r < n) {
         if (nums[r] == 0) {
            zeroes++;
         }
         if (zeroes > k) {
            if (nums[l] == 0) {
               zeroes--;
            }
            l++;
         }
         if (zeroes <= k) {
            int length = r - l + 1;
            maxLength = Math.max(maxLength, length);
         }
         r++;
      }
      return maxLength;
   }

   public int longestOnes(int[] nums, int k) {
      int n = nums.length;
      int maxLength = 0;
      int l = 0;
      int r = 0;
      int zeroes = 0;
      while (r < n) {
         if (nums[r] == 0) {
            zeroes++;
         }
         while (zeroes > k) {
            if (nums[l] == 0) {
               zeroes--;
            }
            l++;
         }
         if (zeroes <= k) {
            int length = r - l + 1;
            maxLength = Math.max(maxLength, length);
         }
         r++;
      }
      return maxLength;
   }

   public int longestOnesBruteForce(int[] nums, int k) {
      int n = nums.length;
      int maxLength = 0;

      for (int i = 0; i < n; i++) {
         int zeroes = 0;
         for (int j = i; j < n; j++) {
            if (nums[j] == 0) {
               zeroes++;
            }
            if (zeroes <= k) {
               int length = j - i + 1;
               maxLength = Math.max(maxLength, length);
            } else {
               break;
            }
         }
      }
      return maxLength;
   }
}
