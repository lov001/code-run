package practice.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SecondLargestAndSmallestElementInArrayTest {

   SecondLargestAndSmallestElementInArray classObj = new SecondLargestAndSmallestElementInArray();

   @Test
   void test_getSecondOrderElements_expect4And2_whenNIs5() {
      int[] input = {1, 2, 3, 4, 5};
      int[] expected = {4, 2};
      Assertions.assertArrayEquals(expected, classObj.getSecondOrderElements(5, input));
   }

   @Test
   void test_getSecondOrderElements_expect8And6_whenNIs6() {
      int[] input = {4, 7, 8, 6, 7, 6};
      int[] expected = {7, 6};
      Assertions.assertArrayEquals(expected, classObj.getSecondOrderElements(6, input));
   }
}
