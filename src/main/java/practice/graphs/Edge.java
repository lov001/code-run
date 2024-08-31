package practice.graphs;

public class Edge implements Comparable<Edge> {

   int source;
   int destination;
   int weight;

   public Edge(int src, int dest, int wt){
      this.source = src;
      this.destination = dest;
      this.weight = wt;
   }

   @Override
   public int compareTo(Edge otherEdge) {
      return this.weight - otherEdge.weight;
   }
}
