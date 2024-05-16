package practice.bitmanipulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FlipBitToWinTest {

   FlipBitToWin classObj = new FlipBitToWin();

   @Test
   void test_maxOnes_expect8_whenNumberIs1775() {
      Assertions.assertEquals(8, classObj.maxOnes(1775));
      Assertions.assertEquals(8, classObj.longestSequence(1775));
      Assertions.assertEquals(8, classObj.flipBit(1775));
   }

   @Test
   void test_maxOnes_expect3_whenNumberIs12() {
      Assertions.assertEquals(3, classObj.maxOnes(12));
      Assertions.assertEquals(3, classObj.longestSequence(12));
      Assertions.assertEquals(3, classObj.flipBit(12));
   }

   @Test
   void test_maxOnes_expect1_whenNumberIs1() {
      Assertions.assertEquals(1, classObj.maxOnes(1));
      Assertions.assertEquals(1, classObj.longestSequence(1));
//      Assertions.assertEquals(1, classObj.flipBit(1));
   }

   @Test
   void test_maxOnes_expect2_whenNumberIs16() {
      Assertions.assertEquals(2, classObj.maxOnes(16));
      Assertions.assertEquals(2, classObj.longestSequence(16));
      Assertions.assertEquals(2, classObj.flipBit(16));
   }

   @Test
   void test_maxOnes_expect4_whenNumberIs15() {
      Assertions.assertEquals(4, classObj.maxOnes(15));
      Assertions.assertEquals(4, classObj.longestSequence(15));
//      Assertions.assertEquals(4, classObj.flipBit(15));
   }
}
