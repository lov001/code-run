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

   public int findWaysSpaceOptimisation(int[] nums, int k) {
      int n = nums.length;
      int[] previous = new int[k + 1];
      previous[0] = 1;
      if (nums[0] <= k) {
         previous[nums[0]] = 1;
      }
      for (int index = 1; index < n; index++) {
         int[] current = new int[k + 1];
         current[0] = 1;
         for (int target = 1; target <= k; target++) {
            int notPick = previous[target];
            int pick = 0;
            if (nums[index] <= target) {
               pick = previous[target - nums[index]];
            }
            current[target] = notPick + pick;
         }
         previous = current;
      }
      return previous[k];
   }

   public int findWays(int[] nums, int target) {
      int n = nums.length;
      int[][] dp = new int[n][target + 1];
      for (int[] rows : dp) {
         Arrays.fill(rows, -1);
      }
      int m = (int)(1e9+7);
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
      int m = (int)(1e9+7);

      int notPick = helper(index - 1, target, nums, dp) % m;
      int pick = 0;
      if (nums[index] <= target) {
         pick = helper(index - 1, target - nums[index], nums, dp) % m;
      }
      return dp[index][target] = notPick + pick;
   }
}
