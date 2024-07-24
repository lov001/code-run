package practice.graphs;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfWaysToArriveAtDestinationTest {

   NumberOfWaysToArriveAtDestination classObj = new NumberOfWaysToArriveAtDestination();

   @Test
   void test_countPaths_expect4_whenNumberOfIntersectionsIs7() {
      List<List<Integer>> adjacencyList = new ArrayList<>();
      adjacencyList.add(List.of(0, 6, 7));
      adjacencyList.add(List.of(0, 1, 2));
      adjacencyList.add(List.of(1, 2, 3));
      adjacencyList.add(List.of(1, 3, 3));
      adjacencyList.add(List.of(6, 3, 3));
      adjacencyList.add(List.of(3, 5, 1));
      adjacencyList.add(List.of(6, 5, 1));
      adjacencyList.add(List.of(2, 5, 1));
      adjacencyList.add(List.of(0, 4, 5));
      adjacencyList.add(List.of(4, 6, 2));
      Assertions.assertEquals(4, classObj.countPaths(7, adjacencyList));
   }

   @Test
   void test_countPaths_expect3_whenNumberOfIntersectionsIs6() {
      List<List<Integer>> adjacencyList = new ArrayList<>();
      adjacencyList.add(List.of(0, 5, 8));
      adjacencyList.add(List.of(0, 2, 2));
      adjacencyList.add(List.of(0, 1, 1));
      adjacencyList.add(List.of(1, 3, 3));
      adjacencyList.add(List.of(1, 2, 3));
      adjacencyList.add(List.of(2, 5, 6));
      adjacencyList.add(List.of(3, 4, 2));
      adjacencyList.add(List.of(4, 5, 2));
      Assertions.assertEquals(3, classObj.countPaths(6, adjacencyList));
   }

   @Test
   void test_countPaths_expect5_whenNumberOfIntersectionsIs9() {
      List<List<Integer>> adjacencyList = new ArrayList<>();
      adjacencyList.add(List.of(0, 1, 1));
      adjacencyList.add(List.of(0, 2, 2));
      adjacencyList.add(List.of(0, 3, 1));
      adjacencyList.add(List.of(0, 4, 2));
      adjacencyList.add(List.of(1, 5, 2));
      adjacencyList.add(List.of(2, 5, 1));
      adjacencyList.add(List.of(3, 5, 2));
      adjacencyList.add(List.of(3, 7, 3));
      adjacencyList.add(List.of(3, 6, 2));
      adjacencyList.add(List.of(4, 6, 1));
      adjacencyList.add(List.of(5, 8, 1));
      adjacencyList.add(List.of(7, 8, 1));
      adjacencyList.add(List.of(6, 8, 1));
      Assertions.assertEquals(5, classObj.countPaths(9, adjacencyList));
   }
}
