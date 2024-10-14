package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumInsertionsForPalindromeTest {

   MinimumInsertionsForPalindrome classObj = new MinimumInsertionsForPalindrome();

   @Test
   void test_minInsertion_expect1_whenStringOfLength4() {
      String s1 = "abca";
      Assertions.assertEquals(1, classObj.minInsertion(s1));
   }

   @Test
   void test_minInsertion_expect6_whenStringOfLength7() {
      String s1 = "abcdefg";
      Assertions.assertEquals(6, classObj.minInsertion(s1));
   }

   @Test
   void test_minInsertion_expect0_whenStringOfLength5() {
      String s1 = "aaaaa";
      Assertions.assertEquals(0, classObj.minInsertion(s1));
   }
}
