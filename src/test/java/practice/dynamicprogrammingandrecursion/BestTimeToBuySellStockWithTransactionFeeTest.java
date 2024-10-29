package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BestTimeToBuySellStockWithTransactionFeeTest {

   BestTimeToBuySellStockWithTransactionFee classObj = new BestTimeToBuySellStockWithTransactionFee();

   @Test
   void test_maximumProfit_expect1_whenNIs7AndFeeIs1() {
      int[] values = {1, 2, 3};
      Assertions.assertEquals(1, classObj.maximumProfit(values, 3, 1));
   }

   @Test
   void test_maximumProfit_expect3_whenNIs7AndFeeIs2() {
      int[] values = {1, 3, 5, 6};
      Assertions.assertEquals(3, classObj.maximumProfit(values, 4, 2));
   }
}
