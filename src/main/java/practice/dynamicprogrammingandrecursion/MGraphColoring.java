package practice.dynamicprogrammingandrecursion;

public class MGraphColoring {

   public boolean graphColoring(boolean[][] graph, int m, int n) {
      int[] color = new int[n];
      return color(graph, color, m, 0, n);
   }

   private boolean color(boolean[][] graph, int[] color, int m, int node, int n) {
      if (node == n) {
         return true;
      }
      for (int i = 1; i <= m; i++) {
         if (isValidColor(node, graph, color, i)) {
            color[node] = i;
            if (color(graph, color, m, node + 1, n)) {
               return true;
            }
            color[node] = 0;
         }
      }
      return false;
   }

   private boolean isValidColor(int node, boolean[][] graph, int[] color, int paintColor) {
      if(node >= graph.length){
         return false;
      }
      for (int i = 0; i < graph[node].length; i++) {
         if (graph[node][i] && color[i] == paintColor) {
            return false;
         }
      }
      return true;
   }
}
