package practice.graphs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class NumberOfWaysToArriveAtDestination {

   public int countPaths(int n, List<List<Integer>> roads) {
      List<List<Pair>> adj = new ArrayList<>();
      for (int i = 0; i < n; i++) {
         adj.add(new ArrayList<>());
      }
      for (int i = 0; i < roads.size(); i++) {
         adj.get(roads.get(i).get(0)).add(new Pair(roads.get(i).get(1), roads.get(i).get(2)));
         adj.get(roads.get(i).get(1)).add(new Pair(roads.get(i).get(0), roads.get(i).get(2)));
      }
      int[] distance = new int[n];
      int[] noOfWays = new int[n];
      for (int i = 0; i < n; i++) {
         distance[i] = Integer.MAX_VALUE;
         noOfWays[i] = 0;
      }
      distance[0] = 0;
      noOfWays[0] = 1;
      Queue<Pair> queue = new PriorityQueue<>(Comparator.comparingInt(x -> x.first));
      queue.add(new Pair(0, 0));
      int mod = (int) (1e9 + 7);
      while (!queue.isEmpty()) {
         Pair pair = queue.poll();
         int dist = pair.first;
         int node = pair.second;
         for (Pair adjPair : adj.get(node)) {
            int adjNode = adjPair.first;
            int adjWt = adjPair.second;
            if (dist + adjWt < distance[adjNode]) {
               distance[adjNode] = dist + adjWt;
               queue.add(new Pair(dist + adjWt, adjNode));
               noOfWays[adjNode] = noOfWays[node];
            } else if (dist + adjWt == distance[adjNode]) {
               noOfWays[adjNode] = (noOfWays[adjNode] + noOfWays[node]) % mod;
            }
         }
      }
      return noOfWays[n - 1] % mod;
   }
}
