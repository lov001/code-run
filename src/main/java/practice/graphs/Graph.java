package practice.graphs;

import java.util.LinkedList;

public class Graph {

   // No of vertices
   private final int V;
   // adjacency list
   private final LinkedList<Integer>[] adjacencyList;

   public Graph(int v) {
      this.V = v;
      this.adjacencyList = new LinkedList[v];
      for (int i = 0; i < v; i++) {
         adjacencyList[i] = new LinkedList<>();
      }
   }

   public void addEdge(int v, int w) {
      adjacencyList[v].add(w);
   }

   public int getVertices() {
      return this.V;
   }

   public LinkedList<Integer>[] getAdjacencyList() {
      return this.adjacencyList;
   }
}
