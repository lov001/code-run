package practice.slidingwindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestSubstringWithAtMostKDistinctCharactersTest {

   LongestSubstringWithAtMostKDistinctCharacters classObj = new LongestSubstringWithAtMostKDistinctCharacters();

   @Test
   void test_kDistinctCharsBruteForce_expect7_whenKIs2() {
      String input = "abbbbbbc";
      Assertions.assertEquals(7, classObj.kDistinctCharsBruteForce(2, input));
   }

   @Test
   void test_kDistinctCharsBruteForce_expect4_whenKIs3() {
      String input = "abcddefg";
      Assertions.assertEquals(4, classObj.kDistinctCharsBruteForce(3, input));
   }

   @Test
   void test_kDistinctCharsBruteForce_expect8_whenKIs3() {
      String input = "aaaaaaaa";
      Assertions.assertEquals(8, classObj.kDistinctCharsBruteForce(3, input));
   }

   @Test
   void test_kDistinctCharsBruteForce_expect1_whenKIs1() {
      String input = "abcefg";
      Assertions.assertEquals(1, classObj.kDistinctCharsBruteForce(1, input));
   }
}
