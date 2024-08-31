package practice.graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KruskalAlgorithm {

   public int spanningTree(int V, int E, List<List<List<Integer>>> adj) {
      List<Edge> edges = new ArrayList<>();
      for (int i = 0; i < V; i++) {
         for (int j = 0; j < adj.get(i).size(); j++) {
            int adjNode = adj.get(i).get(j).get(0);
            int wt = adj.get(i).get(j).get(1);
            Edge temp = new Edge(i, adjNode, wt);
            edges.add(temp);
         }
      }

      DisjointSet ds = new DisjointSet(V);
      Collections.sort(edges);
      int minimumWeight = 0;
      for (Edge edge : edges) {
         int src = edge.source;
         int dest = edge.destination;
         int wt = edge.weight;
         if (ds.findUltimateParent(src) != ds.findUltimateParent(dest)) {
            minimumWeight += wt;
            ds.unionBySize(src, dest);
         }
      }
      return minimumWeight;
   }
}
