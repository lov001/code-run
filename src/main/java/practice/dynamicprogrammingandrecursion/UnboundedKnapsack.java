package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class UnboundedKnapsack {

   public int unboundedKnapsackTabulation(int n, int w, int[] profit, int[] weight) {
      int[][] dp = new int[n][w + 1];
      for (int W = weight[0]; W <= w; W++) {
         dp[0][W] = (W / weight[0]) * profit[0];
      }
      for (int index = 1; index < n; index++) {
         for (int W = 0; W <= w; W++) {
            int notPick = dp[index - 1][W];
            int pick = Integer.MIN_VALUE;
            if (weight[index] <= W) {
               pick = profit[index] + dp[index][W - weight[index]];
            }
            dp[index][W] = Math.max(notPick, pick);
         }
      }
      return dp[n - 1][w];
   }

   public int unboundedKnapsackSpaceOptimisation(int n, int w, int[] profit, int[] weight) {
      int[] previous = new int[w + 1];
      for (int W = weight[0]; W <= w; W++) {
         previous[W] = (W / weight[0]) * profit[0];
      }
      for (int index = 1; index < n; index++) {
         int[] current = new int[w + 1];
         for (int W = 0; W <= w; W++) {
            int notPick = previous[W];
            int pick = Integer.MIN_VALUE;
            if (weight[index] <= W) {
               pick = profit[index] + current[W - weight[index]];
            }
            current[W] = Math.max(notPick, pick);
         }
         previous = current;
      }
      return previous[w];
   }

   public int unboundedKnapsack(int n, int w, int[] profit, int[] weight) {
      int[][] dp = new int[n][w + 1];
      for (int[] row : dp) {
         Arrays.fill(row, -1);
      }
      return helper(n - 1, w, profit, weight, dp);
   }

   private int helper(int index, int remainingWeight, int[] profit, int[] weight, int[][] dp) {
      if (index == 0) {
         return profit[0] * (remainingWeight / weight[0]);
      }
      if (dp[index][remainingWeight] != -1) {
         return dp[index][remainingWeight];
      }
      int notPick = helper(index - 1, remainingWeight, profit, weight, dp);
      int pick = Integer.MIN_VALUE;
      if (weight[index] <= remainingWeight) {
         pick = profit[index] + helper(index, remainingWeight - weight[index], profit, weight, dp);
      }
      return dp[index][remainingWeight] = Math.max(notPick, pick);
   }
}
