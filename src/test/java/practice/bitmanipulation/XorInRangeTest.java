package practice.bitmanipulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class XorInRangeTest {

   XorInRange classObj = new XorInRange();

   @Test
   void test_calculateXOR_expect0_whenAIs13AndBIs7() {
      Assertions.assertEquals(0, classObj.calculateXOR(0));
   }

   @Test
   void test_calculateXOR_expect3_whenAIs15AndBIs20() {
      Assertions.assertEquals(3, classObj.calculateXOR(2));
   }

   @Test
   void test_calculateXORWithinRange_expect0_whenAIs4AndBIs7() {
      Assertions.assertEquals(0, classObj.calculateXORWithinRange(4, 7));
   }

   @Test
   void test_calculateXORWithinRange_expect7_whenAIs9AndBIs14() {
      Assertions.assertEquals(7, classObj.calculateXORWithinRange(9, 14));
   }
}
