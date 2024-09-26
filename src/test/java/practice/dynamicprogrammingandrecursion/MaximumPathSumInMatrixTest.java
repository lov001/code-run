package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumPathSumInMatrixTest {

   MaximumPathSumInMatrix classObj = new MaximumPathSumInMatrix();

   @Test
   void test_getMaxPathSum_expect105_when4x4Matrix() {
      int[][] matrix = {
         {1, 2, 10, 4},
         {100, 3, 2, 1},
         {1, 1, 20, 2},
         {1, 2, 2, 1}
      };
      Assertions.assertEquals(105, classObj.getMaxPathSum(matrix));
      Assertions.assertEquals(105, classObj.getMaxPathSumTabulation(matrix));
   }

   @Test
   void test_getMaxPathSum_expect25_when3x3Matrix() {
      int[][] matrix = {
         {10, 2, 2},
         {3, 7, 2},
         {8, 1, 5}
      };
      Assertions.assertEquals(25, classObj.getMaxPathSum(matrix));
      Assertions.assertEquals(25, classObj.getMaxPathSumTabulation(matrix));
   }

   @Test
   void test_getMaxPathSum_expect17_when3x3Matrix() {
      int[][] matrix = {
         {1, 2, 3},
         {9, 8, 7},
         {4, 5, 6}
      };
      Assertions.assertEquals(17, classObj.getMaxPathSum(matrix));
      Assertions.assertEquals(17, classObj.getMaxPathSumTabulation(matrix));
   }

   @Test
   void test_getMaxPathSum_expect74_when4x6Matrix() {
      int[][] matrix = {
         {10, 10, 2, -13, 20, 4},
         {1, -9, -81, 30, 2, 5},
         {0, 10, 4, -79, 2, -10},
         {1, -5, 2, 20, -11, 4}
      };
      Assertions.assertEquals(74, classObj.getMaxPathSum(matrix));
      Assertions.assertEquals(74, classObj.getMaxPathSumTabulation(matrix));
   }

   @Test
   void test_getMaxPathSum_expect19200_when5x5Matrix() {
      int[][] matrix = {
         {-9999, -9888, -9777, -9666, -9555},
         {1, 10, 2, 4, 5},
         {-9999, -9888, -9777, -9666, -9555},
         {0, 0, 0, 0, 0},
         {-99, -98, -97, -96, -95}
      };
      Assertions.assertEquals(-19200, classObj.getMaxPathSum(matrix));
      Assertions.assertEquals(-19200, classObj.getMaxPathSumTabulation(matrix));
   }
}
