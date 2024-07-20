package practice.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DijkstraAlgorithmUsingPQTest {

   DijkstraAlgorithmUsingPQ classObj = new DijkstraAlgorithmUsingPQ();

   @Test
   void test_dijkstra_expect_whenGivenGraph() {
      int V = 2;
      ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();
      for (int i = 0; i < V; i++) {
         adj.add(new ArrayList<>());
      }
      adj.get(0).add(new ArrayList<>(Arrays.asList(1, 9)));
      adj.get(1).add(new ArrayList<>(Arrays.asList(0, 9)));
      int[] output = {0, 9};
      Assertions.assertArrayEquals(output, classObj.dijkstra(V, adj, 0));
   }

   @Test
   void test_dijkstra_expect_whenGivenGraph_() {
      int V = 3;
      ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();
      for (int i = 0; i < V; i++) {
         adj.add(new ArrayList<>());
      }
      adj.get(0).add(new ArrayList<>(Arrays.asList(1, 1)));
      adj.get(0).add(new ArrayList<>(Arrays.asList(2, 6)));
      adj.get(1).add(new ArrayList<>(Arrays.asList(2, 3)));
      adj.get(1).add(new ArrayList<>(Arrays.asList(0, 1)));
      adj.get(2).add(new ArrayList<>(Arrays.asList(1, 3)));
      adj.get(2).add(new ArrayList<>(Arrays.asList(0, 6)));
      int[] output = {4, 3, 0};
      Assertions.assertArrayEquals(output, classObj.dijkstra(V, adj, 2));
   }
}
