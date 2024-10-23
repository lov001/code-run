package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BestTimeToBuyAndSellStock3Test {

   BestTimeToBuyAndSellStock3 classObj = new BestTimeToBuyAndSellStock3();

   @Test
   void test_maximumProfit_expect6_whenNIs7() {
      int[] values = {3, 3, 5, 0, 3, 1, 4};
      Assertions.assertEquals(6, classObj.maxProfit(values));
      Assertions.assertEquals(6, classObj.maxProfitTabulation(values));
   }

   @Test
   void test_maximumProfit_expect9_whenNIs6() {
      int[] values = {1, 3, 1, 2, 4, 8};
      Assertions.assertEquals(9, classObj.maxProfit(values));
      Assertions.assertEquals(9, classObj.maxProfitTabulation(values));
   }

   @Test
   void test_maximumProfit_expect0_whenNIs5() {
      int[] values = {5, 4, 3, 2, 1};
      Assertions.assertEquals(0, classObj.maxProfit(values));
      Assertions.assertEquals(0, classObj.maxProfitTabulation(values));
   }
}
