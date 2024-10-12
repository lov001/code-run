package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LengthOfLongestCommonPalindromicSubsequenceTest {

   LongestCommonPalindromicSubsequence classObj = new LongestCommonPalindromicSubsequence();

   @Test
   void test_lcs_expect4_whenBothStringOfLength5() {
      String s1 = "bbbab";
      Assertions.assertEquals(4, classObj.longestPalindromeSubsequence(s1));
   }

   @Test
   void test_lcs_expect2_whenStringOfLength4() {
      String s1 = "cbbd";
      Assertions.assertEquals(2, classObj.longestPalindromeSubsequence(s1));
   }
}
