package practice.graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CycleInDirectedGraph {

   public boolean isCycle(int V, List<List<Integer>> adj, String algorithm) {

      boolean[] visited = new boolean[V];
      boolean[] pathVisited = new boolean[V];
      if ("dfs".equalsIgnoreCase(algorithm)) {
         for (int i = 0; i < V; i++) {
            if (!visited[i]) {
               if (checkDFS(i, adj, visited, pathVisited)) {
                  return true;
               }
            }
         }
      } else {
         for (int i = 0; i < V; i++) {
            if (!visited[i]) {
               if (checkBFS(i, adj, visited)) {
                  return true;
               }
            }
         }
      }
      return false;
   }

   private boolean checkDFS(int src, List<List<Integer>> adj, boolean[] visited,
      boolean[] pathVisited) {
      visited[src] = true;
      pathVisited[src] = true;
      for (Integer adjacent : adj.get(src)) {
         if (!visited[adjacent]) {
            if (checkDFS(adjacent, adj, visited, pathVisited)) {
               return true;
            }
         } else if (pathVisited[adjacent]) {
            return true;
         }
      }
      pathVisited[src] = false;
      return false;
   }

   private boolean checkBFS(int src, List<List<Integer>> adj, boolean[] visited) {
      Queue<Pair> queue = new LinkedList<>();
      queue.add(new Pair(src, -1));
      visited[src] = true;
      while (!queue.isEmpty()) {
         Pair node = queue.poll();
         for (Integer adjacent : adj.get(node.first)) {
            if (!visited[adjacent]) {
               visited[adjacent] = true;
               queue.add(new Pair(adjacent, node.first));
            } else if (node.second != adjacent && node.second != -1) {
               return true;
            }
         }
      }
      return false;
   }
}
