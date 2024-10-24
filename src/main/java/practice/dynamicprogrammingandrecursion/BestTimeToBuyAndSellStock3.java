package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class BestTimeToBuyAndSellStock3 {

   public int maxProfitTabulation(int[] prices) {
      int n = prices.length;
      if (n == 0) {
         return 0;
      }
      int[][][] dp = new int[n + 1][2][3];
//      for (int index = 0; index < n; index++) {
//         for (int buy = 0; buy <= 1; buy++) {
//            dp[index][buy][0] = 0;
//         }
//      }
//      for (int buy = 0; buy <= 1; buy++) {
//         for (int cap = 1; cap <= 2; cap++) {
//            dp[n][buy][cap] = 0;
//         }
//      }
      for (int index = n - 1; index >= 0; index--) {
         for (int buy = 0; buy <= 1; buy++) {
            for (int cap = 1; cap <= 2; cap++) {
               if (buy == 1) {
                  dp[index][buy][cap] = Math.max(-prices[index] + dp[index + 1][0][cap],
                     dp[index + 1][1][cap]);
               } else {
                  dp[index][buy][cap] = Math.max(
                     prices[index] + dp[index + 1][1][cap - 1], dp[index + 1][0][cap]);
               }
            }
         }
      }
      return dp[0][1][2];
   }

   public int maxProfitSpaceOptimisation(int[] prices) {
      int n = prices.length;
      if (n == 0) {
         return 0;
      }
      int[][] after = new int[2][3];
      int[][] current = new int[2][3];
      for (int index = n - 1; index >= 0; index--) {
         for (int buy = 0; buy <= 1; buy++) {
            for (int cap = 1; cap <= 2; cap++) {
               if (buy == 1) {
                  current[buy][cap] = Math.max(-prices[index] + after[0][cap],
                     after[1][cap]);
               } else {
                  current[buy][cap] = Math.max(
                     prices[index] + after[1][cap - 1], after[0][cap]);
               }
            }
         }
         after = current;
      }
      return after[1][2];
   }

   public int maxProfit(int[] prices) {
      int n = prices.length;
      if (n == 0) {
         return 0;
      }
      int[][][] dp = new int[n + 1][2][3];
      for (int[][] r : dp) {
         for (int[] column : r) {
            Arrays.fill(column, -1);
         }
      }
      return profit(0, 1, 2, n, prices, dp);
   }

   private int profit(int index, int buy, int maxTransactions, int n, int[] prices,
      int[][][] dp) {
      if (index == n || maxTransactions == 0) {
         return 0;
      }
      if (dp[index][buy][maxTransactions] != -1) {
         return dp[index][buy][maxTransactions];
      }
      int profit;
      if (buy == 1) {
         profit = Math.max(
            -prices[index] + profit(index + 1, 0, maxTransactions, n, prices, dp),
            profit(index + 1, 1, maxTransactions, n, prices, dp));
      } else {
         profit = Math.max(
            prices[index] + profit(index + 1, 1, maxTransactions - 1, n, prices, dp),
            profit(index + 1, 0, maxTransactions, n, prices, dp));
      }
      return dp[index][buy][maxTransactions] = profit;
   }
}
