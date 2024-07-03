package practice.graphs;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BFSTraversalTest {

   BFSTraversal classObj = new BFSTraversal();

   @Test
   void test_bfsTraversal_expect_whenStartingNodeIsRoot() {
      List<Integer> nodes = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
      List<List<Integer>> adjacencyList = new ArrayList<>();
      adjacencyList.add(List.of());
      adjacencyList.add(List.of(2, 6));
      adjacencyList.add(List.of(1, 3, 4));
      adjacencyList.add(List.of(2));
      adjacencyList.add(List.of(2, 5));
      adjacencyList.add(List.of(4, 8));
      adjacencyList.add(List.of(1, 7, 9));
      adjacencyList.add(List.of(6, 8));
      adjacencyList.add(List.of(5, 7));
      adjacencyList.add(List.of(6));
      List<Integer> output = List.of(1, 2, 6, 3, 4, 7, 9, 5, 8);
      Assertions.assertArrayEquals(new List[]{output},
         new List[]{classObj.bfsTraversal(nodes, adjacencyList)});
   }

//   @Test
//   void test_bfsTraversal_expect_whenStartingNodeIs6() {
//      List<Integer> nodes = List.of(6, 1, 2, 3, 4, 5, 7, 8, 9);
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
//      List<Integer> output = List.of(6, 1, 7, 9, 2, 8, 3, 4, 5);
//      Assertions.assertArrayEquals(new List[]{output},
//         new List[]{classObj.bfsTraversal(nodes, adjacencyList)});
//   }
}
