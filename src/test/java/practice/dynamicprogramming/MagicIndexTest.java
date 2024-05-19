package practice.dynamicprogramming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MagicIndexTest {

   MagicIndex classObj = new MagicIndex();

   @Test
   void test_expectMinusOne_whenMagicIndexNotPresent() {
      int[] input = {1, 2, 3, 4, 5};
      Assertions.assertEquals(-1, classObj.magicIndexBF(input));
   }

   @Test
   void test_expect3_whenMagicIndexPresent() {
      int[] input = {-5, 0, 1, 3, 8, 15};
      Assertions.assertEquals(3, classObj.magicIndexBF(input));
   }
}
