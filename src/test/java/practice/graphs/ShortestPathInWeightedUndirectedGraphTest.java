package practice.graphs;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShortestPathInWeightedUndirectedGraphTest {

   ShortestPathInWeightedUndirectedGraph classObj = new ShortestPathInWeightedUndirectedGraph();

   @Test
   void test_shortestPath_expect_whenGivenGraph() {
      int[][] input = {{1, 2, 2}, {2, 5, 5}, {2, 3, 4}, {1, 4, 1}, {4, 3, 3}, {3, 5, 1}};
      List<Integer> output = List.of(1, 4, 3, 5);
      Assertions.assertArrayEquals(new List[]{output},
         new List[]{classObj.shortestPath(5, 6, input)});
   }

   @Test
   void test_shortestPath_expect_whenGivenGraph_() {
      int[][] input = {{1, 2, 2}};
      List<Integer> output = List.of(1, 2);
      Assertions.assertArrayEquals(new List[]{output},
         new List[]{classObj.shortestPath(2, 1, input)});
   }

   @Test
   void test_shortestPath_expect_whenGivenGraph_1() {
      int[][] input = {};
      Assertions.assertArrayEquals(new List[]{List.of(-1)},
         new List[]{classObj.shortestPath(1, 0, input)});
   }
}
