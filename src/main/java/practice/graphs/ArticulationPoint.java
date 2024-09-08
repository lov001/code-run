package practice.graphs;

import java.util.ArrayList;

public class ArticulationPoint {

   private int timer = 1;

   public ArrayList<Integer> articulationPoints(int V, ArrayList<ArrayList<Integer>> adj) {
      int[] visited = new int[V];
      int[] tIns = new int[V];
      int[] low = new int[V];
      int[] mark = new int[V];
      for (int i = 0; i < V; i++) {
         if (visited[i] == 0) {
            dfs(i, -1, visited, adj, tIns, low, mark);
         }
      }
      ArrayList<Integer> answer = new ArrayList<>();
      for (int i = 0; i < V; i++) {
         if (mark[i] == 1) {
            answer.add(i);
         }
      }
      if (answer.size() == 0) {
         answer.add(-1);
      }
      return answer;
   }

   private void dfs(int node, int parent, int[] visited, ArrayList<ArrayList<Integer>> adj,
      int[] tIns, int[] low, int[] mark) {
      visited[node] = 1;
      tIns[node] = low[node] = timer;
      timer++;
      int child = 0;

      for (Integer adjacent : adj.get(node)) {
         if (adjacent == parent) {
            continue;
         }
         if (visited[adjacent] == 0) {
            dfs(adjacent, node, visited, adj, tIns, low, mark);
            low[node] = Math.min(low[adjacent], low[node]);
            if (low[adjacent] >= tIns[node] && parent != -1) {
               mark[node] = 1;
            }
            child++;
         } else {
            low[node] = Math.min(low[node], tIns[adjacent]);
         }
      }
      if (child > 1 && parent == -1) {
         mark[node] = 1;
      }
   }
}
