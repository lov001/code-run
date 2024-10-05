package practice.graphs;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class PrimsAlgorithm {

   public int spanningTree(int V, int E, List<List<int[]>> adj) {
      Queue<Triplet> priorityQueue = new PriorityQueue<>(Comparator.comparing(x -> x.first));
      priorityQueue.add(new Triplet(0, 0, -1));
      int minimumWeight = 0;
      int[] visited = new int[V];
      while (!priorityQueue.isEmpty()) {
         Triplet triplet = priorityQueue.poll();
         int wt = triplet.first;
         int node = triplet.second;
         int parent = triplet.third;
         if (visited[node] == 1) {
            continue;
         }
         visited[node] = 1;
         minimumWeight += wt;
         for (int i = 0; i < adj.get(node).size(); i++) {
            int adjNode = adj.get(node).get(i)[0];
            int edgeWt = adj.get(node).get(i)[1];
            if (visited[adjNode] == 0) {
               priorityQueue.add(new Triplet(edgeWt, adjNode, parent));
            }
         }
      }
      return minimumWeight;
   }
}
