package practice.slidingwindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumWindowSubstringTest {

   MinimumWindowSubstring classObj = new MinimumWindowSubstring();

   @Test
   void test_minSubStringBruteForce_expectStringOfLength5_whenNIs6AndMIs3() {
      Assertions.assertEquals("injas", classObj.minSubStringBruteForce("ninjas", "sin"));
   }

   @Test
   void test_minSubStringBruteForce_expectStringOfLength4_whenNIs5AndMIs2() {
      Assertions.assertEquals("ight", classObj.minSubStringBruteForce("fight", "it"));
   }

   @Test
   void test_minSubStringBruteForce_expectStringOfLength5_whenNIs6AndMIs3_() {
      Assertions.assertEquals("codin", classObj.minSubStringBruteForce("coding", "cin"));
   }
}
