package practice.graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlienDictionaryTest {

   AlienDictionary classObj = new AlienDictionary();

   @Test
   void test_findOrder_expectbdac_whenGivenInput() {
      String[] input = {"baa", "abcd", "abca", "cab", "cad"};
      Assertions.assertEquals("bdac", classObj.findOrder(input, 5, 4));
   }

   @Test
   void test_findOrder_expectcab_whenGivenInput() {
      String[] input = {"caa", "aaa", "aab"};
      Assertions.assertEquals("cab", classObj.findOrder(input, 3, 3));
   }
}
