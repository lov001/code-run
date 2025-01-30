package practice.bitmanipulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfBitFlipsTest {

   NumberOfBitFlips classObj = new NumberOfBitFlips();

   @Test
   void test_numberOfFlips_expect2_whenAIs13AndBIs7() {
      Assertions.assertEquals(2, classObj.numberOfFlips(13, 7));
   }

   @Test
   void test_numberOfFlips_expect4_whenAIs15AndBIs20() {
      Assertions.assertEquals(4, classObj.numberOfFlips(15, 20));
   }
}
