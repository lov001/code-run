package practice.graphs;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimsAlgorithmTest {

   PrimsAlgorithm classObj = new PrimsAlgorithm();

   @Test
   void test_spanningTree_expect4_whenNIs3AndVIs3() {
      List<int[]> innerList = new ArrayList<>();
      innerList.add(new int[]{1, 5});
      innerList.add(new int[]{2, 1});
      List<int[]> innerList2 = new ArrayList<>();
      innerList.add(new int[]{0, 5});
      innerList.add(new int[]{2, 3});
      List<int[]> innerList3 = new ArrayList<>();
      innerList.add(new int[]{1, 3});
      innerList.add(new int[]{0, 1});
      List<List<int[]>> input = new ArrayList<>();
      input.add(innerList);
      input.add(innerList2);
      input.add(innerList3);
      Assertions.assertEquals(4, classObj.spanningTree(3, 3, input));
   }

   @Test
   void test_spanningTree_expect5_whenNIs2AndVIs1() {
      List<int[]> innerList = new ArrayList<>();
      innerList.add(new int[]{1, 5});
      List<int[]> innerList2 = new ArrayList<>();
      innerList.add(new int[]{0, 5});
      List<List<int[]>> input = new ArrayList<>();
      input.add(innerList);
      input.add(innerList2);
      Assertions.assertEquals(5, classObj.spanningTree(2, 1, input));
   }
}
