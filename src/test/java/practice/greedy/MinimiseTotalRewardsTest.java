package practice.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimiseTotalRewardsTest {

   MinimiseTotalRewards classObj = new MinimiseTotalRewards();

   @Test
   void test_minRewards_expect4_whenNIs3() {
      int[] input = {1, 2, 2};
      Assertions.assertEquals(4, classObj.minRewards(input));
   }

   @Test
   void test_minRewards_expect3_whenNIs2() {
      int[] input = {1, 2};
      Assertions.assertEquals(3, classObj.minRewards(input));
   }

   @Test
   void test_minRewards_expect7_whenNIs4() {
      int[] input = {1, 5, 2, 1};
      Assertions.assertEquals(7, classObj.minRewards(input));
   }

   @Test
   void test_minRewards_expect6_whenNIs3() {
      int[] input = {5, 4, 3};
      Assertions.assertEquals(6, classObj.minRewards(input));
   }

   @Test
   void test_minRewards_expect12_whenNIs6() {
      int[] input = {15, 40, 32, 12, 17, 23};
      Assertions.assertEquals(12, classObj.minRewards(input));
   }
}
