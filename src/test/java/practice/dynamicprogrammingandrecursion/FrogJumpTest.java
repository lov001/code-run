package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FrogJumpTest {

   FrogJump classObj = new FrogJump();

   @Test
   void test_jump_expect20_whenInputIsOfSize4() {
      int[] heights = {10, 20, 30, 10};
      Assertions.assertEquals(20, classObj.jump(4, heights));
      Assertions.assertEquals(20, classObj.frogJump(4, heights));
   }

   @Test
   void test_jump_expect0_whenInputIsOfSize3() {
      int[] heights = {10, 50, 10};
      Assertions.assertEquals(0, classObj.jump(3, heights));
      Assertions.assertEquals(0, classObj.frogJump(3, heights));
   }

   @Test
   void test_jump_expect7_whenInputIsOfSize8() {
      int[] heights = {7, 4, 4, 2, 6, 6, 3, 4};
      Assertions.assertEquals(7, classObj.jump(8, heights));
      Assertions.assertEquals(7, classObj.frogJump(8, heights));
   }

   @Test
   void test_jump_expect2_whenInputIsOfSize6() {
      int[] heights = {4, 8, 3, 10, 4, 4};
      Assertions.assertEquals(2, classObj.jump(6, heights));
      Assertions.assertEquals(2, classObj.frogJump(6, heights));
   }
}
