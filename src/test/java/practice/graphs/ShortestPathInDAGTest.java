package practice.graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShortestPathInDAGTest {

   ShortestPathInDAG classObj = new ShortestPathInDAG();

   @Test
   void test_shortestPath_expect_whenGivenGraph() {
      int[][] input = {{0, 1, 2}, {0, 2, 1}};
      int[] output = {0, 2, 1, -1};
      Assertions.assertArrayEquals(output, classObj.shortestPath(4, 2, input));
   }

   @Test
   void test_shortestPath_expect_whenGivenGraph_() {
      int[][] input = {{0, 1, 2}, {0, 4, 1}, {4, 5, 4}, {4, 2, 2}, {1, 2, 3}, {2, 3, 6}, {5, 3, 1}};
      int[] output = {0, 2, 3, 6, 1, 5};
      Assertions.assertArrayEquals(output, classObj.shortestPath(6, 7, input));
   }

   @Test
   void test_shortestPath_expect_whenGivenGraph_1() {
      int[][] input = {{0, 1, 2}, {1, 3, 1}, {2, 3, 3}, {4, 0, 3}, {4, 2, 1}, {5, 4, 1},
         {6, 4, 2}, {6, 5, 3}};
      int[] output = {0, 2, -1, 3, -1, -1, -1};
      Assertions.assertArrayEquals(output, classObj.shortestPath(7, 8, input));
   }
}
