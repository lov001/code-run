package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class BestTimeToBuyAndSellStockWithMaxK {

   public int maxProfit(int[] prices, int n, int k) {
      if (n == 0) {
         return 0;
      }
      int[][][] dp = new int[n + 1][2][k + 1];
      for (int[][] r : dp) {
         for (int[] column : r) {
            Arrays.fill(column, -1);
         }
      }
      return profit(0, 1, k, n, prices, dp);
   }

   private int profit(int index, int buy, int maxTransactions, int n, int[] prices,
      int[][][] dp) {
      if (index == n || maxTransactions == 0) {
         return 0;
      }
      int profit = 0;
      if (dp[index][buy][maxTransactions] != -1) {
         return dp[index][buy][maxTransactions];
      }
      if (buy == 1) {
         profit += Math.max(
            -prices[index] + profit(index + 1, 0, maxTransactions, n, prices, dp),
            profit(index + 1, 1, maxTransactions, n, prices, dp));
      } else {
         profit += Math.max(
            prices[index] + profit(index + 1, 1, maxTransactions - 1, n, prices, dp),
            profit(index + 1, 0, maxTransactions, n, prices, dp));
      }
      return dp[index][buy][maxTransactions] = profit;
   }
}
