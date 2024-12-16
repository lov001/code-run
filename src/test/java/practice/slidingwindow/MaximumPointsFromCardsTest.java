package practice.slidingwindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumPointsFromCardsTest {

   MaximumPointsFromCards classObj = new MaximumPointsFromCards();

   @Test
   void test_maxPoints_expect29_whenNIs7AndKIs4() {
      int[] input = {9, 7, 5, 3, 2, 1, 8};
      Assertions.assertEquals(29, classObj.maxPointsBruteForce(input, 4));
      Assertions.assertEquals(29, classObj.maxPoints(input, 4));
   }

   @Test
   void test_maxPoints_expect20_whenNIs5AndKIs3() {
      int[] input = {8, 7, 5, 3, 2};
      Assertions.assertEquals(20, classObj.maxPointsBruteForce(input, 3));
      Assertions.assertEquals(20, classObj.maxPoints(input, 3));
   }

   @Test
   void test_maxPoints_expect33_whenNIs5AndKIs5() {
      int[] input = {5, 4, 9, 7, 8};
      Assertions.assertEquals(33, classObj.maxPointsBruteForce(input, 5));
      Assertions.assertEquals(33, classObj.maxPoints(input, 5));
   }
}
