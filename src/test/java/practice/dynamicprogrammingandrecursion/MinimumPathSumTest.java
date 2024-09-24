package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumPathSumTest {

   MinimumPathSum classObj = new MinimumPathSum();

   @Test
   void test_minPathSum_expect7_when3x3Grid() {
      int[][] grid = {
         {1, 3, 1},
         {1, 5, 1},
         {4, 2, 1}
      };
      Assertions.assertEquals(7, classObj.minPathSum(grid));
      Assertions.assertEquals(7, classObj.minPathSumTabulation(grid));
   }

   @Test
   void test_minPathSum_expect12_when2x3Grid() {
      int[][] grid = {
         {1, 2, 3},
         {4, 5, 6}
      };
      Assertions.assertEquals(12, classObj.minPathSum(grid));
      Assertions.assertEquals(12, classObj.minPathSumTabulation(grid));
   }
}
