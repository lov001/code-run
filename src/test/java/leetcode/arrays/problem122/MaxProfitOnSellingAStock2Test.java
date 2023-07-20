package leetcode.arrays.problem122;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxProfitOnSellingAStock2Test {


   MaxProfitOnSellingAStock2 classObj = new MaxProfitOnSellingAStock2();

   @Test
   void test_maxProfit_expect7_when() {
      int[] input = {7, 1, 5, 3, 6, 4};
      Assertions.assertEquals(7, classObj.maxProfit(input));
   }

   @Test
   void test_maxProfit_expect4_when() {
      int[] input = {1, 2, 3, 4, 5};
      Assertions.assertEquals(4, classObj.maxProfit(input));
   }

   @Test
   void test_maxProfit_expect0_when() {
      int[] input = {7, 6, 4, 3, 1};
      Assertions.assertEquals(0, classObj.maxProfit(input));
   }
}
