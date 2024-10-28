package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class BestTimeToBuySellStockWithCoolDown {

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