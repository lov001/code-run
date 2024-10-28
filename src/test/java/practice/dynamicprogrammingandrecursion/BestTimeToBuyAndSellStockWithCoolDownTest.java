package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BestTimeToBuyAndSellStockWithCoolDownTest {

   BestTimeToBuySellStockWithCoolDown classObj = new BestTimeToBuySellStockWithCoolDown();

   @Test
   void test_maximumProfit_expect11_whenNIs5() {
      int[] values = {4, 9, 0, 4, 10};
      Assertions.assertEquals(11, classObj.stockProfit(values));
   }

   @Test
   void test_maximumProfit_expect3_whenNIs4() {
      int[] values = {1, 2, 3, 4};
      Assertions.assertEquals(3, classObj.stockProfit(values));
   }

   @Test
   void test_maximumProfit_expect0_whenNIs3() {
      int[] values = {5, 4, 3};
      Assertions.assertEquals(0, classObj.stockProfit(values));
   }
}
