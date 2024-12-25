package practice.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CandiesTest {

   Candies classObj = new Candies();

   @Test
   void test_requiredCandies_expect10_whenNIs6() {
      int[] input = {5, 8, 1, 5, 9, 4};
      Assertions.assertEquals(10, classObj.requiredCandies(input));
   }

   @Test
   void test_requiredCandies_expect3_whenNIs2() {
      int[] input = {1, 5};
      Assertions.assertEquals(3, classObj.requiredCandies(input));
   }

   @Test
   void test_requiredCandies_expect5_whenNIs5() {
      int[] input = {1, 1, 1, 1, 1};
      Assertions.assertEquals(5, classObj.requiredCandies(input));
   }

   @Test
   void test_requiredCandies_expect9_whenNIs5() {
      int[] input = {1, 5, 3, 4, 6};
      Assertions.assertEquals(9, classObj.requiredCandies(input));
   }

   @Test
   void test_requiredCandies_expect9_whenNIs6() {
      int[] input = {1, 9, 1, 3, 2, 4};
      Assertions.assertEquals(9, classObj.requiredCandies(input));
   }
}
