package practice.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SecondLargestElementInArrayTest {

   SecondLargestElementInArray classObj = new SecondLargestElementInArray();

   @Test
   void test_largestElement_expect4_whenNIs5() {
      int[] input = {1, 2, 3, 4, 5};
      Assertions.assertEquals(4, classObj.secondLargestElement(input, 5));
   }

   @Test
   void test_largestElement_expect7_whenNIs6() {
      int[] input = {4, 7, 8, 6, 7, 6};
      Assertions.assertEquals(7, classObj.secondLargestElement(input, 6));
   }
}
