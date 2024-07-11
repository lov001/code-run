package practice.graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BipartiteGraph {

   public boolean isBipartite(int V, List<List<Integer>> adj) {
      int[] colored = new int[V];
      for (int i = 0; i < V; i++) {
         if (colored[i] == 0) {
            if (!check(i, adj, colored)) {
               return false;
            }
         }
      }
      return true;
   }

   private boolean check(int source, List<List<Integer>> adj, int[] colored) {
      Queue<Integer> queue = new LinkedList<>();
      queue.add(source);
      colored[source] = 1;
      while (!queue.isEmpty()) {
         int node = queue.poll();
         for (Integer adjacent : adj.get(node)) {
            if (colored[adjacent] == 0) {
               colored[adjacent] = colored[node] == 1 ? 2 : 1;
               queue.add(adjacent);
            } else if (colored[adjacent] == colored[node]) {
               return false;
            }
         }
      }
      return true;
   }
}
