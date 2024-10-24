package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BestTimeToBuyAndSellStockWithMaxKTest {

   BestTimeToBuyAndSellStockWithMaxK classObj = new BestTimeToBuyAndSellStockWithMaxK();

   @Test
   void test_maximumProfit_expect6_whenNIs7() {
      int[] values = {3, 3, 5, 0, 3, 1, 4};
      Assertions.assertEquals(6, classObj.maxProfit(values, 7, 2));
      Assertions.assertEquals(6, classObj.maxProfitTabulation(values, 7, 2));
      Assertions.assertEquals(6, classObj.maxProfitOptimised(values, 7, 2));
   }

   @Test
   void test_maximumProfit_expect7_whenNIs6() {
      int[] values = {3, 2, 6, 5, 0, 3};
      Assertions.assertEquals(7, classObj.maxProfit(values, 6, 2));
      Assertions.assertEquals(7, classObj.maxProfitTabulation(values, 6, 2));
      Assertions.assertEquals(7, classObj.maxProfitOptimised(values, 6, 2));
   }

   @Test
   void test_maximumProfit_expect9_whenNIs6() {
      int[] values = {1, 3, 1, 2, 4, 8};
      Assertions.assertEquals(9, classObj.maxProfit(values, 6, 2));
      Assertions.assertEquals(9, classObj.maxProfitTabulation(values, 6, 2));
      Assertions.assertEquals(9, classObj.maxProfitOptimised(values, 6, 2));
   }

   @Test
   void test_maximumProfit_expect0_whenNIs5() {
      int[] values = {5, 4, 3, 2, 1};
      Assertions.assertEquals(0, classObj.maxProfit(values, 5, 2));
      Assertions.assertEquals(0, classObj.maxProfitTabulation(values, 5, 2));
      Assertions.assertEquals(0, classObj.maxProfitOptimised(values, 5, 2));
   }

   @Test
   void test_maximumProfit_expect9_whenNIs5() {
      int[] values = {8, 5, 1, 3, 10};
      Assertions.assertEquals(9, classObj.maxProfit(values, 5, 2));
      Assertions.assertEquals(9, classObj.maxProfitTabulation(values, 5, 2));
      Assertions.assertEquals(9, classObj.maxProfitOptimised(values, 5, 2));
   }

   @Test
   void test_maximumProfit_expect0_whenNIs4() {
      int[] values = {10, 8, 6, 0};
      Assertions.assertEquals(0, classObj.maxProfit(values, 4, 2));
      Assertions.assertEquals(0, classObj.maxProfitTabulation(values, 4, 2));
      Assertions.assertEquals(0, classObj.maxProfitOptimised(values, 4, 2));
   }
}
