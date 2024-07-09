package practice.graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FillOWithXTest {

   FillOWithX classObj = new FillOWithX();

   @Test
   void test_fill_expect_whenUsingDFS_() {
      char[][] grid = {
         {'X', 'X', 'X', 'X'},
         {'X', 'O', 'X', 'X'},
         {'X', 'O', 'O', 'X'},
         {'X', 'O', 'X', 'X'},
         {'X', 'X', 'O', 'O'}};
      char[][] output = {
         {'X', 'X', 'X', 'X'},
         {'X', 'X', 'X', 'X'},
         {'X', 'X', 'X', 'X'},
         {'X', 'X', 'X', 'X'},
         {'X', 'X', 'O', 'O'}};
      Assertions.assertArrayEquals(output, classObj.fill(5, 4, grid, "dfs"));
   }

   @Test
   void test_fill_expect_whenUsingDFS() {
      char[][] grid = {
         {'X', 'O', 'X', 'X'},
         {'X', 'O', 'X', 'X'},
         {'X', 'O', 'O', 'X'},
         {'X', 'O', 'X', 'X'},
         {'X', 'X', 'O', 'O'}};
      char[][] output = {
         {'X', 'O', 'X', 'X'},
         {'X', 'O', 'X', 'X'},
         {'X', 'O', 'O', 'X'},
         {'X', 'O', 'X', 'X'},
         {'X', 'X', 'O', 'O'}};
      Assertions.assertArrayEquals(output, classObj.fill(5, 4, grid, "dfs"));
   }

   @Test
   void test_fill_expect_whenUsingBFS_() {
      char[][] grid = {
         {'X', 'X', 'X', 'X'},
         {'X', 'O', 'X', 'X'},
         {'X', 'O', 'O', 'X'},
         {'X', 'O', 'X', 'X'},
         {'X', 'X', 'O', 'O'}};
      char[][] output = {
         {'X', 'X', 'X', 'X'},
         {'X', 'X', 'X', 'X'},
         {'X', 'X', 'X', 'X'},
         {'X', 'X', 'X', 'X'},
         {'X', 'X', 'O', 'O'}};
      Assertions.assertArrayEquals(output, classObj.fill(5, 4, grid, "bfs"));
   }

   @Test
   void test_fill_expect_whenUsingBFS() {
      char[][] grid = {
         {'X', 'O', 'X', 'X'},
         {'X', 'O', 'X', 'X'},
         {'X', 'O', 'O', 'X'},
         {'X', 'O', 'X', 'X'},
         {'X', 'X', 'O', 'O'}};
      char[][] output = {
         {'X', 'O', 'X', 'X'},
         {'X', 'O', 'X', 'X'},
         {'X', 'O', 'O', 'X'},
         {'X', 'O', 'X', 'X'},
         {'X', 'X', 'O', 'O'}};
      Assertions.assertArrayEquals(output, classObj.fill(5, 4, grid, "bfs"));
   }
}
