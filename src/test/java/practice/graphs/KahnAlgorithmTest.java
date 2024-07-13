package practice.graphs;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KahnAlgorithmTest {

   KahnAlgorithm classObj = new KahnAlgorithm();

   @Test
   void test_topologicalSort_expectSortedNodes_whenActualNodesAre4() {
      List<List<Integer>> adjacencyList = new ArrayList<>();
      adjacencyList.add(List.of());
      adjacencyList.add(List.of(0));
      adjacencyList.add(List.of(0));
      adjacencyList.add(List.of(0));
      int[] output = {1, 2, 3, 0};
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
      int[] output = {4, 5, 1, 0, 2, 3};
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
      int[] output = {4, 5, 0, 2, 3, 1};
      int[] actualOutput = classObj.topologicalSort(6, adjacencyList);
      Assertions.assertArrayEquals(output, actualOutput);
   }
}
