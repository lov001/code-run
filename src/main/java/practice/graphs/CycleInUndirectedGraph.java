package practice.graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CycleInUndirectedGraph {

   public boolean isCycle(int V, List<List<Integer>> adj) {
      boolean[] isVisited = new boolean[V];
      for (int i = 0; i < V; i++) {
         if (!isVisited[i]) {
            if (detectCycle(i, isVisited, adj)) {
               return true;
            }
         }
      }
      return false;
   }

   private boolean detectCycle(int src, boolean[] isVisited, List<List<Integer>> adj) {
      Queue<Pair> queue = new LinkedList<>();
      queue.add(new Pair(src, -1));
      isVisited[src] = true;
      while (!queue.isEmpty()) {
         Pair pair = queue.poll();
         int node = pair.first;
         int parent = pair.second;
         for (Integer neighbour : adj.get(node)) {
            if (!isVisited[neighbour]) {
               isVisited[neighbour] = true;
               queue.add(new Pair(neighbour, node));
            } else if (parent != neighbour) {
               return true;
            }
         }
      }
      return false;
   }
}
