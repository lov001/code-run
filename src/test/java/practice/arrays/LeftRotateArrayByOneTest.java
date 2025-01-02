package practice.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeftRotateArrayByOneTest {

   LeftRotateArrayByOne classObj = new LeftRotateArrayByOne();

   @Test
   void test_largestElement_expect5_whenNIs5() {
      int[] input = {1, 2, 3, 4, 5};
      int[] output = {2, 3, 4, 5, 1};
      Assertions.assertArrayEquals(output, classObj.rotateArray(input, 5));
   }

   @Test
   void test_largestElement_expect8_whenNIs6() {
      int[] input = {4, 7, 8, 6, 7, 6};
      int[] output = {7, 8, 6, 7, 6, 4};
      Assertions.assertArrayEquals(output, classObj.rotateArray(input, 6));
   }
}
