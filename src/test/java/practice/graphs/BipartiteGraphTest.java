package practice.graphs;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BipartiteGraphTest {

   BipartiteGraph classObj = new BipartiteGraph();

   @Test
   void test_isBipartite_expectTrue_whenGraphIsLinear() {
      List<List<Integer>> adjacencyList = new ArrayList<>();
      adjacencyList.add(List.of(1));
      adjacencyList.add(List.of(0, 2));
      adjacencyList.add(List.of(1));
      Assertions.assertTrue(classObj.isBipartite(3, adjacencyList));
   }

   @Test
   void test_isBipartite_expectFalse_whenGraphContainsOddCycle() {
      List<List<Integer>> adjacencyList = new ArrayList<>();
      adjacencyList.add(List.of(2, 3));
      adjacencyList.add(List.of(3));
      adjacencyList.add(List.of(0, 3));
      adjacencyList.add(List.of(0, 1, 2));
      Assertions.assertFalse(classObj.isBipartite(4, adjacencyList));
   }

   @Test
   void test_isBipartite_expectFalse_whenGraphContainsBigOddCycle() {
      List<List<Integer>> adjacencyList = new ArrayList<>();
      adjacencyList.add(List.of(1));
      adjacencyList.add(List.of(0, 2, 5));
      adjacencyList.add(List.of(1, 3));
      adjacencyList.add(List.of(2, 4, 6));
      adjacencyList.add(List.of(3, 5));
      adjacencyList.add(List.of(1, 4));
      adjacencyList.add(List.of(3, 7));
      adjacencyList.add(List.of(6));
      Assertions.assertFalse(classObj.isBipartite(8, adjacencyList));
   }

   @Test
   void test_isBipartite_expectTrue_whenGraphContainsEvenCycle() {
      List<List<Integer>> adjacencyList = new ArrayList<>();
      adjacencyList.add(List.of(1));
      adjacencyList.add(List.of(0, 2, 4));
      adjacencyList.add(List.of(1, 3));
      adjacencyList.add(List.of(2, 4, 5));
      adjacencyList.add(List.of(1, 3));
      adjacencyList.add(List.of(3));
      Assertions.assertTrue(classObj.isBipartite(6, adjacencyList));
   }
}
