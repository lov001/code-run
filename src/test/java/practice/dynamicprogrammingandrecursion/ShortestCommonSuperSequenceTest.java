package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShortestCommonSuperSequenceTest {

   ShortestCommonSuperSequence classObj = new ShortestCommonSuperSequence();

   @Test
   void test_shortestSuperSequence_expectBgruoote_whenStringsOfLength5And5() {
      String s1 = "brute";
      String s2 = "groot";
      Assertions.assertEquals("bgruoote", classObj.shortestSuperSequence(s1, s2));
   }

   @Test
   void test_shortestSuperSequence_expectBleued_whenStringsOfLength5And4() {
      String s1 = "bleed";
      String s2 = "blue";
      Assertions.assertEquals("bleued", classObj.shortestSuperSequence(s1, s2));
   }

   @Test
   void test_shortestSuperSequence_expectCodningjas_whenStringsOfLength6And6() {
      String s1 = "coding";
      String s2 = "ninjas";
      Assertions.assertEquals("codningjas", classObj.shortestSuperSequence(s1, s2));
   }
}
