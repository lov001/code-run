package practice.graphs;

import java.util.ArrayList;
import java.util.Stack;

public class KosarajuAlgorithm {

   public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj) {
      int[] visited = new int[V];
      Stack<Integer> stack = new Stack<>();
      for (int i = 0; i < V; i++) {
         if (visited[i] == 0) {
            dfs(i, visited, adj, stack);
         }
      }

      ArrayList<ArrayList<Integer>> adjT = new ArrayList<>();
      for (int i = 0; i < V; i++) {
         adjT.add(new ArrayList<>());
      }
      for (int i = 0; i < V; i++) {
         visited[i] = 0;
         for (Integer node : adj.get(i)) {
            adjT.get(node).add(i);
         }
      }
      int count = 0;
      while (!stack.isEmpty()) {
         int node = stack.pop();
         if (visited[node] == 0) {
            count++;
            dfs(node, visited, adjT);
         }
      }
      return count;
   }

   private void dfs(int node, int[] visited, ArrayList<ArrayList<Integer>> adj,
      Stack<Integer> stack) {
      visited[node] = 1;
      for (Integer adjNode : adj.get(node)) {
         if (visited[adjNode] == 0) {
            dfs(adjNode, visited, adj, stack);
         }
      }
      stack.push(node);
   }

   private void dfs(int node, int[] visited, ArrayList<ArrayList<Integer>> adjT) {
      visited[node] = 1;
      for (Integer adjNode : adjT.get(node)) {
         if (visited[adjNode] == 0) {
            dfs(adjNode, visited, adjT);
         }
      }
   }
}
