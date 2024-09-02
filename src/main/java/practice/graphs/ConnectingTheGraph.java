package practice.graphs;

public class ConnectingTheGraph {

   public int connect(int n, int[][] edge) {
      int extraEdges = 0;
      DisjointSet ds = new DisjointSet(n);
      for (int i = 0; i < edge.length; i++) {
         int source = edge[i][0];
         int destination = edge[i][1];
         if (ds.findUltimateParent(source) != ds.findUltimateParent(destination)) {
            ds.unionByRank(source, destination);
         } else {
            extraEdges++;
         }
      }
      int numberOfComponents = 0;
      for (int i = 0; i < n; i++) {
         if (ds.parent.get(i) == i) {
            numberOfComponents++;
         }
      }
      return extraEdges >= (numberOfComponents - 1) ? numberOfComponents - 1 : -1;
   }
}
