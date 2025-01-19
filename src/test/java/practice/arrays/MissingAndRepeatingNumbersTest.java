package practice.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MissingAndRepeatingNumbersTest {

   MissingAndRepeatingNumbers classObj = new MissingAndRepeatingNumbers();

   @Test
   void test_findMissingRepeatingNumbersBruteForce_expect2And4_whenNIs4() {
      int[] input = {1, 2, 3, 2};
      int[] expected = {2, 4};
      int[] actual = classObj.findMissingRepeatingNumbersBruteForce(input);
      Assertions.assertArrayEquals(expected, actual);
   }

   @Test
   void test_findMissingRepeatingNumbersBruteForce_expect1And3_whenNIs3() {
      int[] input = {1, 2, 1};
      int[] expected = {1, 3};
      int[] actual = classObj.findMissingRepeatingNumbersBruteForce(input);
      Assertions.assertArrayEquals(expected, actual);
   }

   @Test
   void test_findMissingRepeatingNumbersHashing_expect2And4_whenNIs4() {
      int[] input = {1, 2, 3, 2};
      int[] expected = {2, 4};
      int[] actual = classObj.findMissingRepeatingNumbersHashing(input);
      Assertions.assertArrayEquals(expected, actual);
   }

   @Test
   void test_findMissingRepeatingNumbersHashing_expect1And3_whenNIs3() {
      int[] input = {1, 2, 1};
      int[] expected = {1, 3};
      int[] actual = classObj.findMissingRepeatingNumbersHashing(input);
      Assertions.assertArrayEquals(expected, actual);
   }

   @Test
   void test_findMissingRepeatingNumbersMathOperations_expect2And4_whenNIs4() {
      int[] input = {1, 2, 3, 2};
      int[] expected = {2, 4};
      int[] actual = classObj.findMissingRepeatingNumbersMathOperations(input);
      Assertions.assertArrayEquals(expected, actual);
   }

   @Test
   void test_findMissingRepeatingNumbersMathOperations_expect1And3_whenNIs3() {
      int[] input = {1, 2, 1};
      int[] expected = {1, 3};
      int[] actual = classObj.findMissingRepeatingNumbersMathOperations(input);
      Assertions.assertArrayEquals(expected, actual);
   }
}
