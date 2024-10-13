package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestCommonSubstringTest {

   LongestCommonSubstring classObj = new LongestCommonSubstring();

   @Test
   public void test_lcs_expect3_whenLongestSubstringIsOfLength3() {
      Assertions.assertEquals(3, classObj.lcs("abcjklp", "acjkp"));
   }

   @Test
   public void test_lcs_expect3_whenLongestSubstringIsOfLength3_() {
      Assertions.assertEquals(3, classObj.lcs("wasdijkl", "wsdjkl"));
   }

   @Test
   public void test_lcs_expect2_whenLongestSubstringIsOfLength2() {
      Assertions.assertEquals(2, classObj.lcs("tyfg", "cvbnuty"));
   }
}
