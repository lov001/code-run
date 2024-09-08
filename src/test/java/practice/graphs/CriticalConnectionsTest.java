package practice.graphs;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CriticalConnectionsTest {

   CriticalConnections classObj = new CriticalConnections();

   @Test
   void test_criticalConnections_expect2Bridges_whenGivenGraph() {
      ArrayList<ArrayList<Integer>> connections = createGraph(3);
      ArrayList<Integer> subList1 = new ArrayList<>();
      subList1.add(0);
      subList1.add(1);
      ArrayList<Integer> subList3 = new ArrayList<>();
      subList3.add(0);
      subList3.add(2);
      connections.get(0).addAll(subList1);
      connections.get(1).addAll(subList3);

      ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
      ArrayList<Integer> subList5 = new ArrayList<>();
      subList5.add(0);
      subList5.add(1);
      ArrayList<Integer> subList6 = new ArrayList<>();
      subList6.add(0);
      subList6.add(2);
      expected.add(subList5);
      expected.add(subList6);

      ArrayList<ArrayList<Integer>> result = classObj.criticalConnections(3, connections);
      Assertions.assertEquals(result.size(), expected.size());
//      Assertions.assertArrayEquals(new ArrayList[]{expected}, new ArrayList[]{result});
   }

   private ArrayList<ArrayList<Integer>> createGraph(int V) {
      ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
      for (int i = 0; i < V; i++) {
         adj.add(new ArrayList<>());
      }
      return adj;
   }
}
