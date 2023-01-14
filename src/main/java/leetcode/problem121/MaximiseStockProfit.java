package leetcode.problem121;

public class MaximiseStockProfit {

    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }


    /*
    Failing for few scenarios 200/213 passed
    public int maxProfit(int[] prices) {
        int profit = 0, buy = 0, sell = 1;
        if (prices.length == 2 && prices[sell] - prices[buy] > 0) {
            return prices[sell] - prices[buy];
        }
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - prices[buy] >= prices[sell] - prices[buy]) {
                profit = prices[i] - prices[buy];
            }
            if (prices[buy] > prices[i]) {
                buy = i;
            }
            if (prices[sell] < prices[i]) {
                sell = i;
            }
        }
        return Math.max(profit, 0);
    }*/


    /*
    // Failing for large test suite as it involves O(npow(2)) complexity
    public int maxProfit(int[] prices) {
        int length = prices.length;
        int profit = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (prices[j] - prices[i] > profit) {
                    profit = prices[j] - prices[i];
                }
            }
        }
        return profit;
    }*/
}
