package practice.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindNumberOfRotationsTest {

   FindNumberOfRotations classObj = new FindNumberOfRotations();

   @Test
   void test_findKRotation_expect3_whenNIs5() {
      int[] input = {3, 4, 5, 1, 2};
      Assertions.assertEquals(3, classObj.findKRotation(input));
   }

   @Test
   void test_findKRotation_expect3_whenNIs4() {
      int[] input = {2, 3, 4, 1};
      Assertions.assertEquals(3, classObj.findKRotation(input));
   }

   @Test
   void test_findKRotation_expect0_whenNIs3() {
      int[] input = {1, 2, 3};
      Assertions.assertEquals(0, classObj.findKRotation(input));
   }
}
