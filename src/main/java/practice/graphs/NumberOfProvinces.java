package practice.graphs;

import java.util.List;
import practice.utils.GraphUtils;

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


   public int numberOfProvincesUpdated(int V, List<List<Integer>> adjacencyMatrix) {
      boolean[] visited = new boolean[V];
      int count = 0;
      List<List<Integer>> adjacencyList = GraphUtils.transformAdjacencyMatrixToAdjacencyList(V,
         adjacencyMatrix);
      for (int i = 0; i < adjacencyList.size(); i++) {
         if (!visited[i]) {
            dfsUpdated(i, visited, adjacencyList);
            count++;
         }
      }
      return count;
   }

   private void dfsUpdated(int node, boolean[] visited, List<List<Integer>> adjacencyList) {
      if (visited[node]) {
         return;
      }
      visited[node] = true;
      for (Integer child : adjacencyList.get(node)) {
         if (!visited[child]) {
            dfsUpdated(child, visited, adjacencyList);
         }
      }
   }
}
