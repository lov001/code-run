package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class UnboundedKnapsack {

   public int unboundedKnapsack(int n, int w, int[] profit, int[] weight) {
      int[][] dp = new int[n][w + 1];
      for (int[] row : dp) {
         Arrays.fill(row, -1);
      }
      return helper(n - 1, w, profit, weight, dp);
   }

   private int helper(int index, int remainingWeight, int[] profit, int[] weight, int[][] dp) {
      if (index == 0) {
         if (remainingWeight % weight[0] == 0) {
            return profit[0] * (remainingWeight / weight[0]);
         } else {
            return 0;
         }
      }
      if (dp[index][remainingWeight] != -1) {
         return dp[index][remainingWeight];
      }
      int notPick = helper(index - 1, remainingWeight, profit, weight, dp);
      int pick = 0;
      if (weight[index] <= remainingWeight) {
         pick = profit[index] + helper(index, remainingWeight - weight[index], profit, weight, dp);
      }
      return dp[index][remainingWeight] = Math.max(notPick, pick);
   }
}
