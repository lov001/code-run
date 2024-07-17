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
      Queue<Pair> queue = new LinkedList<>();
      queue.add(new Pair(src, 0));
      while (!queue.isEmpty()){
         Pair pair = queue.poll();
         int node = pair.first;
         int wt = pair.second;
         for(Integer adjacent : adj.get(node)){
            if(distance[adjacent] > wt + 1){
               distance[adjacent] = wt + 1;
               queue.add(new Pair(adjacent, wt + 1));
            }
         }
      }
      for(int i=0; i<n; i++){
         if(distance[i] == Integer.MAX_VALUE){
            distance[i] = -1;
         }
      }
      return distance;
   }
}
