package practice.graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class EventualSafeState {

   /*
      1. Any node which is part of a cycle, cannot be a safe node.
      2. Any node which leads to a cycle also cannot be a safe node.
    */
   List<Integer> eventualSafeNodes(int V, List<List<Integer>> adj, String algorithm) {
      List<Integer> safeNodes = new ArrayList<>();
      if ("dfs".equalsIgnoreCase(algorithm)) {
         boolean[] visited = new boolean[V];
         int[] pathVisited = new int[V];
         for (int i = 0; i < V; i++) {
            if (!visited[i]) {
               dfs(i, visited, pathVisited, adj);
            }
         }
         for (int i = 0; i < V; i++) {
            if (pathVisited[i] == 2) {
               safeNodes.add(i);
            }
         }
      } else {
         List<List<Integer>> updatedAdj = new ArrayList<>();
         int[] inDegree = new int[V];
         for (int i = 0; i < V; i++) {
            updatedAdj.add(new ArrayList<>());
         }
         for (int i = 0; i < V; i++) {
            for (Integer j : adj.get(i)) {
               updatedAdj.get(j).add(i);
               inDegree[i]++;
            }
         }
         Queue<Integer> queue = new LinkedList<>();
         for (int i = 0; i < V; i++) {
            if (inDegree[i] == 0) {
               queue.add(i);
            }
         }
         while (!queue.isEmpty()) {
            Integer node = queue.poll();
            safeNodes.add(node);
            for (Integer adjacent : updatedAdj.get(node)) {
               inDegree[adjacent]--;
               if (inDegree[adjacent] == 0) {
                  queue.add(adjacent);
               }
            }
         }
         Collections.sort(safeNodes);
      }
      return safeNodes;
   }

   private boolean dfs(int src, boolean[] visited, int[] pathVisited, List<List<Integer>> adj) {
      visited[src] = true;
      pathVisited[src] = 1;
      for (Integer neighbour : adj.get(src)) {
         if (!visited[neighbour]) {
            if (dfs(neighbour, visited, pathVisited, adj)) {
               return true;
            }
         } else if (pathVisited[neighbour] == 1) {
            return true;
         }
      }
      pathVisited[src] = 2;
      return false;
   }
}
