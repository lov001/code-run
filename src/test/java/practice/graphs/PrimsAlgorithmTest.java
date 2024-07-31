package practice.graphs;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimsAlgorithmTest {

   PrimsAlgorithm classObj = new PrimsAlgorithm();

   @Test
   void test_spanningTree_expect4_whenNIs3AndVIs3() {
      int[] array0 = {0, 1, 5};
      int[] array1 = {1, 2, 3};
      int[] array2 = {0, 2, 1};
      List<int[]> innerList = new ArrayList<>();
      innerList.add(array0);
      innerList.add(array1);
      innerList.add(array2);
      List<List<int[]>> input = new ArrayList<>();
      input.add(innerList);
      Assertions.assertEquals(4, classObj.spanningTree(3, 3, input));
   }

   @Test
   void test_spanningTree_expect5_whenNIs2AndVIs1() {
      int[] array0 = {0, 1, 5};
      List<int[]> innerList = new ArrayList<>();
      innerList.add(array0);
      List<List<int[]>> input = new ArrayList<>();
      input.add(innerList);
      Assertions.assertEquals(5, classObj.spanningTree(2, 1, input));
   }
}
