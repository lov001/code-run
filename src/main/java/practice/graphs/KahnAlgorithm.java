package practice.graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KahnAlgorithm {

   public int[] topologicalSort(int V, List<List<Integer>> adj) {
      int[] inDegree = new int[V];
      for (int i = 0; i < V; i++) {
         for (Integer adjacent : adj.get(i)) {
            inDegree[adjacent] += 1;
         }
      }
      Queue<Integer> queue = new LinkedList<>();
      for (int i = 0; i < V; i++) {
         if (inDegree[i] == 0) {
            queue.add(i);
         }
      }
      int[] sortedVertices = new int[V];
      int i = 0;
      while (!queue.isEmpty()) {
         int node = queue.poll();
         sortedVertices[i++] = node;
         for (Integer adjacent : adj.get(node)) {
            inDegree[adjacent] -= 1;
            if (inDegree[adjacent] == 0) {
               queue.add(adjacent);
            }
         }
      }
      return sortedVertices;
   }
}
