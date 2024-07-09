package practice.graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfEnclavesTest {

   NumberOfEnclaves classObj = new NumberOfEnclaves();

   @Test
   void test_numberOfEnclaves_expect3_whenUsingDFS_() {
      int[][] grid = {
         {0, 0, 0, 0},
         {1, 0, 1, 0},
         {0, 1, 1, 0},
         {0, 0, 0, 0}};
      Assertions.assertEquals(3, classObj.numberOfEnclaves(grid, "dfs"));
   }

   @Test
   void test_numberOfEnclaves_expect4_whenUsingDFS() {
      int[][] grid = {
         {0, 0, 0, 1},
         {0, 1, 1, 0},
         {0, 1, 1, 0},
         {0, 0, 0, 1},
         {0, 1, 1, 0}};
      Assertions.assertEquals(4, classObj.numberOfEnclaves(grid, "dfs"));
   }

   @Test
   void test_numberOfEnclaves_expect3_whenUsingBFS_() {
      int[][] grid = {
         {0, 0, 0, 0},
         {1, 0, 1, 0},
         {0, 1, 1, 0},
         {0, 0, 0, 0}};
      Assertions.assertEquals(3, classObj.numberOfEnclaves(grid, "bfs"));
   }

   @Test
   void test_numberOfEnclaves_expect4_whenUsingBFS() {
      int[][] grid = {
         {0, 0, 0, 1},
         {0, 1, 1, 0},
         {0, 1, 1, 0},
         {0, 0, 0, 1},
         {0, 1, 1, 0}};
      Assertions.assertEquals(4, classObj.numberOfEnclaves(grid, "bfs"));
   }
}
