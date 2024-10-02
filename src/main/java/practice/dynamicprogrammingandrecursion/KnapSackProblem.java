package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class KnapSackProblem {

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
