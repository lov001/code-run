package practice.bitmanipulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FlipBitToWinTest {

   FlipBitToWin classObj = new FlipBitToWin();

   @Test
   void test_maxOnes_expect8_whenNumberIs1775() {
      Assertions.assertEquals(8, classObj.maxOnes(1775));
   }

   @Test
   void test_maxOnes_expect3_whenNumberIs12() {
      Assertions.assertEquals(3, classObj.maxOnes(12));
   }
}
