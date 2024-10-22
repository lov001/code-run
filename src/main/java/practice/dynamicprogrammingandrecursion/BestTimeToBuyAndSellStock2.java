package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class BestTimeToBuyAndSellStock2 {

   public long getMaximumProfitTabulation(int n, long[] values) {
      if (n == 0) {
         return 0;
      }
      long[][] dp = new long[n + 1][2];
      dp[n][0] = 0;
      dp[n][1] = 0;
      for (int index = n - 1; index >= 0; index--) {
         for (int buy = 0; buy <= 1; buy++) {
            long profit;
            if (buy == 1) {
               profit = Math.max(-values[index] + dp[index + 1][0], dp[index + 1][1]);
            } else {
               profit = Math.max(values[index] + dp[index + 1][1], dp[index + 1][0]);
            }
            dp[index][buy] = profit;
         }
      }
      return dp[0][1];
   }

   public long getMaximumProfitSpaceOptimisation(int n, long[] values) {
      if (n == 0) {
         return 0;
      }
      long[] front = new long[2];
      long[] current = new long[2];
      for (int index = n - 1; index >= 0; index--) {
         for (int buy = 0; buy <= 1; buy++) {
            long profit;
            if (buy == 1) {
               profit = Math.max(-values[index] + front[0], front[1]);
            } else {
               profit = Math.max(values[index] + front[1], front[0]);
            }
            current[buy] = profit;
         }
         front = current;
      }
      return front[1];
   }

   public long getMaximumProfitSpaceOptimisationUsingVariables(int n, long[] values) {
      if (n == 0) {
         return 0;
      }
      long aheadBuy = 0;
      long aheadNotBuy = 0;
      long currentBuy;
      long currentNotBuy;
      for (int index = n - 1; index >= 0; index--) {
         currentBuy = Math.max(-values[index] + aheadNotBuy, aheadBuy);
         currentNotBuy = Math.max(values[index] + aheadBuy, aheadNotBuy);
         aheadBuy = currentBuy;
         aheadNotBuy = currentNotBuy;
      }
      return aheadBuy;
   }

   public long getMaximumProfit(int n, long[] values) {
      if (n == 0) {
         return 0;
      }
      long[][] dp = new long[n][2];
      for (long[] r : dp) {
         Arrays.fill(r, -1);
      }
      return maxProfit(0, n, values, 1, dp);
   }

   private long maxProfit(int index, int n, long[] values, int buy, long[][] dp) {
      if (index == n) {
         return 0;
      }
      if (dp[index][buy] != -1) {
         return dp[index][buy];
      }
      long maxProfit;
      if (buy == 1) {
         maxProfit = Math.max(
            -values[index] + maxProfit(index + 1, n, values, 0, dp),
            maxProfit(index + 1, n, values, 1, dp));
      } else {
         maxProfit = Math.max(values[index] + maxProfit(index + 1, n, values, 1, dp),
            maxProfit(index + 1, n, values, 0, dp));
      }
      dp[index][buy] = maxProfit;
      return maxProfit;
   }
}
