package practice.bitmanipulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinaryToStringTest {

   BinaryToString classObj = new BinaryToString();

   @Test
   void test_convertBinaryToString_expectERROR_whenConvertedNumberLengthIsGreaterThan32() {
      double input = 0.101;
      Assertions.assertEquals("ERROR", classObj.convertBinaryToString(input));
   }

   @Test
   void test_convertBinaryToString_expectResult_whenNumberIsZeroPointTwoFive() {
      double input = 0.25;
      Assertions.assertEquals(".01", classObj.convertBinaryToString(input));
   }


   @Test
   void test_convertBinaryToString_expectResult_whenNumberIsZeroPointSixTwoFive() {
      double input = 0.625;
      Assertions.assertEquals(".101", classObj.convertBinaryToString(input));
   }

   @Test
   void test_convertBinaryToString_expectERROR_whenNumberIsZeroPointSevenTwo() {
      double input = 0.72;
      Assertions.assertEquals("ERROR", classObj.convertBinaryToString(input));
   }
}
