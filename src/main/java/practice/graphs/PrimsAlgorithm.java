package practice.graphs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class PrimsAlgorithm {

   public int spanningTree(int V, int E, List<List<int[]>> adj) {
      List<List<Pair>> adjacencyList = new ArrayList<>();
      for (int i = 0; i < V; i++) {
         adjacencyList.add(new ArrayList<>());
      }
      for (int i = 0; i < adj.size(); i++) {
         for (int[] vertex : adj.get(i)) {
            adjacencyList.get(vertex[0]).add(new Pair(vertex[1], vertex[2]));
            adjacencyList.get(vertex[1]).add(new Pair(vertex[0], vertex[2]));
         }
      }
      Queue<Pair> priorityQueue = new PriorityQueue<>(Comparator.comparing(x -> x.first));
      priorityQueue.add(new Pair(0, 0));
      int minimumWeight = 0;
      int[] visited = new int[V];
      while (!priorityQueue.isEmpty()) {
         Pair pair = priorityQueue.poll();
         int wt = pair.first;
         int node = pair.second;
         if (visited[node] == 1) {
            continue;
         }
         visited[node] = 1;
         minimumWeight += wt;
         for (int i = 0; i < adjacencyList.get(node).size(); i++) {
            int adjNode = adjacencyList.get(node).get(i).first;
            int edgeWt = adjacencyList.get(node).get(i).second;
            if (visited[adjNode] == 0) {
               priorityQueue.add(new Pair(edgeWt, adjNode));
            }
         }
      }
      return minimumWeight;
   }
}
