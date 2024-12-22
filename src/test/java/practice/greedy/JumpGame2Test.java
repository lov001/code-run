package practice.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JumpGame2Test {

   JumpGame2 classObj = new JumpGame2();

   @Test
   void test_canJump_expect2_whenNIs5() {
      int[] input = {2, 3, 1, 1, 4};
      Assertions.assertEquals(2, classObj.jumpBruteForceWithRecursion(input));
      Assertions.assertEquals(2, classObj.jumpRecursionOptimised(input));
      Assertions.assertEquals(2, classObj.jump(input));
   }

   @Test
   void test_canJump_expect2_whenNIs5_() {
      int[] input = {2, 3, 0, 1, 4};
      Assertions.assertEquals(2, classObj.jumpBruteForceWithRecursion(input));
      Assertions.assertEquals(2, classObj.jumpRecursionOptimised(input));
      Assertions.assertEquals(2, classObj.jump(input));
   }
}
