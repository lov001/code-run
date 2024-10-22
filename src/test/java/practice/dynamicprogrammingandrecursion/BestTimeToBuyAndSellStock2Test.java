package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BestTimeToBuyAndSellStock2Test {

   BestTimeToBuyAndSellStock2 classObj = new BestTimeToBuyAndSellStock2();

   @Test
   void test_maximumProfit_expect6_whenNIs7() {
      long[] values = {1, 2, 3, 4, 5, 6, 7};
      Assertions.assertEquals(6, classObj.getMaximumProfit(7, values));
      Assertions.assertEquals(6, classObj.getMaximumProfitTabulation(7, values));
      Assertions.assertEquals(6, classObj.getMaximumProfitSpaceOptimisation(7, values));
      Assertions.assertEquals(6, classObj.getMaximumProfitSpaceOptimisationUsingVariables(7, values));
   }

   @Test
   void test_maximumProfit_expect0_whenNIs7() {
      long[] values = {7, 6, 5, 4, 3, 2, 1};
      Assertions.assertEquals(0, classObj.getMaximumProfit(7, values));
      Assertions.assertEquals(0, classObj.getMaximumProfitTabulation(7, values));
      Assertions.assertEquals(0, classObj.getMaximumProfitSpaceOptimisation(7, values));
      Assertions.assertEquals(0, classObj.getMaximumProfitSpaceOptimisationUsingVariables(7, values));
   }
}
