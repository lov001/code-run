package practice.graphs;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KosarajuAlgorithmTest {

   KosarajuAlgorithm classObj = new KosarajuAlgorithm();

   @Test
   void test_kosaraju_expect3_whenGivenGraph() {
      ArrayList<ArrayList<Integer>> input = createGraph(5);
      input.get(0).add(2);
      input.get(2).add(1);
      input.get(1).add(0);
      input.get(0).add(3);
      input.get(3).add(4);
      Assertions.assertEquals(3, classObj.kosaraju(5, input));
   }

   @Test
   void test_kosaraju_expect1_whenGivenGraph() {
      ArrayList<ArrayList<Integer>> input = createGraph(3);
      input.get(0).add(1);
      input.get(1).add(2);
      input.get(2).add(0);
      Assertions.assertEquals(1, classObj.kosaraju(3, input));
   }

   private ArrayList<ArrayList<Integer>> createGraph(int V) {
      ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
      for (int i = 0; i < V; i++) {
         adj.add(new ArrayList<>());
      }
      return adj;
   }
}
