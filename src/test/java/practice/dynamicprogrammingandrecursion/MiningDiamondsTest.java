package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MiningDiamondsTest {

   MiningDiamonds classObj = new MiningDiamonds();

   @Test
   void test_maxCoins_expect18_whenNIs2() {
      int[] input = {9, 1};
      Assertions.assertEquals(18, classObj.maxCoins(input));
      Assertions.assertEquals(18, classObj.maxCoinsTabulation(input));
   }

   @Test
   void test_maxCoins_expect120_whenNIs3() {
      int[] input = {7, 1, 8};
      Assertions.assertEquals(120, classObj.maxCoins(input));
      Assertions.assertEquals(120, classObj.maxCoinsTabulation(input));
   }

   @Test
   void test_maxCoins_expect110_whenNIs5() {
      int[] input = {1, 2, 3, 4, 5};
      Assertions.assertEquals(110, classObj.maxCoins(input));
      Assertions.assertEquals(110, classObj.maxCoinsTabulation(input));
   }

   @Test
   void test_maxCoins_expect136_whenNIs4() {
      int[] input = {1, 5, 2, 8};
      Assertions.assertEquals(136, classObj.maxCoins(input));
      Assertions.assertEquals(136, classObj.maxCoinsTabulation(input));
   }
}
