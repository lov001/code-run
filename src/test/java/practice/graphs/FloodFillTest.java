package practice.graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FloodFillTest {

   FloodFill classObj = new FloodFill();

   @Test
   void test_floodFill_expect_when3x3Image() {
      int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
      int[][] output = {{2, 2, 2}, {2, 2, 0}, {2, 0, 1}};
      Assertions.assertArrayEquals(output, classObj.floodFillBFS(image, 1, 1, 2));
   }

   @Test
   void test_floodFill_expect2_when10x10Image() {
      int[][] image = {
         {3, 2, 3, 1, 3, 1, 2, 1, 2, 3},
         {1, 3, 1, 2, 2, 3, 3, 3, 2, 2},
         {1, 1, 1, 2, 1, 1, 3, 2, 2, 3},
         {3, 1, 2, 3, 1, 3, 1, 1, 2, 3},
         {3, 3, 1, 1, 2, 1, 2, 1, 3, 3},
         {2, 1, 3, 3, 3, 3, 3, 1, 1, 3},
         {2, 3, 1, 3, 2, 1, 1, 2, 2, 2},
         {1, 2, 2, 1, 2, 3, 2, 3, 1, 2},
         {3, 3, 3, 1, 1, 3, 3, 2, 1, 3},
         {1, 2, 2, 2, 3, 1, 1, 2, 1, 2}};
      int[][] output = {
         {3, 2, 3, 1, 3, 1, 2, 1, 2, 3},
         {1, 3, 1, 2, 2, 3, 3, 3, 2, 2},
         {1, 1, 1, 2, 3, 3, 3, 2, 2, 3},
         {3, 1, 2, 3, 3, 3, 1, 1, 2, 3},
         {3, 3, 1, 1, 2, 1, 2, 1, 3, 3},
         {2, 1, 3, 3, 3, 3, 3, 1, 1, 3},
         {2, 3, 1, 3, 2, 1, 1, 2, 2, 2},
         {1, 2, 2, 1, 2, 3, 2, 3, 1, 2},
         {3, 3, 3, 1, 1, 3, 3, 2, 1, 3},
         {1, 2, 2, 2, 3, 1, 1, 2, 1, 2}};

      Assertions.assertArrayEquals(output, classObj.floodFillBFS(image, 3, 4, 3));
   }
}
