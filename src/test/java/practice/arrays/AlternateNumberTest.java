package practice.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlternateNumberTest {

   AlternateNumbers classObj = new AlternateNumbers();

   @Test
   void test_alternateNumbersBruteForce_expect5_whenNIs4() {
      int[] input = {1, 2, -4, -5};
      int[] output = {1, -4, 2, -5};
      Assertions.assertArrayEquals(output, classObj.alternateNumbersBruteForce(input));
   }

   @Test
   void test_alternateNumbersBruteForce_expect8_whenNIs6() {
      int[] input = {1, 2, -3, -1, -2, 3};
      int[] output = {1, -3, 2, -1, 3, -2};
      Assertions.assertArrayEquals(output, classObj.alternateNumbersBruteForce(input));
   }

   @Test
   void test_alternateNumbersBruteForce_expect6_whenNIs4() {
      int[] input = {-2, -3, 4, 5};
      int[] output = {4, -2, 5, -3};
      Assertions.assertArrayEquals(output, classObj.alternateNumbersBruteForce(input));
   }

   @Test
   void test_alternateNumbers_expect5_whenNIs4() {
      int[] input = {1, 2, -4, -5};
      int[] output = {1, -4, 2, -5};
      Assertions.assertArrayEquals(output, classObj.alternateNumbers(input));
   }

   @Test
   void test_alternateNumbers_expect8_whenNIs6() {
      int[] input = {1, 2, -3, -1, -2, 3};
      int[] output = {1, -3, 2, -1, 3, -2};
      Assertions.assertArrayEquals(output, classObj.alternateNumbers(input));
   }

   @Test
   void test_alternateNumbers_expect6_whenNIs4() {
      int[] input = {-2, -3, 4, 5};
      int[] output = {4, -2, 5, -3};
      Assertions.assertArrayEquals(output, classObj.alternateNumbers(input));
   }
}
