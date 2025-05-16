package practice.slidingwindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumSumOfKIntegersTest {

   MaximumSumOfKIntegers classObj = new MaximumSumOfKIntegers();

   @Test
   void test_maxSumOfKIntegers_expect700_whenNIs4AndKIs2() {
      int[] arr = {100, 200, 300, 400};
      int k = 2;
      int expectedResult = 700;
      int actualResult = classObj.maxSumOfKIntegers(arr, k);
      Assertions.assertEquals(expectedResult, actualResult);
   }

   @Test
   void test_maxSumOfKIntegers_expect1602_whenNIs7AndKIs5() {
      int[] arr = {100, 200, 100, 400, 500, 2, 600};
      int k = 5;
      int expectedResult = 1602;
      int actualResult = classObj.maxSumOfKIntegers(arr, k);
      Assertions.assertEquals(expectedResult, actualResult);
   }
}
