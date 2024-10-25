package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class BestTimeToBuyAndSellStockWithMaxK {

   public int maxProfitOptimised(int[] prices, int n, int k) {
      int[][][] dp = new int[n + 1][2][2 * k];
      for (int[][] r : dp) {
         for (int[] column : r) {
            Arrays.fill(column, -1);
         }
      }
      return profitOptimised(0, 0, k, n, prices, dp);
   }

   private int profitOptimised(int index, int transaction, int k, int n, int[] prices,
      int[][][] dp) {
      if (index == n || transaction == 2 * k) {
         return 0;
      }
      if (dp[index][transaction % 2][transaction] != -1) {
         return dp[index][transaction % 2][transaction];
      }
      if (transaction % 2 == 0) {
         dp[index][transaction % 2][transaction] = Math.max(
            -prices[index] + profitOptimised(index + 1, transaction + 1, k, n, prices, dp),
            profitOptimised(index + 1, transaction, k, n, prices, dp));
      } else {
         dp[index][transaction % 2][transaction] = Math.max(
            prices[index] + profitOptimised(index + 1, transaction + 1, k, n, prices, dp),
            profitOptimised(index + 1, transaction, k, n, prices, dp));
      }
      return dp[index][transaction % 2][transaction];
   }


   public int maxProfitTabulation(int[] prices, int n, int k) {
      if (n == 0) {
         return 0;
      }
      int[][][] dp = new int[n + 1][2][k + 1];
      for (int index = n - 1; index >= 0; index--) {
         for (int buy = 0; buy < 2; buy++) {
            for (int maxTransactions = 1; maxTransactions <= k; maxTransactions++) {
               if (buy == 1) {
                  dp[index][buy][maxTransactions] = Math.max(
                     -prices[index] + dp[index + 1][0][maxTransactions],
                     dp[index + 1][1][maxTransactions]);
               } else {
                  dp[index][buy][maxTransactions] += Math.max(
                     prices[index] + dp[index + 1][1][maxTransactions - 1],
                     dp[index + 1][0][maxTransactions]);
               }
            }
         }
      }
      return dp[0][1][k];
   }

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
