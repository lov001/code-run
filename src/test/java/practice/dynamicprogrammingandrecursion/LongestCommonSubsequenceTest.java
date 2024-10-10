package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestCommonSubsequenceTest {

   LongestCommonSubsequence classObj = new LongestCommonSubsequence();

   @Test
   void test_lcs_expect3_whenBothStringsOfLength5() {
      String s1 = "adebc";
      String s2 = "dcadb";
      Assertions.assertEquals(3, classObj.lcs(s1, s2));
   }

   @Test
   void test_lcs_expect0_whenStringsOfLength2And4() {
      String s1 = "ab";
      String s2 = "defg";
      Assertions.assertEquals(0, classObj.lcs(s1, s2));
   }
}
