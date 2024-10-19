package practice.dynamicprogrammingandrecursion;

import java.util.ArrayList;

public class BestTimeToBuyAndSellStock {

   public int maximumProfit(ArrayList<Integer> prices) {
      int minimum = prices.get(0);
      int maxProfit = 0;
      for (int i = 1; i < prices.size(); i++) {
         int cost = prices.get(i) - minimum;
         maxProfit = Math.max(maxProfit, cost);
         minimum = Math.min(minimum, prices.get(i));
      }
      return maxProfit;
   }
}
