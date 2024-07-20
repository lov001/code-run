package practice.graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class ShortestPathInWeightedUndirectedGraph {

   public List<Integer> shortestPath(int n, int m, int[][] edges) {
      List<List<Pair>> adj = new ArrayList<>();
      for (int i = 0; i <= n; i++) {
         adj.add(new ArrayList<>());
      }
      for (int i = 0; i < m; i++) {
         adj.get(edges[i][0]).add(new Pair(edges[i][1], edges[i][2]));
         adj.get(edges[i][1]).add(new Pair(edges[i][0], edges[i][2]));
      }
      int[] parent = new int[n + 1];
      int[] distance = new int[n + 1];
      for (int i = 1; i <= n; i++) {
         parent[i] = i;
         distance[i] = Integer.MAX_VALUE;
      }
      distance[1] = 0;
      Queue<Pair> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(x -> x.second));
      priorityQueue.add(new Pair(1, 0));
      while (!priorityQueue.isEmpty()) {
         Pair pair = priorityQueue.poll();
         int node = pair.first;
         int wt = pair.second;
         for (int i = 0; i < adj.get(node).size(); i++) {
            int edgeNode = adj.get(node).get(i).first;
            int edgeWt = adj.get(node).get(i).second;
            if (distance[edgeNode] > wt + edgeWt) {
               distance[edgeNode] = wt + edgeWt;
               priorityQueue.add(new Pair(edgeNode, wt + edgeWt));
               parent[edgeNode] = node;
            }
         }
      }
      List<Integer> shortestPath = new ArrayList<>();
      if (distance[n] == Integer.MAX_VALUE || distance[n] == 0) {
         shortestPath.add(-1);
         return shortestPath;
      }
      int node = n;
      while (node != parent[node]) {
         shortestPath.add(node);
         node = parent[node];
      }
      shortestPath.add(1);
      Collections.reverse(shortestPath);
      return shortestPath;
   }
}
