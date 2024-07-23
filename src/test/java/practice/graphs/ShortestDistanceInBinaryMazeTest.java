package practice.graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShortestDistanceInBinaryMazeTest {

   ShortestDistanceInBinaryMaze classObj = new ShortestDistanceInBinaryMaze();

   @Test
   void test_shortestPath_expect3_whenGivenGraph() {
      int[][] maze = {
         {1, 1, 1, 1},
         {1, 1, 0, 1},
         {1, 1, 1, 1},
         {1, 1, 0, 0},
         {1, 0, 0, 1}};
      int[] source = {0, 1};
      int[] destination = {2, 2};
      Assertions.assertEquals(3, classObj.shortestPath(maze, source, destination));
   }

   @Test
   void test_shortestPathMinusOne_expect_whenGivenGraph_() {
      int[][] maze = {
         {1, 1, 1, 1, 1},
         {1, 1, 1, 1, 1},
         {1, 1, 1, 1, 0},
         {1, 0, 1, 0, 1}};
      int[] source = {0, 0};
      int[] destination = {3, 4};
      Assertions.assertEquals(-1, classObj.shortestPath(maze, source, destination));
   }
}
