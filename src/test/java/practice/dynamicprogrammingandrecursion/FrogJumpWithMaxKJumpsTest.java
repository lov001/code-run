package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FrogJumpWithMaxKJumpsTest {

   FrogJumpWithMaxKJumps classObj = new FrogJumpWithMaxKJumps();

   @Test
   void test_jump_expect20_whenInputIsOfSize4() {
      int[] heights = {10, 20, 30, 10};
      Assertions.assertEquals(20, classObj.jump(4, heights, 2));
      Assertions.assertEquals(20, classObj.jumpViaTabulation(4, heights, 2));
   }

   @Test
   void test_jump_expect0_whenInputIsOfSize3() {
      int[] heights = {10, 50, 10};
      Assertions.assertEquals(0, classObj.jump(3, heights, 2));
      Assertions.assertEquals(0, classObj.jumpViaTabulation(3, heights, 2));
   }

   @Test
   void test_jump_expect7_whenInputIsOfSize8() {
      int[] heights = {7, 4, 4, 2, 6, 6, 3, 4};
      Assertions.assertEquals(7, classObj.jump(8, heights, 2));
      Assertions.assertEquals(7, classObj.jumpViaTabulation(8, heights, 2));
   }

   @Test
   void test_jump_expect2_whenInputIsOfSize6() {
      int[] heights = {4, 8, 3, 10, 4, 4};
      Assertions.assertEquals(2, classObj.jump(6, heights, 2));
      Assertions.assertEquals(2, classObj.jumpViaTabulation(6, heights, 2));
   }
}
