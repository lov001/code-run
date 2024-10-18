package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WildcardPatternMatchingTest {

   WildcardPatternMatching classObj = new WildcardPatternMatching();

   @Test
   void test_wildcardMatching_expectTrue_whenPatternMatches() {
      String pattern = "?ay";
      String text = "ray";
      Assertions.assertTrue(classObj.wildcardMatching(pattern, text));
   }

   @Test
   void test_wildcardMatching_expectTrue_whenPatternMatches1() {
      String pattern = "ab*cd";
      String text = "abdefcd";
      Assertions.assertTrue(classObj.wildcardMatching(pattern, text));
   }

   @Test
   void test_wildcardMatching_expectFalse_whenPatternDoesNotMatches() {
      String pattern = "ab?d";
      String text = "abcc";
      Assertions.assertFalse(classObj.wildcardMatching(pattern, text));
   }
}
