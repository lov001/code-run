package practice.dynamicprogrammingandrecursion;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BestTimeToBuyAndSellStockTest {

   BestTimeToBuyAndSellStock classObj = new BestTimeToBuyAndSellStock();

   @Test
   void test_maximumProfit_expect148_whenNIs4() {
      ArrayList<Integer> prices = new ArrayList<>();
      prices.add(2);
      prices.add(100);
      prices.add(150);
      prices.add(120);
      Assertions.assertEquals(148, classObj.maximumProfit(prices));
   }

   @Test
   void test_maximumProfit_expect3_whenNIs4() {
      ArrayList<Integer> prices = new ArrayList<>();
      prices.add(1);
      prices.add(2);
      prices.add(3);
      prices.add(4);
      Assertions.assertEquals(3, classObj.maximumProfit(prices));
   }

   @Test
   void test_maximumProfit_expect0_whenNIs4() {
      ArrayList<Integer> prices = new ArrayList<>();
      prices.add(2);
      prices.add(2);
      prices.add(2);
      prices.add(2);
      Assertions.assertEquals(0, classObj.maximumProfit(prices));
   }

   @Test
   void test_maximumProfit_expect3_whenNIs6() {
      ArrayList<Integer> prices = new ArrayList<>();
      prices.add(17);
      prices.add(20);
      prices.add(11);
      prices.add(9);
      prices.add(12);
      prices.add(6);
      Assertions.assertEquals(3, classObj.maximumProfit(prices));
   }

   @Test
   void test_maximumProfit_expect6_whenNIs4() {
      ArrayList<Integer> prices = new ArrayList<>();
      prices.add(98);
      prices.add(101);
      prices.add(66);
      prices.add(72);
      Assertions.assertEquals(6, classObj.maximumProfit(prices));
   }
}
