package practice.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstMissingPositiveNumberTest {

   FirstMissingPositiveNumber classObj = new FirstMissingPositiveNumber();

   @Test
   void test_missingNumber_expect3_whenNIs3() {
      int[] input = {1, 2, 0};
      Assertions.assertEquals(3, classObj.firstMissingPositiveUsingSorting(input));
   }

   @Test
   void test_missingNumber_expect2_whenNIs4() {
      int[] input = {3, 4, -1, 1};
      Assertions.assertEquals(2, classObj.firstMissingPositiveUsingSorting(input));
   }

   @Test
   void test_missingNumber_expect1_whenNIs5() {
      int[] input = {7, 8, 9, 11, 12};
      Assertions.assertEquals(1, classObj.firstMissingPositiveUsingSorting(input));
   }

   @Test
   void test_missingNumber_expect2_whenNIs1() {
      int[] input = {1};
      Assertions.assertEquals(2, classObj.firstMissingPositiveUsingSorting(input));
   }

   @Test
   void test_missingNumber_expect1_whenNIs1() {
      int[] input = {2};
      Assertions.assertEquals(1, classObj.firstMissingPositiveUsingSorting(input));
   }

   @Test
   void test_missingNumber_expect3_whenNIs2() {
      int[] input = {2,1};
      Assertions.assertEquals(3, classObj.firstMissingPositiveUsingSorting(input));
   }
}
