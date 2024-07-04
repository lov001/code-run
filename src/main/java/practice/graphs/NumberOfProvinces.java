package practice.graphs;

import java.util.List;

public class NumberOfProvinces {

   public int numberOfProvinces(int V, List<List<Integer>> adjacencyList) {
      boolean[] visited = new boolean[V];
      int count = 0;
      for (int i = 0; i < adjacencyList.size(); i++) {
         if (!visited[i]) {
            dfs(i, visited, adjacencyList);
            count++;
         }
      }
      return count;
   }

   private void dfs(int node, boolean[] visited, List<List<Integer>> adjacencyList) {
      if (visited[node]) {
         return;
      }
      visited[node] = true;
      for (Integer child : adjacencyList.get(node)) {
         dfs(child, visited, adjacencyList);
      }
   }


}
