package practice.graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CycleInUndirectedGraph {

   public boolean isCycle(int V, List<List<Integer>> adj) {
      boolean[] isVisited = new boolean[V];
      Queue<Pair> queue = new LinkedList<>();
      queue.add(new Pair(0, -1));
      isVisited[0] = true;
      while (!queue.isEmpty()) {
         Pair node = queue.poll();
         if (isVisited[node.first] && node.second != -1) {
            return true;
         }
         for (Integer neighbour : adj.get(node.first)) {
            if (!isVisited[neighbour]) {
               isVisited[neighbour] = true;
               queue.add(new Pair(neighbour, node.first));
            }
         }
      }
      return false;
   }
}
