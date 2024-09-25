package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleMinimumPathSumTest {

   TriangleMinimumPathSum classObj = new TriangleMinimumPathSum();

   @Test
   void test_minimumPathSum_expect11_whenNIs4() {
      int[][] triangle = {
         {2},
         {3, 4},
         {6, 5, 7},
         {4, 1, 8, 3}
      };
      Assertions.assertEquals(11, classObj.minimumPathSum(triangle, 4));
      Assertions.assertEquals(11, classObj.minimumPathSumTabulation(triangle, 4));
      Assertions.assertEquals(11, classObj.minimumPathSumSpaceOptimisation(triangle, 4));
   }

   @Test
   void test_minimumPathSum_expectMinus10_whenNIs1() {
      int[][] triangle = {
         {-10}
      };
      Assertions.assertEquals(-10, classObj.minimumPathSum(triangle, 1));
      Assertions.assertEquals(-10, classObj.minimumPathSumTabulation(triangle, 1));
      Assertions.assertEquals(-10, classObj.minimumPathSumSpaceOptimisation(triangle, 1));
   }

   @Test
   void test_minimumPathSum_expect14_whenNIs4() {
      int[][] triangle = {
         {1},
         {2, 3},
         {4, 5, 6},
         {7, 8, 9, 10}
      };
      Assertions.assertEquals(14, classObj.minimumPathSum(triangle, 4));
      Assertions.assertEquals(14, classObj.minimumPathSumTabulation(triangle, 4));
      Assertions.assertEquals(14, classObj.minimumPathSumSpaceOptimisation(triangle, 4));
   }

   @Test
   void test_minimumPathSum_expectMinus1_whenNIs3() {
      int[][] triangle = {
         {5},
         {-1, 3},
         {22, 1, -9},
      };
      Assertions.assertEquals(-1, classObj.minimumPathSum(triangle, 3));
      Assertions.assertEquals(-1, classObj.minimumPathSumTabulation(triangle, 3));
      Assertions.assertEquals(-1, classObj.minimumPathSumSpaceOptimisation(triangle, 3));
   }
}
