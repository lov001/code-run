package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumElementsTest {

   MinimumElements classObj = new MinimumElements();

   @Test
   void test_minimumElements_expect3_whenNIs3AndTargetIs7() {
      int[] input = {1, 2, 3};
      Assertions.assertEquals(3, classObj.minimumElements(input, 7));
      Assertions.assertEquals(3, classObj.minimumElementsUsingTabulation(input, 7));
   }

   @Test
   void test_minimumElements_expect0_whenNIs1AndTargetIs0() {
      int[] input = {1};
      Assertions.assertEquals(0, classObj.minimumElements(input, 0));
      Assertions.assertEquals(0, classObj.minimumElementsUsingTabulation(input, 0));
   }

   @Test
   void test_minimumElements_expect2_whenNIs3AndTargetIs4() {
      int[] input = {12, 1, 3};
      Assertions.assertEquals(2, classObj.minimumElements(input, 4));
      Assertions.assertEquals(2, classObj.minimumElementsUsingTabulation(input, 4));
   }

   @Test
   void test_minimumElements_expect6_whenNIs2AndTargetIs11() {
      int[] input = {2, 1};
      Assertions.assertEquals(6, classObj.minimumElements(input, 11));
      Assertions.assertEquals(6, classObj.minimumElementsUsingTabulation(input, 11));
   }
}
