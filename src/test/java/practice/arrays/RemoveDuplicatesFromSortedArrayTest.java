package practice.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesFromSortedArrayTest {

   RemoveDuplicatesFromSortedArray classObj = new RemoveDuplicatesFromSortedArray();

   @Test
   void test_removeDuplicates_expect3_whenNIs5() {
      int[] input = {1, 2, 2, 2, 3};
      Assertions.assertEquals(3, classObj.removeDuplicates(input, 5));
   }

   @Test
   void test_removeDuplicates_expect5_whenNIs6() {
      int[] input = {1, 2, 2, 3, 3, 3, 4, 4, 5, 5};
      Assertions.assertEquals(5, classObj.removeDuplicates(input, 10));
   }

   @Test
   void test_removeDuplicates_expect5_whenNIs9() {
      int[] input = {1, 1, 2, 3, 3, 4, 5, 5, 5};
      Assertions.assertEquals(5, classObj.removeDuplicates(input, 9));
   }
}
