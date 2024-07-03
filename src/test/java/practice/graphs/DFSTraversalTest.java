package practice.graphs;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DFSTraversalTest {

   DFSTraversal classObj = new DFSTraversal();

//   @Test
//   void test_dfsTraversal_expect_whenStartingNodeIsRoot() {
//      List<Integer> nodes = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
//      List<List<Integer>> adjacencyList = new ArrayList<>();
//      adjacencyList.add(List.of());
//      adjacencyList.add(List.of(2, 6));
//      adjacencyList.add(List.of(1, 3, 4));
//      adjacencyList.add(List.of(2));
//      adjacencyList.add(List.of(2, 5));
//      adjacencyList.add(List.of(4, 8));
//      adjacencyList.add(List.of(1, 7, 9));
//      adjacencyList.add(List.of(6, 8));
//      adjacencyList.add(List.of(5, 7));
//      adjacencyList.add(List.of(6));
//      List<Integer> output = List.of(1, 2, 6, 3, 4, 7, 9, 5, 8);
//      Assertions.assertArrayEquals(new List[]{output},
//         new List[]{classObj.dfsTraversalUnDirected(nodes, adjacencyList)});
//   }

   @Test
   void test_dfsTraversal_expect_when5Nodes() {
      List<List<Integer>> adjacencyList = new ArrayList<>();
      adjacencyList.add(List.of(2, 3, 1));
      adjacencyList.add(List.of(0));
      adjacencyList.add(List.of(0, 4));
      adjacencyList.add(List.of(0));
      adjacencyList.add(List.of(2));
      List<Integer> output = List.of(0, 2, 4, 3, 1);
      Assertions.assertArrayEquals(new List[]{output},
         new List[]{classObj.dfsTraversalUnDirected(5, adjacencyList)});
   }

   @Test
   void test_dfsTraversal_expect_whenOnly4Nodes() {
      List<List<Integer>> adjacencyList = new ArrayList<>();
      adjacencyList.add(List.of(1, 3));
      adjacencyList.add(List.of(2, 0));
      adjacencyList.add(List.of(1));
      adjacencyList.add(List.of(0));
      List<Integer> output = List.of(0, 1, 2, 3);
      Assertions.assertArrayEquals(new List[]{output},
         new List[]{classObj.dfsTraversalUnDirected(4, adjacencyList)});
   }
}
