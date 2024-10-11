package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestCommonSubsequenceTest {

   LongestCommonSubsequence classObj = new LongestCommonSubsequence();

   @Test
   void test_findLcs_expectBAB_whenStringsOfLength5And4() {
      String s1 = "abcab";
      String s2 = "cbab";
      Assertions.assertEquals("cab", classObj.findLCS(5, 4, s1, s2));
   }

   @Test
   void test_findLcs_expectBBA_whenStringsOfLength5And6() {
      String s1 = "ababa";
      String s2 = "cbbcad";
      Assertions.assertEquals("bba", classObj.findLCS(5, 6, s1, s2));
   }

   @Test
   void test_findLcs_expectEmptyString_whenStringsOfLength3And3() {
      String s1 = "xyz";
      String s2 = "abc";
      Assertions.assertEquals("", classObj.findLCS(3, 3, s1, s2));
   }
}
