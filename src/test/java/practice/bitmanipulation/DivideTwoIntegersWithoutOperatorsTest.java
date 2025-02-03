package practice.bitmanipulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivideTwoIntegersWithoutOperatorsTest {

   DivideTwoIntegersWithoutOperators classObj = new DivideTwoIntegersWithoutOperators();

   @Test
   void test_divideTwoInteger_expectMinus2_whenAIs7AndBIsMinus3() {
      Assertions.assertEquals(-2, classObj.divideTwoInteger(7, -3));
   }

   @Test
   void test_divideTwoInteger_expect3_whenAIs10AndBIs3() {
      Assertions.assertEquals(3, classObj.divideTwoInteger(10, 3));
   }
}
