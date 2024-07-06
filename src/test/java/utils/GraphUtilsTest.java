package utils;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import practice.utils.GraphUtils;

public class GraphUtilsTest {

   @Test
   void test_transformAdjacencyMatrixToAdjacencyList_expectList_whenGivenMatrix3x3() {
      List<List<Integer>> adjacencyMatrix = new ArrayList<>();
      adjacencyMatrix.add(List.of(1, 0, 1));
      adjacencyMatrix.add(List.of(0, 1, 0));
      adjacencyMatrix.add(List.of(1, 0, 1));
      List<List<Integer>> adjacencyList = new ArrayList<>();
      adjacencyList.add(List.of(2));
      adjacencyList.add(List.of());
      adjacencyList.add(List.of(0));
      Assertions.assertArrayEquals(new List[]{adjacencyList},
         new List[]{GraphUtils.transformAdjacencyMatrixToAdjacencyList(3, adjacencyMatrix)});
   }

   @Test
   void test_transformAdjacencyMatrixToAdjacencyList_expectList_whenGivenMatrix2x2() {
      List<List<Integer>> adjacencyMatrix = new ArrayList<>();
      adjacencyMatrix.add(List.of(1, 1));
      adjacencyMatrix.add(List.of(1, 1));
      List<List<Integer>> adjacencyList = new ArrayList<>();
      adjacencyList.add(List.of(1));
      adjacencyList.add(List.of(0));
      Assertions.assertArrayEquals(new List[]{adjacencyList},
         new List[]{GraphUtils.transformAdjacencyMatrixToAdjacencyList(2, adjacencyMatrix)});
   }

   @Test
   void test_transformAdjacencyMatrixToAdjacencyList_expectList_whenGivenMatrix3x3_() {
      List<List<Integer>> adjacencyMatrix = new ArrayList<>();
      adjacencyMatrix.add(List.of(1, 1, 0, 0, 0, 0, 0, 0));
      adjacencyMatrix.add(List.of(1, 1, 1, 0, 0, 0, 0, 0));
      adjacencyMatrix.add(List.of(0, 1, 1, 0, 0, 0, 0, 0));
      adjacencyMatrix.add(List.of(0, 0, 0, 1, 1, 0, 0, 0));
      adjacencyMatrix.add(List.of(0, 0, 0, 1, 1, 1, 0, 0));
      adjacencyMatrix.add(List.of(0, 0, 0, 0, 1, 1, 0, 0));
      adjacencyMatrix.add(List.of(0, 0, 0, 0, 0, 0, 1, 1));
      adjacencyMatrix.add(List.of(0, 0, 0, 0, 0, 0, 1, 1));
      List<List<Integer>> adjacencyList = new ArrayList<>();
      adjacencyList.add(List.of(1));
      adjacencyList.add(List.of(0, 2));
      adjacencyList.add(List.of(1));
      adjacencyList.add(List.of(4));
      adjacencyList.add(List.of(3, 5));
      adjacencyList.add(List.of(4));
      adjacencyList.add(List.of(7));
      adjacencyList.add(List.of(6));
      Assertions.assertArrayEquals(new List[]{adjacencyList},
         new List[]{GraphUtils.transformAdjacencyMatrixToAdjacencyList(8, adjacencyMatrix)});
   }
}
