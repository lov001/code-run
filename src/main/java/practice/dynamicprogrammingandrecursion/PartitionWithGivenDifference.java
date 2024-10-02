package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class PartitionWithGivenDifference {

   public int countPartitions(int n, int d, int[] arr) {
      int totalSum = 0;
      for (int element : arr) {
         totalSum += element;
      }
      if ((totalSum - d < 0) || (totalSum - d) % 2 != 0) {
         return 0;
      }
      return findWays(arr, (totalSum - d) / 2);
   }

   public int findWays(int[] nums, int target) {
      int n = nums.length;
      int[][] dp = new int[n][target + 1];
      for (int[] rows : dp) {
         Arrays.fill(rows, -1);
      }
      int m = (int) (1e9 + 7);
      return helper(n - 1, target, nums, dp) % m;
   }

   private int helper(int index, int target, int[] nums, int[][] dp) {
      if (index == 0) {
         if (target == 0 && nums[0] == 0) {
            return 2;
         }
         if (target == 0 || target == nums[index]) {
            return 1;
         }
         return 0;
      }
      if (dp[index][target] != -1) {
         return dp[index][target];
      }
      int m = (int) (1e9 + 7);

      int notPick = helper(index - 1, target, nums, dp) % m;
      int pick = 0;
      if (nums[index] <= target) {
         pick = helper(index - 1, target - nums[index], nums, dp) % m;
      }
      return dp[index][target] = notPick + pick;
   }
}
