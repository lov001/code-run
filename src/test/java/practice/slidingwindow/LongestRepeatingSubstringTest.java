
package practice.slidingwindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestRepeatingSubstringTest {

   LongestRepeatingSubstring classObj = new LongestRepeatingSubstring();

   @Test
   void test_longestRepeatingSubstring_expect3_whenKIs1() {
      String input = "AABC";
      Assertions.assertEquals(3, classObj.longestRepeatingSubstringBruteForce(input, 1));
   }

   @Test
   void test_longestRepeatingSubstring_expect4_whenKIs2() {
      String input = "ABCCAA";
      Assertions.assertEquals(4, classObj.longestRepeatingSubstringBruteForce(input, 2));
   }

   @Test
   void test_longestRepeatingSubstring_expect3_whenKIs3() {
      String input = "ABA";
      Assertions.assertEquals(3, classObj.longestRepeatingSubstringBruteForce(input, 3));
   }
}
