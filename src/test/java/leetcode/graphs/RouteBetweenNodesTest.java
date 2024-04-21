package leetcode.graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import practice.graphs.Graph;
import practice.graphs.RouteBetweenNodes;

public class RouteBetweenNodesTest {

   RouteBetweenNodes classObj = new RouteBetweenNodes();

   @Test
   void test_isReachable_expectTrue_whenSourceIs1AndDestinationIs3() {
      Graph graph = new Graph(4);
      graph.addEdge(0, 1);
      graph.addEdge(0, 2);
      graph.addEdge(1, 2);
      graph.addEdge(2, 0);
      graph.addEdge(2, 3);
      graph.addEdge(3, 3);

      Assertions.assertTrue(classObj.isReachableUsingBFS(graph, 1, 3));
      Assertions.assertTrue(classObj.isReachableUsingDFS(graph, 1, 3));
   }

   @Test
   void test_isReachable_expectFalse_whenSourceIs3AndDestinationIs1() {
      Graph graph = new Graph(4);
      graph.addEdge(0, 1);
      graph.addEdge(0, 2);
      graph.addEdge(1, 2);
      graph.addEdge(2, 0);
      graph.addEdge(2, 3);
      graph.addEdge(3, 3);

      Assertions.assertFalse(classObj.isReachableUsingBFS(graph, 3, 1));
      Assertions.assertFalse(classObj.isReachableUsingDFS(graph, 3, 1));
   }

}
