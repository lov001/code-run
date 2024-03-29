package leetcode.arrays.problem45;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JumpGameIITest {


   JumpGameII classObj = new JumpGameII();
   JumpGameIIBruteForce classObj2 = new JumpGameIIBruteForce();
   JumpGameIIApproach2 classObj3 = new JumpGameIIApproach2();

   @Test
   void test_canJump_expect2_whenEndIndexIsReachable() {
      int[] input = {2, 3, 1, 1, 4};
      Assertions.assertEquals(2, classObj.canJump(input));
      Assertions.assertEquals(2, classObj2.jumps(input));
      Assertions.assertEquals(2, classObj3.jumps(input));
   }

   @Test
   void test_canJump_expect4_whenAll1s() {
      int[] input = {1, 1, 1, 1, 1};
      Assertions.assertEquals(4, classObj.canJump(input));
      Assertions.assertEquals(4, classObj2.jumps(input));
      Assertions.assertEquals(4, classObj3.jumps(input));
   }

   @Test
   void test_canJump_expect1_whenJumpDirectlyOnLastIndex() {
      int[] input = {2, 0};
      Assertions.assertEquals(1, classObj.canJump(input));
      Assertions.assertEquals(1, classObj2.jumps(input));
      Assertions.assertEquals(1, classObj3.jumps(input));
   }

   @Test
   void test_canJump_expect2_whenLastTwoElementsIs0() {
      int[] input = {2, 5, 0, 0};
      Assertions.assertEquals(2, classObj.canJump(input));
      Assertions.assertEquals(2, classObj2.jumps(input));
      Assertions.assertEquals(2, classObj3.jumps(input));
   }
}
