package practice.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AlienDictionary {

   public String findOrder(String[] dict, int N, int K) {
      List<List<Integer>> adj = new ArrayList<>();
      for (int i = 0; i < K; i++) {
         adj.add(new ArrayList<>());
      }
      for (int i = 0; i < N - 1; i++) {
         String s1 = dict[i];
         String s2 = dict[i + 1];
         int minLength = Math.min(s1.length(), s2.length());
         for (int j = 0; j < minLength; j++) {
            if (s1.charAt(j) != s2.charAt(j)) {
               adj.get(s1.charAt(j) - 'a').add(s2.charAt(j) - 'a');
               break;
            }
         }
      }
      List<Integer> topologicalSort = topologicalSort(K, adj);
      StringBuilder ans = new StringBuilder();
      for (Integer integer : topologicalSort) {
         ans.append((char) (integer + (int) 'a'));
      }
      return ans.toString();
   }

   private List<Integer> topologicalSort(int V, List<List<Integer>> adj) {
      int[] inDegree = new int[V];
      for (int i = 0; i < V; i++) {
         for (Integer adjacent : adj.get(i)) {
            inDegree[adjacent] += 1;
         }
      }
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
