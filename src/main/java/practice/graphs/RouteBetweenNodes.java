package practice.graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class RouteBetweenNodes {


   public boolean isReachableUsingBFS(Graph graph, int source, int destination) {
      boolean[] visited = new boolean[graph.getVertices()];
      LinkedList<Integer> queue = new LinkedList<>();
      visited[source] = true;
      queue.add(source);

      Iterator<Integer> adjacentVerticesOfCurrentVertex;
      while (!queue.isEmpty()) {
         source = queue.poll();

         int n;
         adjacentVerticesOfCurrentVertex = graph.getAdjacencyList()[source].listIterator();

         while (adjacentVerticesOfCurrentVertex.hasNext()) {
            n = adjacentVerticesOfCurrentVertex.next();
            if (destination == n) {
               return true;
            }

            if (!visited[n]) {
               visited[n] = true;
               queue.add(n);
            }
         }
      }
      return false;
   }

   public boolean isReachableUsingDFS(Graph graph, int source, int destination) {
      boolean[] visited = new boolean[graph.getVertices()];
      return isReachableUsingDFSHelper(graph, visited, source, destination);
   }

   public boolean isReachableUsingDFSHelper(Graph graph, boolean[] visited, int source,
      int destination) {
      if (source == destination) {
         return true;
      }
      visited[source] = true;
      for (int i = 0; i < graph.getAdjacencyList()[source].size(); i++) {
         int currentVertex = graph.getAdjacencyList()[source].get(i);
         if (!visited[currentVertex]) {
            if (isReachableUsingDFSHelper(graph, visited, currentVertex, destination)) {
               return true;
            }
         }
      }
      return false;
   }
}
