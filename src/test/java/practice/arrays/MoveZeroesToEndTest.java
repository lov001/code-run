package practice.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoveZeroesToEndTest {

   MoveZeroesToEnd classObj = new MoveZeroesToEnd();

   @Test
   void test_moveZerosBruteForceByK_expect5_whenNIs6() {
      int[] input = {1, 2, 0, 0, 2, 3};
      int[] output = {1, 2, 2, 3, 0, 0};
      Assertions.assertArrayEquals(output, classObj.moveZerosBruteForce(6, input));
   }

   @Test
   void test_moveZerosBruteForceByK_expect8_wheNIs4() {
      int[] input = {0, 0, 0, 1};
      int[] output = {1, 0, 0, 0};
      Assertions.assertArrayEquals(output, classObj.moveZerosBruteForce(4, input));
   }

   @Test
   void test_moveZerosOptimised_expect5_whenNIs6() {
      int[] input = {1, 2, 0, 0, 2, 3};
      int[] output = {1, 2, 2, 3, 0, 0};
      Assertions.assertArrayEquals(output, classObj.moveZerosOptimised(6, input));
   }

   @Test
   void test_moveZerosOptimised_expect8_wheNIs4() {
      int[] input = {0, 0, 0, 1};
      int[] output = {1, 0, 0, 0};
      Assertions.assertArrayEquals(output, classObj.moveZerosOptimised(4, input));
   }
}
