package practice.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubArraysWithXorKTest {

   SubArraysWithXorK classObj = new SubArraysWithXorK();

   @Test
   void test_subArraysWithSumKBruteForce_expect3_whenNIs4AndKIs2() {
      int[] input = {1, 2, 3, 2};
      Assertions.assertEquals(3, classObj.subArraysWithXorKBruteForce(input, 2));
      Assertions.assertEquals(3, classObj.subArraysWithXorK(input, 2));
   }

   @Test
   void test_subArraysWithSumKBruteForce_expect2_whenNIs4AndGoalIs3() {
      int[] input = {1, 2, 3, 3};
      Assertions.assertEquals(4, classObj.subArraysWithXorKBruteForce(input, 3));
      Assertions.assertEquals(4, classObj.subArraysWithXorK(input, 3));
   }
}
