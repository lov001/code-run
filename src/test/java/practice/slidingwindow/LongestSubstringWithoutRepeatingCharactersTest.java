package practice.slidingwindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {

   LongestSubstringWithoutRepeatingCharacters classObj = new LongestSubstringWithoutRepeatingCharacters();

   @Test
   void test_lengthOfLongestSubstring_expect3_whenStringOfLength5() {
      String input = "xyxyz";
      Assertions.assertEquals(3, classObj.lengthOfLongestSubstring(input));
      Assertions.assertEquals(3, classObj.lengthOfLongestSubstringBruteForce(input));
   }

   @Test
   void test_lengthOfLongestSubstring_expect1_whenStringOfLength3() {
      String input = "xxx";
      Assertions.assertEquals(1, classObj.lengthOfLongestSubstring(input));
      Assertions.assertEquals(1, classObj.lengthOfLongestSubstringBruteForce(input));
   }

   @Test
   void test_lengthOfLongestSubstring_expect5_whenStringOfLength10() {
      String input = "axbab 9xbb";
      Assertions.assertEquals(5, classObj.lengthOfLongestSubstring(input));
      Assertions.assertEquals(5, classObj.lengthOfLongestSubstringBruteForce(input));
   }

   @Test
   void test_lengthOfLongestSubstring_expect9_whenStringOfLength10() {
      String input = "@@$$c@ac3( 22@($2$ba@c2c1($2cc2c$2ca@13b 2@1 1b(c2ca(@$1cacb(1123 11b$bba a2(a2b(@ 1 $@( 3 22a2$(3a3";
      Assertions.assertEquals(9, classObj.lengthOfLongestSubstring(input));
      Assertions.assertEquals(9, classObj.lengthOfLongestSubstringBruteForce(input));
   }
}
