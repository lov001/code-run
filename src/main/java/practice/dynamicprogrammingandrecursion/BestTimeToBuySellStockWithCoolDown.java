package practice.dynamicprogrammingandrecursion;

public class BestTimeToBuySellStockWithCoolDown {

   public int stockProfit(int[] prices) {
      int n = prices.length;
      return helper(0, 1, n, prices);
   }

   private int helper(int index, int buy, int n, int[] prices) {
      if (index >= n) {
         return 0;
      }
      int profit;
      if (buy == 1) {
         profit = Math.max(-prices[index] + helper(index + 1, 0, n, prices),
            helper(index + 1, buy, n, prices));
      } else {
         profit = Math.max(prices[index] + helper(index + 2, 1, n, prices),
            helper(index + 1, buy, n, prices));
      }
      return profit;
   }
}
