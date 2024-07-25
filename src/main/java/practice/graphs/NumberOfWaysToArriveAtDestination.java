package practice.graphs;

import java.util.ArrayList;
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
      long[] distance = new long[n];
      int[] noOfWays = new int[n];
      for (int i = 0; i < n; i++) {
         distance[i] = Long.MAX_VALUE;
         noOfWays[i] = 0;
      }
      distance[0] = 0;
      noOfWays[0] = 1;
      Queue<Pair> queue = new PriorityQueue<>((x, y) -> (int) (x.distance - y.distance));
      queue.add(new Pair(0, 0));
      int mod = (int) (1e9 + 7);
      while (!queue.isEmpty()) {
         Pair pair = queue.poll();
         long dist = pair.distance;
         int node = pair.node;
         for (Pair adjPair : adj.get(node)) {
            int adjNode = adjPair.node;
            long adjWt = adjPair.distance;
            if (dist + adjWt < distance[adjNode]) {
               distance[adjNode] = dist + adjWt;
               queue.add(new Pair(adjNode, dist + adjWt));
               noOfWays[adjNode] = noOfWays[node] % mod;
            } else if (dist + adjWt == distance[adjNode]) {
               noOfWays[adjNode] = (noOfWays[adjNode] + noOfWays[node]) % mod;
            }
         }
      }
      return noOfWays[n - 1] % mod;
   }

   class Pair {

      int node;
      long distance;

      Pair(int node, long distance) {
         this.node = node;
         this.distance = distance;
      }
   }
}
