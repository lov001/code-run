package practice.dynamicprogrammingandrecursion;

public class BestTimeToBuyAndSellStock3 {

   public int maxProfit(int[] prices) {
      int n = prices.length;
      if (n == 0) {
         return 0;
      }
      return profit(0, true, 2, n, prices);
   }

   private int profit(int index, boolean buy, int maxTransactions, int n, int[] prices) {
      if (index == n) {
         return 0;
      }
      if (maxTransactions == 0) {
         return 0;
      }
      int profit;
      if (buy) {
         profit = Math.max(-prices[index] + profit(index + 1, false, maxTransactions, n, prices),
            profit(index + 1, true, maxTransactions, n, prices));
      } else {
         profit = Math.max(prices[index] + profit(index + 1, true, maxTransactions - 1, n, prices),
            profit(index + 1, false, maxTransactions, n, prices));
      }
      return profit;
   }
}
