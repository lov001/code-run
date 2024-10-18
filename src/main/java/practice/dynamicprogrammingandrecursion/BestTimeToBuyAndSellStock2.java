package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class BestTimeToBuyAndSellStock2 {

   public long getMaximumProfit(int n, long[] values) {
      if (n == 0)
         return 0;
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
