package practice.graphs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class DijkstraAlgorithmUsingPQ {

   public int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S) {
      int[] distance = new int[V];
      for (int i = 0; i < V; i++) {
         distance[i] = Integer.MAX_VALUE;
      }
      distance[S] = 0;
      Queue<Pair> priorityQueue = new PriorityQueue<>();
//      Queue<Pair> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(x -> x.second));
      priorityQueue.add(new Pair(0, S));
      while (!priorityQueue.isEmpty()) {
         Pair pair = priorityQueue.poll();
         int node = pair.second;
         int wt = pair.first;
         for (int i = 0; i < adj.get(node).size(); i++) {
            int edgeWeight = adj.get(node).get(i).get(1);
            int adjacent = adj.get(node).get(i).get(0);
            if (distance[adjacent] > wt + edgeWeight) {
               distance[adjacent] = wt + edgeWeight;
               priorityQueue.add(new Pair(distance[adjacent], adjacent));
            }
         }
      }
      return distance;
   }
}
