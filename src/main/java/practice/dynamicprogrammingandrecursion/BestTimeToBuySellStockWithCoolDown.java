package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class BestTimeToBuySellStockWithCoolDown {

   public int stockProfitSpaceOptimised(int[] prices) {
      int n = prices.length;
      int[] front2 = new int[2];
      int[] front1 = new int[2];
      int[] current = new int[2];
      for (int index = n - 1; index >= 0; index--) {
         current[1] = Math.max(-prices[index] + front1[0], front1[1]);
         current[0] = Math.max(prices[index] + front2[1], front1[0]);

         front2 = front1.clone();
         front1 = current.clone();
      }
      return current[1];
   }

   public int stockProfitTabulationOptimised(int[] prices) {
      int n = prices.length;
      int[][] dp = new int[n + 2][2];
      for (int index = n - 1; index >= 0; index--) {
         dp[index][1] = Math.max(-prices[index] + dp[index + 1][0],
            dp[index + 1][1]);
         dp[index][0] = Math.max(prices[index] + dp[index + 2][1],
            dp[index + 1][0]);
      }
      return dp[0][1];
   }

   public int stockProfitTabulation(int[] prices) {
      int n = prices.length;
      int[][] dp = new int[n + 2][2];
      for (int index = n - 1; index >= 0; index--) {
         for (int buy = 0; buy <= 1; buy++) {
            if (buy == 1) {
               dp[index][buy] = Math.max(-prices[index] + dp[index + 1][0],
                  dp[index + 1][1]);
            } else {
               dp[index][buy] = Math.max(prices[index] + dp[index + 2][1],
                  dp[index + 1][0]);
            }
         }
      }
      return dp[0][1];
   }

   public int stockProfit(int[] prices) {
      int n = prices.length;
      int[][] dp = new int[n + 1][2];
      for (int[] rows : dp) {
         Arrays.fill(rows, -1);
      }
      return helper(0, 1, n, prices, dp);
   }

   private int helper(int index, int buy, int n, int[] prices, int[][] dp) {
      if (index >= n) {
         return 0;
      }
      if (dp[index][buy] != -1) {
         return dp[index][buy];
      }
      if (buy == 1) {
         dp[index][buy] = Math.max(-prices[index] + helper(index + 1, 0, n, prices, dp),
            helper(index + 1, buy, n, prices, dp));
      } else {
         dp[index][buy] = Math.max(prices[index] + helper(index + 2, 1, n, prices, dp),
            helper(index + 1, buy, n, prices, dp));
      }
      return dp[index][buy];
   }
}
