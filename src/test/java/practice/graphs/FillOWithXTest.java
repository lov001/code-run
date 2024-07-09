package practice.graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FillOWithXTest {

   FillOWithX classObj = new FillOWithX();

   @Test
   void test_fill_expect_whenGivenMatrix() {
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
//      Assertions.assertArrayEquals(output, classObj.fill(5, 4, grid, "bfs"));
      Assertions.assertArrayEquals(output, classObj.fill(5, 4, grid, "dfs"));
   }

   @Test
   void test_fill_expect_whenGivenMatrix_() {
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
//      Assertions.assertArrayEquals(output, classObj.fill(5, 4, grid, "bfs"));
      Assertions.assertArrayEquals(output, classObj.fill(5, 4, grid, "dfs"));
   }
}
