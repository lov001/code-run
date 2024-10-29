package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class BestTimeToBuySellStockWithTransactionFee {

   public int maximumProfitTabulation(int[] prices, int n, int fee) {
      if (n == 0) {
         return 0;
      }
      int[][] dp = new int[n + 1][2];
      for (int index = n - 1; index >= 0; index--) {
         for (int buy = 0; buy <= 1; buy++) {
            if (buy == 1) {
               dp[index][buy] = Math.max(-prices[index] + dp[index + 1][0], dp[index + 1][1]);
            } else {
               dp[index][buy] = Math.max(prices[index] - fee + dp[index + 1][1], dp[index + 1][0]);
            }
         }
      }
      return dp[0][1];
   }

   public int maximumProfitSpaceOptimisation(int[] prices, int n, int fee) {
      if (n == 0) {
         return 0;
      }
      int[] current = new int[2];
      int[] ahead = new int[2];
      for (int index = n - 1; index >= 0; index--) {
         for (int buy = 0; buy <= 1; buy++) {
            if (buy == 1) {
               current[buy] = Math.max(-prices[index] + ahead[0], ahead[1]);
            } else {
               current[buy] = Math.max(prices[index] - fee + ahead[1], ahead[0]);
            }
         }
         ahead = current;
      }
      return current[1];
   }

   public long maximumProfit(int[] prices, int n, int fee) {
      if (n == 0) {
         return 0;
      }
      long[][] dp = new long[n][2];
      for (long[] r : dp) {
         Arrays.fill(r, -1);
      }
      return maxProfit(0, n, fee, prices, 1, dp);
   }

   private long maxProfit(int index, int n, int fee, int[] values, int buy, long[][] dp) {
      if (index == n) {
         return 0;
      }
      if (dp[index][buy] != -1) {
         return dp[index][buy];
      }
      long maxProfit;
      if (buy == 1) {
         maxProfit = Math.max(
            -values[index] + maxProfit(index + 1, n, fee, values, 0, dp),
            maxProfit(index + 1, n, fee, values, 1, dp));
      } else {
         maxProfit = Math.max(values[index] - fee + maxProfit(index + 1, n, fee, values, 1, dp),
            maxProfit(index + 1, n, fee, values, 0, dp));
      }
      dp[index][buy] = maxProfit;
      return maxProfit;
   }
}
