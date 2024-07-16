package practice.graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ShortestPathInDAG {

   public int[] shortestPath(int N, int M, int[][] edges) {
      List<List<Pair>> adj = new ArrayList<>();
      for (int i = 0; i < N; i++) {
         adj.add(new ArrayList<>());
      }
      for (int i = 0; i < M; i++) {
         int u = edges[i][0];
         int v = edges[i][1];
         int wt = edges[i][2];
         adj.get(u).add(new Pair(v, wt));
      }
      boolean[] visited = new boolean[N];
      Stack<Integer> stack = new Stack<>();
      for (int i = 0; i < N; i++) {
         if (!visited[i]) {
            dfs(i, adj, visited, stack);
         }
      }
      int[] distance = new int[N];
      for (int i = 0; i < N; i++) {
         distance[i] = (int) (1e9);
      }
      distance[0] = 0;
      while (!stack.isEmpty()) {
         Integer node = stack.pop();

         for (int i = 0; i < adj.get(node).size(); i++) {
            int v = adj.get(node).get(i).first;
            int nodeWt = adj.get(node).get(i).second;
            if (distance[v] > nodeWt + distance[node]) {
               distance[v] = nodeWt + distance[node];
            }
         }
      }
      for (int i = 0; i < N; i++) {
         if (distance[i] == 1e9) {
            distance[i] = -1;
         }
      }
      return distance;
   }

   private void dfs(int src, List<List<Pair>> adj, boolean[] visited, Stack<Integer> stack) {
      visited[src] = true;
      for (Pair adjacent : adj.get(src)) {
         if (!visited[adjacent.first]) {
            dfs(adjacent.first, adj, visited, stack);
         }
      }
      stack.push(src);
   }
}
