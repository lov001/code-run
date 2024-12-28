package practice.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LargestElementInArrayTest {

   LargestElementInArray classObj = new LargestElementInArray();

   @Test
   void test_largestElement_expect5_whenNIs5() {
      int[] input = {1, 2, 3, 4, 5};
      Assertions.assertEquals(5, classObj.largestElement(input, 5));
   }

   @Test
   void test_largestElement_expect8_whenNIs6() {
      int[] input = {4, 7, 8, 6, 7, 6};
      Assertions.assertEquals(8, classObj.largestElement(input, 6));
   }
}
