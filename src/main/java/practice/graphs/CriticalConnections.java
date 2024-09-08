package practice.graphs;

import java.util.ArrayList;

public class CriticalConnections {

   private int timer = 1;

   public ArrayList<ArrayList<Integer>> criticalConnections(int v,
      ArrayList<ArrayList<Integer>> adj) {
      int[] visited = new int[v];
      int[] tIns = new int[v];
      int[] low = new int[v];
      ArrayList<ArrayList<Integer>> bridges = new ArrayList<>();
      dfs(0, -1, visited, adj, tIns, low, bridges);
      bridges.sort((o1, o2) -> {
         if (!o1.get(0).equals(o2.get(0))) {
            return o1.get(0) - o2.get(0);
         }
         return o1.get(1) - o2.get(1);
      });
      return bridges;
   }

   private void dfs(int node, int parent, int[] visited, ArrayList<ArrayList<Integer>> adj,
      int[] tIns, int[] low, ArrayList<ArrayList<Integer>> bridges) {
      visited[node] = 1;
      tIns[node] = low[node] = timer;
      timer++;

      for (Integer adjacent : adj.get(node)) {
         if (adjacent == parent) {
            continue;
         }
         if (visited[adjacent] == 0) {
            dfs(adjacent, node, visited, adj, tIns, low, bridges);
            low[node] = Math.min(low[adjacent], low[node]);
            if (low[adjacent] > tIns[node]) {
               ArrayList<Integer> temp = new ArrayList<>();
               temp.add(node);
               temp.add(adjacent);
               bridges.add(temp);
            }
         } else {
            low[node] = Math.min(low[adjacent], low[node]);
         }
      }
   }
}
