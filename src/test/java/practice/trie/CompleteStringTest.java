package practice.trie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CompleteStringTest {

   CompleteString classObj = new CompleteString();

   @Test
   void test_completeString_expectOutput_whenPerformed6Operations() {
      String[] input = {"n", "ni", "nin", "ninj", "ninja", "ninga"};
      Assertions.assertEquals("ninja", classObj.completeString(input));
   }

   @Test
   void test_completeString_expectOutput_whenPerformed5GivenOperations() {
      String[] input = {"g", "a", "ak", "szhkb", "hy"};
      Assertions.assertEquals("ak", classObj.completeString(input));
   }

   @Test
   void test_completeString_expectOutput_whenPerformed4GivenOperations() {
      String[] input = {"kez", "vfj", "vfjq", "vfjqo"};
      Assertions.assertEquals("None", classObj.completeString(input));
   }
}
