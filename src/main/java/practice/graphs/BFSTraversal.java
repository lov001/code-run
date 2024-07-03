package practice.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSTraversal {

   public List<Integer> bfsTraversal(List<Integer> nodes, List<List<Integer>> adjacencyList) {
      List<Integer> bfsResult = new ArrayList<>();
      boolean[] isVisited = new boolean[nodes.size() + 1];
      Queue<Integer> bfsQueue = new LinkedList<>();
      bfsQueue.add(nodes.get(0));
      isVisited[1] = true;
      while (!bfsQueue.isEmpty()) {
         Integer node = bfsQueue.poll();
         bfsResult.add(node);
         for (Integer neighbour : adjacencyList.get(node)) {
            if (!isVisited[neighbour]) {
               isVisited[neighbour] = true;
               bfsQueue.add(neighbour);
            }
         }
      }
      return bfsResult;
   }

   public List<Integer> bfsTraversal(int V, List<List<Integer>> adjacencyList) {
      List<Integer> bfsResult = new ArrayList<>();
      boolean[] isVisited = new boolean[V];
      Queue<Integer> bfsQueue = new LinkedList<>();
      bfsQueue.add(0);
      isVisited[0] = true;
      while (!bfsQueue.isEmpty()) {
         Integer node = bfsQueue.poll();
         bfsResult.add(node);
         for (Integer neighbour : adjacencyList.get(node)) {
            if (!isVisited[neighbour]) {
               isVisited[neighbour] = true;
               bfsQueue.add(neighbour);
            }
         }
      }
      return bfsResult;
   }
}
