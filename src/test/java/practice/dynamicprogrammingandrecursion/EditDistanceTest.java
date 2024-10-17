package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EditDistanceTest {

   EditDistance classObj = new EditDistance();

   @Test
   void test_editDistance_expect2_whenBothStringsOfLength3And2() {
      String s1 = "abc";
      String s2 = "dc";
      Assertions.assertEquals(2, classObj.editDistance(s1, s2));
   }

   @Test
   void test_editDistance_expect9_whenStringsOfLength11And6() {
      String s1 = "whgtdwhgtdg";
      String s2 = "aswcfg";
      Assertions.assertEquals(9, classObj.editDistance(s1, s2));
   }
}
