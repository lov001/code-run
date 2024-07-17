package practice.graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShortestPathInUndirectedGraphTest {

   ShortestPathInUndirectedGraph classObj = new ShortestPathInUndirectedGraph();

   @Test
   void test_shortestPath_expect_whenGivenGraph() {
      int[][] input = {{0, 1}, {0, 3}, {3, 4}, {4, 5}, {5, 6}, {1, 2}, {2, 6}, {6, 7}, {7, 8},
         {6, 8}};
      int[] output = {0, 1, 2, 1, 2, 3, 3, 4, 4};
      Assertions.assertArrayEquals(output, classObj.shortestPath(input, 9, 10, 0));
   }

   @Test
   void test_shortestPath_expect_whenGivenGraph_() {
      int[][] input = {{0, 0}, {1, 1}, {1, 3}, {3, 0}};
      int[] output = {1, 1, -1, 0};
      Assertions.assertArrayEquals(output, classObj.shortestPath(input, 4, 4, 3));
   }

//   @Test
//   void test_shortestPath_expect_whenGivenGraph_1() {
//      int[][] input = {{0, 1}, {0, 3}, {3, 4}, {4, 5}, {5, 6}, {1, 2}, {2, 6}, {6, 7}, {7, 8},
//         {6, 8}};
//      int[] output = {0, 2, 1, -1};
//      Assertions.assertArrayEquals(output, classObj.shortestPath(input, 9, 10, 0));
//   }
}
