package leetcode.arrays.problem189;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RotateArrayTest {


   RotateArray classObj = new RotateArray();

   @Test
   void test_rotate_expect_whenRotatingFactorIs3() {
      int[] input = {1, 2, 3, 4, 5, 6, 7};
      int[] output = {5, 6, 7, 1, 2, 3, 4};
      classObj.rotate(input, 3);
      Assertions.assertArrayEquals(output, input);
   }

   @Test
   void test_rotate_expect_whenRotatingFactorIs2() {
      int[] input = {-1, -100, 3, 99};
      int[] output = {3, 99, -1, -100};
      classObj.rotate(input, 2);
      Assertions.assertArrayEquals(output, input);
   }

   @Test
   void test_rotate_expect_whenOnlyOneElementAndRotatingFactorIs2() {
      int[] input = {-1};
      int[] output = {-1};
      classObj.rotate(input, 2);
      Assertions.assertArrayEquals(output, input);
   }

   @Test
   void test_rotate_expect_whenOnlyTwoElementAndRotatingFactorIs3() {
      int[] input = {1, 2};
      int[] output = {2, 1};
      classObj.rotate(input, 3);
      Assertions.assertArrayEquals(output, input);
   }
}
