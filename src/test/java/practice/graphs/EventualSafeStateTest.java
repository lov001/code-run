package practice.graphs;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EventualSafeStateTest {

   EventualSafeState classObj = new EventualSafeState();

   @Test
   void test_eventualSafeNodes_expectListOfSize4_whenEventualNodesAre4() {
      List<List<Integer>> adjacencyList = new ArrayList<>();
      adjacencyList.add(List.of(1, 2));
      adjacencyList.add(List.of(2, 3));
      adjacencyList.add(List.of(5));
      adjacencyList.add(List.of(0));
      adjacencyList.add(List.of(5));
      adjacencyList.add(List.of());
      adjacencyList.add(List.of());
      List<Integer> output = List.of(2, 4, 5, 6);
      List<Integer> actualOutput = classObj.eventualSafeNodes(7, adjacencyList, "dfs");
      Assertions.assertEquals(output.size(), actualOutput.size());
      Assertions.assertArrayEquals(new List[]{output}, new List[]{actualOutput});
   }

   @Test
   void test_eventualSafeNodes_expectListOfSize8_whenEventualNodesAre8() {
      List<List<Integer>> adjacencyList = new ArrayList<>();
      adjacencyList.add(List.of(1));
      adjacencyList.add(List.of(2));
      adjacencyList.add(List.of(3));
      adjacencyList.add(List.of(4, 5));
      adjacencyList.add(List.of(6));
      adjacencyList.add(List.of(6));
      adjacencyList.add(List.of(7));
      adjacencyList.add(List.of());
      adjacencyList.add(List.of(1, 9));
      adjacencyList.add(List.of(10));
      adjacencyList.add(List.of(8));
      adjacencyList.add(List.of(9));
      List<Integer> output = List.of(0, 1, 2, 3, 4, 5, 6, 7);
      List<Integer> actualOutput = classObj.eventualSafeNodes(12, adjacencyList, "dfs");
      Assertions.assertEquals(output.size(), actualOutput.size());
      Assertions.assertArrayEquals(new List[]{output}, new List[]{actualOutput});
   }

   @Test
   void test_eventualSafeNodes_expectListOfSize1_whenEventualNodesAre1() {
      List<List<Integer>> adjacencyList = new ArrayList<>();
      adjacencyList.add(List.of(1));
      adjacencyList.add(List.of(2));
      adjacencyList.add(List.of(0, 3));
      adjacencyList.add(List.of());
      List<Integer> output = List.of(3);
      List<Integer> actualOutput = classObj.eventualSafeNodes(4, adjacencyList, "dfs");
      Assertions.assertEquals(output.size(), actualOutput.size());
      Assertions.assertArrayEquals(new List[]{output}, new List[]{actualOutput});
   }

   @Test
   void test_eventualSafeNodes_expectListOfSize4_whenEventualNodesAre4AndUsingBfs() {
      List<List<Integer>> adjacencyList = new ArrayList<>();
      adjacencyList.add(List.of(1, 2));
      adjacencyList.add(List.of(2, 3));
      adjacencyList.add(List.of(5));
      adjacencyList.add(List.of(0));
      adjacencyList.add(List.of(5));
      adjacencyList.add(List.of());
      adjacencyList.add(List.of());
      List<Integer> output = List.of(2, 4, 5, 6);
      List<Integer> actualOutput = classObj.eventualSafeNodes(7, adjacencyList, "bfs");
      Assertions.assertEquals(output.size(), actualOutput.size());
      Assertions.assertArrayEquals(new List[]{output}, new List[]{actualOutput});
   }

   @Test
   void test_eventualSafeNodes_expectListOfSize8_whenEventualNodesAre8AndUsingBfs() {
      List<List<Integer>> adjacencyList = new ArrayList<>();
      adjacencyList.add(List.of(1));
      adjacencyList.add(List.of(2));
      adjacencyList.add(List.of(3));
      adjacencyList.add(List.of(4, 5));
      adjacencyList.add(List.of(6));
      adjacencyList.add(List.of(6));
      adjacencyList.add(List.of(7));
      adjacencyList.add(List.of());
      adjacencyList.add(List.of(1, 9));
      adjacencyList.add(List.of(10));
      adjacencyList.add(List.of(8));
      adjacencyList.add(List.of(9));
      List<Integer> output = List.of(0, 1, 2, 3, 4, 5, 6, 7);
      List<Integer> actualOutput = classObj.eventualSafeNodes(12, adjacencyList, "bfs");
      Assertions.assertEquals(output.size(), actualOutput.size());
      Assertions.assertArrayEquals(new List[]{output}, new List[]{actualOutput});
   }

   @Test
   void test_eventualSafeNodes_expectListOfSize1_whenEventualNodesAre1AndUsingBfs() {
      List<List<Integer>> adjacencyList = new ArrayList<>();
      adjacencyList.add(List.of(1));
      adjacencyList.add(List.of(2));
      adjacencyList.add(List.of(0, 3));
      adjacencyList.add(List.of());
      List<Integer> output = List.of(3);
      List<Integer> actualOutput = classObj.eventualSafeNodes(4, adjacencyList, "bfs");
      Assertions.assertEquals(output.size(), actualOutput.size());
      Assertions.assertArrayEquals(new List[]{output}, new List[]{actualOutput});
   }
}
