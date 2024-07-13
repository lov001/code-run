package practice.graphs;

import java.util.ArrayList;
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
         int[] inDegree = new int[V];
         for (int i = 0; i < V; i++) {
            for (Integer adjacent : adj.get(i)) {
               inDegree[adjacent] += 1;
            }
         }
         return checkBFS(V, adj, inDegree).size() != V;
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

   private List<Integer> checkBFS(int V, List<List<Integer>> adj, int[] inDegree) {
      Queue<Integer> queue = new LinkedList<>();
      for (int i = 0; i < V; i++) {
         if (inDegree[i] == 0) {
            queue.add(i);
         }
      }
      List<Integer> sortedVertices = new ArrayList<>();
      while (!queue.isEmpty()) {
         int node = queue.poll();
         sortedVertices.add(node);
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
