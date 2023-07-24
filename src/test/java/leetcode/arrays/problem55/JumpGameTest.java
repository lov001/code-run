package leetcode.arrays.problem55;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JumpGameTest {


   JumpGame classObj = new JumpGame();
   JumpGameRecursiveApproach classObj2 = new JumpGameRecursiveApproach();

   @Test
   void test_canJump_expectTrue_whenEndIndexIsReachable() {
      int[] input = {2, 3, 1, 1, 4};
      Assertions.assertTrue(classObj.canJump(input));
      Assertions.assertTrue(classObj2.canJump(input));
   }

   @Test
   void test_canJump_expectFalse_whenEndIndexIsNotReachable() {
      int[] input = {3, 2, 1, 0, 4};
      Assertions.assertFalse(classObj.canJump(input));
   }

   @Test
   void test_canJump_expectFalse_whenStartingPointIs0() {
      int[] input = {0, 2, 1, 0, 4};
      Assertions.assertFalse(classObj.canJump(input));
   }

   @Test
   void test_canJump_expectTrue_whenAll1s() {
      int[] input = {1, 1, 1, 1, 1};
      Assertions.assertTrue(classObj.canJump(input));
   }

   @Test
   void test_canJump_expectTrue_whenExceedLastIndex() {
      int[] input = {2, 0};
      Assertions.assertTrue(classObj.canJump(input));
      Assertions.assertTrue(classObj2.canJump(input));
   }

   @Test
   void test_canJump_expectTrue_when() {
      int[] input = {1, 3, 2};
      Assertions.assertTrue(classObj.canJump(input));
      Assertions.assertTrue(classObj2.canJump(input));
   }

   @Test
   void test_canJump_expectTrue_whenLAstTwoElementsIs0() {
      int[] input = {2, 5, 0, 0};
      Assertions.assertTrue(classObj.canJump(input));
      Assertions.assertTrue(classObj2.canJump(input));
   }
}
