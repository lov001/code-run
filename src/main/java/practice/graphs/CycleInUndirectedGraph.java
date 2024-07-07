package practice.graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CycleInUndirectedGraph {

   public boolean isCycle(int V, List<List<Integer>> adj, String algorithm) {
      boolean[] isVisited = new boolean[V];
      if ("bfs".equalsIgnoreCase(algorithm)) {
         for (int i = 0; i < V; i++) {
            if (!isVisited[i]) {
               if (detectCycleBFS(i, isVisited, adj)) {
                  return true;
               }
            }
         }
      } else {
         for (int i = 0; i < V; i++) {
            if (!isVisited[i]) {
               if (detectCycleDFS(i, -1, isVisited, adj)) {
                  return true;
               }
            }
         }
      }
      return false;
   }

   private boolean detectCycleBFS(int src, boolean[] isVisited, List<List<Integer>> adj) {
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

   private boolean detectCycleDFS(int src, int parent, boolean[] isVisited,
      List<List<Integer>> adj) {
      isVisited[src] = true;
      for (Integer neighbour : adj.get(src)) {
         if (!isVisited[neighbour]) {
            isVisited[neighbour] = true;
            if (detectCycleDFS(neighbour, src, isVisited, adj)) {
               return true;
            }
         } else if (neighbour != parent) {
            return true;
         }
      }
      return false;
   }
}
