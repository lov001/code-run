package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class CountSubsetsWithSumK {

   public int findWays(int[] nums, int target) {
      int n = nums.length;
      int[][] dp = new int[n][target + 1];
      for (int[] rows : dp) {
         Arrays.fill(rows, -1);
      }
      return helper(n - 1, target, nums, dp);
   }

   private int helper(int index, int target, int[] nums, int[][] dp) {
      if (index == 0) {
         if (target == 0) {
            return nums[0] == 0 ? 2 : 1;
         }
         return target == nums[0] ? 1 : 0;
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
