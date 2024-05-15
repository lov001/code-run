package utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import practice.utils.NumberConversionUtil;

public class NumberConversionUtilTest {

   @Test
   void test_convertDecimalToBinary_expect1100_whenNumberIs12() {
      int number = 12;
      Assertions.assertEquals("1100", NumberConversionUtil.convertDecimalToBinary(number));
   }

   @Test
   void test_convertDecimalToBinary_expect101_whenNumberIs5() {
      int number = 5;
      Assertions.assertEquals("101", NumberConversionUtil.convertDecimalToBinary(number));
   }

   @Test
   void test_convertDecimalToBinary_expect101100100_whenNumberIs356() {
      int number =356;
      Assertions.assertEquals("101100100", NumberConversionUtil.convertDecimalToBinary(number));
   }
}
