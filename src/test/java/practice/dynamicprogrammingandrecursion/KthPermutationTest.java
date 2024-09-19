package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KthPermutationTest {

   KthPermutation classObj = new KthPermutation();

   @Test
   void test_getPermutation_expect213_whenNIs3AndKIs3() {
      Assertions.assertEquals("213", classObj.getPermutation(3, 3));
   }

   @Test
   void test_getPermutation_expect2314_whenNIs4AndKIs9() {
      Assertions.assertEquals("2314", classObj.getPermutation(4, 9));
   }

   @Test
   void test_getPermutation_expect123_whenNIs3AndKIs1() {
      Assertions.assertEquals("123", classObj.getPermutation(3, 1));
   }
}
