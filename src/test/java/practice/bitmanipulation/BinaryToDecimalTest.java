package practice.bitmanipulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinaryToDecimalTest {

   BinaryToDecimal classObj = new BinaryToDecimal();

   @Test
   void test_convertBinaryToDecimal_expect85_whenConvertedNumber1010101() {
      Assertions.assertEquals(85, classObj.convert(7, "1010101"));
   }

   @Test
   void test_convertBinaryToDecimal_expect11_whenNumberIs1010101() {
      Assertions.assertEquals(11, classObj.convert(4, "1011"));
   }


   @Test
   void test_convertBinaryToDecimal_expect15_whenNumberIs1111() {
      Assertions.assertEquals(15, classObj.convert(4, "1111"));
   }

   @Test
   void test_convertBinaryToDecimal_expect0_whenNumberIsZero() {
      Assertions.assertEquals(0, classObj.convert(1, "0"));
   }
}
