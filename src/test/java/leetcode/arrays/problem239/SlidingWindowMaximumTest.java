package leetcode.arrays.problem239;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SlidingWindowMaximumTest {


   SlidingWindowMaximum classObj = new SlidingWindowMaximum();

   @Test
   void test_maxSlidingWindow_expect_when() {
      int[] input = {1, 3, -1, -3, 5, 3, 6, 7};
      int[] output = {3, 3, 5, 5, 6, 7};
      Assertions.assertEquals(Arrays.toString(output),
          Arrays.toString(classObj.maxSlidingWindow(input, 3)));
   }

   @Test
   void test_maxSlidingWindow_expect_whenInputIs1() {
      int[] input = {1};
      int[] output = {1};
      Assertions.assertEquals(Arrays.toString(output),
          Arrays.toString(classObj.maxSlidingWindow(input, 1)));
   }

}
