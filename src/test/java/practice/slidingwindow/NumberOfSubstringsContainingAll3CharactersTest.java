package practice.slidingwindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfSubstringsContainingAll3CharactersTest {

   NumberOfSubStringsContainingAll3Characters classObj = new NumberOfSubStringsContainingAll3Characters();

   @Test
   void test_numberOfSubstrings_expect10_whenStringOfSize6() {
      String input = "abcabc";
      Assertions.assertEquals(10, classObj.numberOfSubstringsBruteForce(input));
      Assertions.assertEquals(10, classObj.numberOfSubstrings(input));
   }

   @Test
   void test_numberOfSubstrings_expect3_whenStringOfSize5() {
      String input = "aaacb";
      Assertions.assertEquals(3, classObj.numberOfSubstringsBruteForce(input));
      Assertions.assertEquals(3, classObj.numberOfSubstrings(input));
   }

   @Test
   void test_numberOfSubstrings_expect1_whenStringOfSize3() {
      String input = "abc";
      Assertions.assertEquals(1, classObj.numberOfSubstringsBruteForce(input));
      Assertions.assertEquals(1, classObj.numberOfSubstrings(input));
   }
}
