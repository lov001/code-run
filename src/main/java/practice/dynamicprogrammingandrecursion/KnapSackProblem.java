package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class KnapSackProblem {

   public int knapsackBySpaceOptimisation(int[] weight, int[] value, int n, int maxWeight) {
      int[] previous = new int[maxWeight + 1];
      for (int W = weight[0]; W <= maxWeight; W++) {
         previous[W] = value[0];
      }
      for (int ind = 1; ind < n; ind++) {
         int[] current = new int[maxWeight + 1];
         current[0] = value[0];
         for (int val = 0; val <= maxWeight; val++) {
            int notPick = previous[val];
            int pick = Integer.MIN_VALUE;
            if (weight[ind] <= val) {
               pick = value[ind] + previous[val - weight[ind]];
            }
            current[val] = Math.max(notPick, pick);
         }
         previous = current;
      }
      return previous[maxWeight];
   }

   public int knapsackByTabulation(int[] weight, int[] value, int n, int maxWeight) {
      int[][] dp = new int[n][maxWeight + 1];
      for (int W = weight[0]; W <= maxWeight; W++) {
         dp[0][W] = value[0];
      }
      for (int ind = 1; ind < n; ind++) {
         for (int val = 0; val <= maxWeight; val++) {
            int notPick = dp[ind - 1][val];
            int pick = Integer.MIN_VALUE;
            if (weight[ind] <= val) {
               pick = value[ind] + dp[ind - 1][val - weight[ind]];
            }
            dp[ind][val] = Math.max(notPick, pick);
         }
      }
      return dp[n - 1][maxWeight];
   }

   public int knapsack(int[] weight, int[] value, int n, int maxWeight) {
      int[][] dp = new int[n][maxWeight + 1];
      for (int[] rows : dp) {
         Arrays.fill(rows, -1);
      }
      return solve(n - 1, maxWeight, weight, value, dp);
   }

   private int solve(int index, int maxWeight, int[] weight, int[] value, int[][] dp) {
      if (index == 0) {
         if (weight[index] <= maxWeight) {
            return value[0];
         } else {
            return 0;
         }
      }
      if (dp[index][maxWeight] != -1) {
         return dp[index][maxWeight];
      }
      int notPick = solve(index - 1, maxWeight, weight, value, dp);
      int pick = Integer.MIN_VALUE;
      if (weight[index] <= maxWeight) {
         pick = value[index] + solve(index - 1, maxWeight - weight[index], weight, value, dp);
      }
      return dp[index][maxWeight] = Math.max(notPick, pick);
   }
}
