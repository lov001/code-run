package practice.graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxConnectedGroupTest {

   MaximumConnectedGroup classObj = new MaximumConnectedGroup();


   @Test
   void test_maxConnection_expect1_whenSingleCellGrid() {
      int[][] grid = {{1}};
      Assertions.assertEquals(1, classObj.maxConnection(grid));
   }

   @Test
   void test_maxConnection_expect4_when2x2Grid() {
      int[][] grid = {{1, 1}, {0, 1}};
      Assertions.assertEquals(4, classObj.maxConnection(grid));
   }

   @Test
   void test_maxConnection_expect4_when2x2GridWithAll1s() {
      int[][] grid = {{1, 1}, {1, 1}};
      Assertions.assertEquals(4, classObj.maxConnection(grid));
   }

   @Test
   void test_maxConnection_expect7_when3x3Grid() {
      int[][] grid = {{1, 0, 1}, {1, 0, 1}, {1, 0, 1}};
      Assertions.assertEquals(7, classObj.maxConnection(grid));
   }

   @Test
   void test_maxConnection_expect20_when5x4Grid() {
      int[][] grid = {
         {1, 1, 0, 1, 1},
         {1, 1, 0, 1, 1},
         {1, 1, 0, 1, 1},
         {0, 0, 1, 0, 0},
         {0, 0, 1, 1, 1},
         {0, 0, 1, 1, 1}
      };
      Assertions.assertEquals(20, classObj.maxConnection(grid));
   }

}
