package practice.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CheapestFlightsWithinKStops {

   public int cheapestFlight(int n, int[][] flights, int src, int dst, int k) {
      List<List<Pair>> adj = new ArrayList<>();
      for (int i = 0; i < n; i++) {
         adj.add(new ArrayList<>());
      }
      for (int[] flight : flights) {
         adj.get(flight[0]).add(new Pair(flight[1], flight[2]));
      }
      Queue<Triplet> queue = new LinkedList<>();
      queue.add(new Triplet(0, src, 0));
      int[] distance = new int[n];
      Arrays.fill(distance, Integer.MAX_VALUE);
      distance[src] = 0;
      while (!queue.isEmpty()) {
         Triplet triplet = queue.poll();
         int stops = triplet.first;
         int node = triplet.second;
         int cost = triplet.third;
         if (stops > k) {
            continue;
         }
         for (Pair adjacent : adj.get(node)) {
            if ((cost + adjacent.second < distance[adjacent.first]) && stops <= k) {
               distance[adjacent.first] = cost + adjacent.second;
               queue.add(new Triplet(stops + 1, adjacent.first, cost + adjacent.second));
            }
         }
      }
      if (distance[dst] != Integer.MAX_VALUE) {
         return distance[dst];
      }
      return -1;
   }
}
