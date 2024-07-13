package practice.graphs;

import java.util.List;
import java.util.Stack;

public class TopologicalSort {

   public int[] topologicalSort(int V, List<List<Integer>> adj) {
      Stack<Integer> stack = new Stack<>();
      boolean[] visited = new boolean[V];
      for (int i = 0; i < V; i++) {
         if (!visited[i]) {
            dfs(i, visited, adj, stack);
         }
      }
      int i = 0;
      int[] sortedVertices = new int[V];
      while (!stack.isEmpty()) {
         sortedVertices[i] = stack.pop();
         i++;
      }
      return sortedVertices;
   }

   private void dfs(int src, boolean[] visited, List<List<Integer>> adj, Stack<Integer> stack) {
      visited[src] = true;
      for (Integer adjacent : adj.get(src)) {
         if (!visited[adjacent]) {
            dfs(adjacent, visited, adj, stack);
         }
      }
      stack.push(src);
   }
}
