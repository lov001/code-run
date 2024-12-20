package practice.slidingwindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumWindowSubstringTest {

   MinimumWindowSubstring classObj = new MinimumWindowSubstring();

   @Test
   void test_minSubString_expectStringOfLength5_whenNIs6AndMIs3() {
      Assertions.assertEquals("injas", classObj.minSubStringBruteForce("ninjas", "sin"));
      Assertions.assertEquals("injas", classObj.minSubString("ninjas", "sin"));
   }

   @Test
   void test_minSubString_expectStringOfLength4_whenNIs5AndMIs2() {
      Assertions.assertEquals("ight", classObj.minSubStringBruteForce("fight", "it"));
      Assertions.assertEquals("ight", classObj.minSubString("fight", "it"));
   }

   @Test
   void test_minSubString_expectStringOfLength5_whenNIs6AndMIs3_() {
      Assertions.assertEquals("codin", classObj.minSubStringBruteForce("coding", "cin"));
      Assertions.assertEquals("codin", classObj.minSubString("coding", "cin"));
   }
}
