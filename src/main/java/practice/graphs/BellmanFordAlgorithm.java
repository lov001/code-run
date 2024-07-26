package practice.graphs;

import java.util.ArrayList;
import java.util.Arrays;

public class BellmanFordAlgorithm {

   public int[] bellmanFord(int V, ArrayList<ArrayList<Integer>> edges, int S) {
      int[] distance = new int[V];
      Arrays.fill(distance, (int) 1e8);
      distance[S] = 0;
      for (int iteration = 0; iteration < V - 1; iteration++) {
         for (ArrayList<Integer> edge : edges) {
            int source = edge.get(0);
            int dest = edge.get(1);
            int weight = edge.get(2);
            if (distance[source] != 1e8 && distance[source] + weight < distance[dest]) {
               distance[dest] = distance[source] + weight;
            }
         }
      }
      // detect negative cycle
      for (ArrayList<Integer> edge : edges) {
         int source = edge.get(0);
         int dest = edge.get(1);
         int weight = edge.get(2);
         if (distance[source] != 1e8 && distance[source] + weight < distance[dest]) {
            int[] temp = new int[1];
            temp[0] = -1;
            return temp;
         }
      }
      return distance;
   }
}
