package leetcode.arrays.problem189;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RotateArrayUsingAppendingTest {


   RotateArrayUsingAppending classObj = new RotateArrayUsingAppending();
   RotateArrayApproach2 classObj2 = new RotateArrayApproach2();
   RotateArrayApproach3RightShift classObj3 = new RotateArrayApproach3RightShift();
   RotateArrayApproach4Reversing classObj4 = new RotateArrayApproach4Reversing();

   @Test
   void test_rotate_expect_whenRotatingFactorIs3() {
      int[] input = {1, 2, 3, 4, 5, 6, 7};
      int[] input2 = {1, 2, 3, 4, 5, 6, 7};
      int[] input3 = {1, 2, 3, 4, 5, 6, 7};
      int[] input4 = {1, 2, 3, 4, 5, 6, 7};
      int[] output = {5, 6, 7, 1, 2, 3, 4};
      classObj.rotate(input, 3);
      classObj2.rotate(input2, 3);
      classObj3.rotate(input3, 3);
      classObj4.rotate(input4, 3);
      Assertions.assertArrayEquals(output, input);
      Assertions.assertArrayEquals(output, input2);
      Assertions.assertArrayEquals(output, input3);
      Assertions.assertArrayEquals(output, input4);
   }

   @Test
   void test_rotate_expect_whenRotatingFactorIs2() {
      int[] input = {-1, -100, 3, 99};
      int[] input2 = {-1, -100, 3, 99};
      int[] input3 = {-1, -100, 3, 99};
      int[] input4 = {-1, -100, 3, 99};
      int[] output = {3, 99, -1, -100};
      classObj.rotate(input, 2);
      classObj2.rotate(input2, 2);
      classObj3.rotate(input3, 2);
      classObj4.rotate(input4, 2);
      Assertions.assertArrayEquals(output, input);
      Assertions.assertArrayEquals(output, input2);
      Assertions.assertArrayEquals(output, input2);
      Assertions.assertArrayEquals(output, input4);
   }

   @Test
   void test_rotate_expect_whenOnlyOneElementAndRotatingFactorIs2() {
      int[] input = {-1};
      int[] input3 = {-1};
      int[] input4 = {-1};
      int[] output = {-1};
      classObj.rotate(input, 2);
      classObj3.rotate(input3, 2);
      classObj4.rotate(input4, 2);
      Assertions.assertArrayEquals(output, input);
      Assertions.assertArrayEquals(output, input3);
      Assertions.assertArrayEquals(output, input4);
   }

   @Test
   void test_rotate_expect_whenOnlyTwoElementAndRotatingFactorIs3() {
      int[] input = {1, 2};
      int[] input2 = {1, 2};
      int[] input3 = {1, 2};
      int[] input4 = {1, 2};
      int[] output = {2, 1};
      classObj.rotate(input, 3);
      classObj2.rotate(input2, 3);
      classObj3.rotate(input3, 3);
      classObj4.rotate(input4, 3);
      Assertions.assertArrayEquals(output, input);
      Assertions.assertArrayEquals(output, input2);
      Assertions.assertArrayEquals(output, input4);
   }
}
