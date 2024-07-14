package practice.graphs;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PrerequisiteTasks {

   public boolean isPossible(int N, int P, int[][] prerequisites, String algorithm) {
      List<List<Integer>> adj = new ArrayList<>();
      for (int i = 0; i < N; i++) {
         adj.add(new ArrayList<>());
      }
      int m = prerequisites.length;
      for (int i = 0; i < m; i++) {
         adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
      }
      if ("bfs".equalsIgnoreCase(algorithm)) {
         int[] inDegree = new int[N];
         for (List<Integer> integers : adj) {
            for (Integer j : integers) {
               inDegree[j]++;
            }
         }
         Queue<Integer> queue = new LinkedList<>();
         // can also use an List to store the topological ordering and compare its length in the end
         for (int i = 0; i < inDegree.length; i++) {
            if (inDegree[i] == 0) {
               queue.add(i);
            }
         }
         while (!queue.isEmpty()) {
            int node = queue.poll();
            for (Integer adjacent : adj.get(node)) {
               inDegree[adjacent]--;
               if (inDegree[adjacent] == 0) {
                  queue.add(adjacent);
               }
            }
         }
         for (int j : inDegree) {
            if (j != 0) {
               return false;
            }
         }
      }
      return true;
   }
}
