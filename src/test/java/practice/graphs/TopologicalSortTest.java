package practice.graphs;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TopologicalSortTest {

   TopologicalSort classObj = new TopologicalSort();

   @Test
   void test_topologicalSort_expectSortedNodes_whenActualNodesAre4() {
      List<List<Integer>> adjacencyList = new ArrayList<>();
      adjacencyList.add(List.of());
      adjacencyList.add(List.of(0));
      adjacencyList.add(List.of(0));
      adjacencyList.add(List.of(0));
      int[] output = {3, 2, 1, 0};
      int[] actualOutput = classObj.topologicalSort(4, adjacencyList);
      Assertions.assertArrayEquals(output, actualOutput);
   }

   @Test
   void test_topologicalSort_expectSortedNodes_whenActualNodesAre6() {
      List<List<Integer>> adjacencyList = new ArrayList<>();
      adjacencyList.add(List.of());
      adjacencyList.add(List.of(3));
      adjacencyList.add(List.of(3));
      adjacencyList.add(List.of());
      adjacencyList.add(List.of(0, 1));
      adjacencyList.add(List.of(0, 2));
      int[] output = {5, 4, 2, 1, 3, 0};
      int[] actualOutput = classObj.topologicalSort(6, adjacencyList);
      Assertions.assertArrayEquals(output, actualOutput);
   }

   @Test
   void test_topologicalSort_expectSortedNodes__whenActualNodesAre6() {
      List<List<Integer>> adjacencyList = new ArrayList<>();
      adjacencyList.add(List.of());
      adjacencyList.add(List.of());
      adjacencyList.add(List.of(3));
      adjacencyList.add(List.of(1));
      adjacencyList.add(List.of(0, 1));
      adjacencyList.add(List.of(0, 2));
      int[] output = {5, 4, 2, 3, 1, 0};
      int[] actualOutput = classObj.topologicalSort(6, adjacencyList);
      Assertions.assertArrayEquals(output, actualOutput);
   }
}
