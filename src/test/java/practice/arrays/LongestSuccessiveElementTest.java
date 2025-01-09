package practice.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestSuccessiveElementTest {

   LongestSuccessiveElement classObj = new LongestSuccessiveElement();

   @Test
   void test_largestElement_expect5_whenNIs6() {
      int[] input = {5, 8, 3, 2, 1, 4};
      Assertions.assertEquals(5, classObj.longestSuccessiveElementsBruteForce(input));
      Assertions.assertEquals(5, classObj.longestSuccessiveElementsUsingSorting(input));
   }
}
