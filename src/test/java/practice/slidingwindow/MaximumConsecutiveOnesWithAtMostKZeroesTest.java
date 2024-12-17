package practice.slidingwindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumConsecutiveOnesWithAtMostKZeroesTest {

   MaximumConsecutiveOnesWithAtMostKZeroes classObj = new MaximumConsecutiveOnesWithAtMostKZeroes();

   @Test
   void test_longestOnes_expect6_whenKIs2() {
      int[] input = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
      Assertions.assertEquals(6, classObj.longestOnesBruteForce(input, 2));
      Assertions.assertEquals(6, classObj.longestOnes(input, 2));
   }

   @Test
   void test_longestOnes_expect10_whenKIs3() {
      int[] input = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
      Assertions.assertEquals(10, classObj.longestOnesBruteForce(input, 3));
      Assertions.assertEquals(10, classObj.longestOnes(input, 3));
   }
}
