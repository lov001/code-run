package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class CountSubsetsWithSumK {

   public int findWaysTabulation(int[] nums, int target) {
      int n = nums.length;
      int[][] dp = new int[n][target + 1];
      for (int i = 0; i < n; i++) {
         dp[i][0]++;
      }
      if (nums[0] <= target) {
         dp[0][nums[0]]++;
      }
      for (int i = 1; i < n; i++) {
         for (int j = 1; j <= target; j++) {
            int notPick = dp[i - 1][j];
            int pick = 0;
            if (nums[i] <= j) {
               pick = dp[i - 1][j - nums[i]];
            }
            dp[i][j] = notPick + pick;
         }
      }
      return dp[n - 1][target];
   }

   public int findWays(int[] nums, int target) {
      int n = nums.length;
      int[][] dp = new int[n][target + 1];
      for (int[] rows : dp) {
         Arrays.fill(rows, -1);
      }
      return helper(n - 1, target, nums, dp);
   }

   private int helper(int index, int target, int[] nums, int[][] dp) {
      if (target == 0) {
         return 1;
      }
      if (index < 0) {
         return 0;
      }
      if (dp[index][target] != -1) {
         return dp[index][target];
      }

      int notPick = helper(index - 1, target, nums, dp);
      int pick = 0;
      if (nums[index] <= target) {
         pick = helper(index - 1, target - nums[index], nums, dp);
      }
      return dp[index][target] = notPick + pick;
   }
}
