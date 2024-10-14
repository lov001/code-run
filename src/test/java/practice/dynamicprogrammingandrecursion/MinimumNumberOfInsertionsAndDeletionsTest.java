package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumNumberOfInsertionsAndDeletionsTest {

   MinimumNumberOfInsertionsAndDeletions classObj = new MinimumNumberOfInsertionsAndDeletions();

   @Test
   void test_canYouMake_expect3_whenStringOfLength4And3() {
      String s1 = "abcd";
      String s2 = "anc";
      Assertions.assertEquals(3, classObj.canYouMake(s1, s2));
   }

   @Test
   void test_canYouMake_expect1_whenStringOfLength3And2() {
      String s1 = "aaa";
      String s2 = "aa";
      Assertions.assertEquals(1, classObj.canYouMake(s1, s2));
   }

   @Test
   void test_canYouMake_expect8_whenStringOfLength3And5() {
      String s1 = "edl";
      String s2 = "xcqja";
      Assertions.assertEquals(8, classObj.canYouMake(s1, s2));
   }
}
