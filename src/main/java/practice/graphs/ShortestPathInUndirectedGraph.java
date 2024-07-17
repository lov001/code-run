package practice.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ShortestPathInUndirectedGraph {

   public int[] shortestPath(int[][] edges, int n, int m, int src) {
      List<List<Integer>> adj = new ArrayList<>();
      for (int i = 0; i < n; i++) {
         adj.add(new ArrayList<>());
      }
      for (int i = 0; i < m; i++) {
         adj.get(edges[i][0]).add(edges[i][1]);
         adj.get(edges[i][1]).add(edges[i][0]);
      }
      int[] distance = new int[n];
      Arrays.fill(distance, Integer.MAX_VALUE);
      distance[src] = 0;
      Queue<Integer> queue = new LinkedList<>();
      queue.add(src);
      while (!queue.isEmpty()) {
         int node = queue.poll();
         for (Integer adjacent : adj.get(node)) {
            if (distance[adjacent] > distance[node] + 1) {
               distance[adjacent] = distance[node] + 1;
               queue.add(adjacent);
            }
         }
      }
      for (int i = 0; i < n; i++) {
         if (distance[i] == Integer.MAX_VALUE) {
            distance[i] = -1;
         }
      }
      return distance;
   }
}
