package practice.graphs;

import java.util.ArrayList;
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


   public int numberOfProvincesUpdated(int V, List<List<Integer>> adjacencyMatrix) {
      boolean[] visited = new boolean[V];
      int count = 0;
      List<List<Integer>> adjacencyList = new ArrayList<>();
      for (int i = 0; i < V; i++) {
         adjacencyList.add(new ArrayList<>());
      }
      for (int i = 0; i < V; i++) {
         for (int j = 0; j < V; j++) {
            if (adjacencyMatrix.get(i).get(j) == 1 && i != j) {
               adjacencyList.get(i).add(j);
               adjacencyList.get(j).add(i);
            }
         }
      }
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
