package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoinChangeTest {

   CoinChange classObj = new CoinChange();

   @Test
   void test_countWaysToMakeChange_expect4_whenNis3AndValueIs4() {
      int[] denominations = {1, 2, 3};
      Assertions.assertEquals(4, classObj.countWaysToMakeChange(denominations, 4));
   }

   @Test
   void test_countWaysToMakeChange_expect0_whenNis3AndValueIs1() {
      int[] denominations = {5, 3, 2};
      Assertions.assertEquals(0, classObj.countWaysToMakeChange(denominations, 1));
   }
}
