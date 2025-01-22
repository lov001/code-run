package practice.bitmanipulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DecimalToBinaryTest {

   DecimalToBinary classObj = new DecimalToBinary();

   @Test
   void test_convertDecimalToBinary_expect85_whenConvertedNumber1010101() {
      Assertions.assertEquals("1010101", classObj.convert(85));
   }

   @Test
   void test_convertDecimalToBinary_expect11_whenNumberIs1010101() {
      Assertions.assertEquals("1011", classObj.convert(11));
   }


   @Test
   void test_convertDecimalToBinary_expect15_whenNumberIs1111() {
      Assertions.assertEquals("1111", classObj.convert(15));
   }

   @Test
   void test_convertDecimalToBinary_expect0_whenNumberIsZero() {
      Assertions.assertEquals("0", classObj.convert(0));
   }
}
