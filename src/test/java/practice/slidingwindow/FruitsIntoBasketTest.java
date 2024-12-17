package practice.slidingwindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FruitsIntoBasketTest {

   FruitIntoBaskets classObj = new FruitIntoBaskets();

   @Test
   void test_findMaxFruits_expect2_whenNIs3() {
      int[] input = {1, 2, 3};
      Assertions.assertEquals(2, classObj.findMaxFruits(input, 3));
      Assertions.assertEquals(2, classObj.findMaxFruitsOptimised(input, 3));
      Assertions.assertEquals(2, classObj.findMaxFruitsBruteForce(input, 3));
   }

   @Test
   void test_findMaxFruits_expect3_whenNIs4() {
      int[] input = {1, 1, 2, 3};
      Assertions.assertEquals(3, classObj.findMaxFruits(input, 4));
      Assertions.assertEquals(3, classObj.findMaxFruitsOptimised(input, 4));
      Assertions.assertEquals(3, classObj.findMaxFruitsBruteForce(input, 4));
   }

   @Test
   void test_findMaxFruits_expect2_whenNIs4() {
      int[] input = {1, 2, 3, 4};
      Assertions.assertEquals(2, classObj.findMaxFruits(input, 4));
      Assertions.assertEquals(2, classObj.findMaxFruitsOptimised(input, 4));
      Assertions.assertEquals(2, classObj.findMaxFruitsBruteForce(input, 4));
   }

   @Test
   void test_findMaxFruits_expect5_whenNIs11() {
      int[] input = {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};
      Assertions.assertEquals(5, classObj.findMaxFruits(input, 11));
      Assertions.assertEquals(5, classObj.findMaxFruitsOptimised(input, 11));
      Assertions.assertEquals(5, classObj.findMaxFruitsBruteForce(input, 11));
   }
}
