package practice.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountInversionsTest {

   CountInversions classObj = new CountInversions();

   @Test
   void test_numberOfInversions_expect0_whenNIs5() {
      int[] input = {1, 2, 3, 4, 5};
      Assertions.assertEquals(0, classObj.numberOfInversions(input, 5));
   }

   @Test
   void test_numberOfInversions_expect7_whenNIs5() {
      int[] input = {5, 3, 2, 1, 4};
      Assertions.assertEquals(7, classObj.numberOfInversions(input, 5));
   }

   @Test
   void test_numberOfInversions_expect6_whenNIs4() {
      int[] input = {4, 3, 2, 1};
      Assertions.assertEquals(6, classObj.numberOfInversions(input, 4));
   }

   @Test
   void test_numberOfInversions_expect5_whenNIs5() {
      int[] input = {1, 20, 6, 4, 5};
      Assertions.assertEquals(5, classObj.numberOfInversions(input, 5));
   }

   @Test
   void test_numberOfInversions_expect10_whenNIs5() {
      int[] input = {5, 4, 3, 2, 1};
      Assertions.assertEquals(10, classObj.numberOfInversions(input, 5));
   }


   @Test
   void test_numberOfInversionsBruteForce_expect0_whenNIs5() {
      int[] input = {1, 2, 3, 4, 5};
      Assertions.assertEquals(0, classObj.numberOfInversionsBruteForce(input, 5));
   }

   @Test
   void test_numberOfInversionsBruteForce_expect7_whenNIs5() {
      int[] input = {5, 3, 2, 1, 4};
      Assertions.assertEquals(7, classObj.numberOfInversionsBruteForce(input, 5));
   }

   @Test
   void test_numberOfInversionsBruteForce_expect6_whenNIs4() {
      int[] input = {4, 3, 2, 1};
      Assertions.assertEquals(6, classObj.numberOfInversionsBruteForce(input, 4));
   }

   @Test
   void test_numberOfInversionsBruteForce_expect5_whenNIs5() {
      int[] input = {1, 20, 6, 4, 5};
      Assertions.assertEquals(5, classObj.numberOfInversionsBruteForce(input, 5));
   }

   @Test
   void test_numberOfInversionsBruteForce_expect10_whenNIs5() {
      int[] input = {5, 4, 3, 2, 1};
      Assertions.assertEquals(10, classObj.numberOfInversionsBruteForce(input, 5));
   }
}
