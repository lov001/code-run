package practice.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SmallestDivisorTest {

   SmallestDivisor classObj = new SmallestDivisor();

   @Test
   void test_smallestDivisor_expect3_whenLimitIs8() {
      int[] input = {1, 2, 3, 4, 5};
      Assertions.assertEquals(3, classObj.smallestDivisorBruteForce(input, 8));
      Assertions.assertEquals(3, classObj.smallestDivisor(input, 8));
   }

   @Test
   void test_smallestDivisor_expect2_whenLimitIs10() {
      int[] input = {8, 4, 2, 3};
      Assertions.assertEquals(2, classObj.smallestDivisorBruteForce(input, 10));
      Assertions.assertEquals(2, classObj.smallestDivisor(input, 10));
   }

   @Test
   void test_smallestDivisor_expect3_whenLimitIs11() {
      int[] input = {2, 3, 5, 7, 11};
      Assertions.assertEquals(3, classObj.smallestDivisorBruteForce(input, 11));
      Assertions.assertEquals(3, classObj.smallestDivisor(input, 11));
   }
}
