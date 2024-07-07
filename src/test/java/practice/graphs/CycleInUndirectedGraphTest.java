package practice.graphs;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CycleInUndirectedGraphTest {

   CycleInUndirectedGraph classObj = new CycleInUndirectedGraph();

   @Test
   void test_isCycle_expectTrue_when5Nodes() {
      List<List<Integer>> adjacencyList = new ArrayList<>();
      adjacencyList.add(List.of(1));
      adjacencyList.add(List.of(0, 2, 4));
      adjacencyList.add(List.of(1, 3));
      adjacencyList.add(List.of(2, 4));
      adjacencyList.add(List.of(1, 3));
      Assertions.assertTrue(classObj.isCycle(5, adjacencyList));
   }

   @Test
   void test_isCycle_expectFalse_whenOnly4Nodes() {
      List<List<Integer>> adjacencyList = new ArrayList<>();
      adjacencyList.add(List.of());
      adjacencyList.add(List.of(2));
      adjacencyList.add(List.of(1, 3));
      adjacencyList.add(List.of(2));
      Assertions.assertFalse(classObj.isCycle(4, adjacencyList));
   }
}
