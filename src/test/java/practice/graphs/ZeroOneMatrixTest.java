package practice.graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ZeroOneMatrixTest {

   ZeroOneMatrix classObj = new ZeroOneMatrix();

   @Test
   void test_nearest_expect_whenGivenMatrix_() {
      int[][] grid = {{0, 0, 0}, {0, 1, 0}, {1, 0, 1}};
      int[][] output = {{2, 1, 2}, {1, 0, 1}, {0, 1, 0}};
      Assertions.assertArrayEquals(output, classObj.nearest(grid));
   }

   @Test
   void test_nearest_expect_whenGivenMatrix0() {
      int[][] grid = {{0, 1, 1, 0}, {1, 1, 0, 0}, {0, 0, 1, 1}};
      int[][] output = {{1, 0, 0, 1}, {0, 0, 1, 1}, {1, 1, 0, 0}};
      Assertions.assertArrayEquals(output, classObj.nearest(grid));
   }

   @Test
   void test_nearest_expect_whenGivenMatrix() {
      int[][] grid = {{1, 0, 1}, {1, 1, 0}, {1, 0, 0}};
      int[][] output = {{0, 1, 0}, {0, 0, 1}, {0, 1, 2}};
      Assertions.assertArrayEquals(output, classObj.nearest(grid));
   }
}
