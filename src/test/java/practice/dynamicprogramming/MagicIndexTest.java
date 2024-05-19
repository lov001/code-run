package practice.dynamicprogramming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MagicIndexTest {

   MagicIndex classObj = new MagicIndex();

   @Test
   void test_expectMinusOne_whenMagicIndexNotPresent() {
      int[] input = {1, 2, 3, 4, 5};
      Assertions.assertEquals(-1, classObj.magicIndexBF(input));
      Assertions.assertEquals(-1, classObj.magicIndexUsingBinarySearch(input));
   }

   @Test
   void test_expect3_whenMagicIndexPresent() {
      int[] input = {-5, 0, 1, 3, 8, 15};
      Assertions.assertEquals(3, classObj.magicIndexBF(input));
      Assertions.assertEquals(3, classObj.magicIndexUsingBinarySearch(input));
   }

   @Test
   void test_expect7_whenMagicIndexPresent() {
      int[] input = {-40, -20, -1, 1, 2, 3, 5, 7, 9, 12, 13};
      Assertions.assertEquals(7, classObj.magicIndexBF(input));
      Assertions.assertEquals(7, classObj.magicIndexUsingBinarySearch(input));
   }

   @Test
   void test_expect2_whenMagicIndexPresentAndArrayContainsDuplicate() {
      int[] input = {-10, -5, 2, 2, 2, 3, 4, 7, 9, 12, 13};
      Assertions.assertEquals(2, classObj.magicIndexBF(input));
      Assertions.assertEquals(2, classObj.magicIndexUsingBinarySearch(input));
   }
}
