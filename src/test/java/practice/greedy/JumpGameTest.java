package practice.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JumpGameTest {

   JumpGame classObj = new JumpGame();

   @Test
   void test_canJump_expectTrue_whenNIs5() {
      int[] input = {2, 3, 1, 1, 4};
      Assertions.assertTrue(classObj.canJump(input));
   }

   @Test
   void test_canJump_expectFalse_whenNIs5() {
      int[] input = {3, 2, 1, 0, 4};
      Assertions.assertFalse(classObj.canJump(input));
   }
}
