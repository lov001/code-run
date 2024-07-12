package practice.graphs;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CycleInDirectedGraphTest {

   CycleInDirectedGraph classObj = new CycleInDirectedGraph();

   @Test
   void test_isCycle_expectTrue_when4Nodes() {
      List<List<Integer>> adjacencyList = new ArrayList<>();
      adjacencyList.add(List.of(1));
      adjacencyList.add(List.of(2));
      adjacencyList.add(List.of(3));
      adjacencyList.add(List.of(3));
//      Assertions.assertTrue(classObj.isCycle(4, adjacencyList, "BFS"));
      Assertions.assertTrue(classObj.isCycle(4, adjacencyList, "DFS"));
   }

   @Test
   void test_isCycle_expectFalse_whenOnly3Nodes() {
      List<List<Integer>> adjacencyList = new ArrayList<>();
      adjacencyList.add(List.of(1));
      adjacencyList.add(List.of(2));
      adjacencyList.add(List.of());
//      Assertions.assertFalse(classObj.isCycle(3, adjacencyList, "BFS"));
      Assertions.assertFalse(classObj.isCycle(3, adjacencyList, "DFS"));
   }

   @Test
   void test_isCycle_expectTrue_when10Nodes() {
      List<List<Integer>> adjacencyList = new ArrayList<>();
      adjacencyList.add(List.of(1));
      adjacencyList.add(List.of(2));
      adjacencyList.add(List.of(3, 6));
      adjacencyList.add(List.of(4));
      adjacencyList.add(List.of(5));
      adjacencyList.add(List.of());
      adjacencyList.add(List.of(5));
      adjacencyList.add(List.of(8));
      adjacencyList.add(List.of(9));
      adjacencyList.add(List.of(7));
//      Assertions.assertTrue(classObj.isCycle(10, adjacencyList, "BFS"));
      Assertions.assertTrue(classObj.isCycle(10, adjacencyList, "DFS"));
   }
}
