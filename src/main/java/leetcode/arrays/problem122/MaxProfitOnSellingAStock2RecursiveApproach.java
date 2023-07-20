package leetcode.arrays.problem122;

public class MaxProfitOnSellingAStock2RecursiveApproach {


   public int maxProfit(int[] prices) {
      return solve(0, true, prices);
   }

   private int solve(int index, boolean isBuyAllowed, int[] prices) {
      if (index == prices.length) {
         return 0;
      }
      int profit;
      if (isBuyAllowed) {
         int buy = -prices[index] + solve(index + 1, false, prices);
         int skip = solve(index + 1, true, prices);
         profit = Math.max(buy, skip);
      } else {
         int sell = prices[index] + solve(index + 1, true, prices);
         int skip = solve(index + 1, false, prices);
         profit = Math.max(sell, skip);
      }
      return profit;
   }

}
