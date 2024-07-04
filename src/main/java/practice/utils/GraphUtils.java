package practice.utils;

import java.util.ArrayList;
import java.util.List;

public class GraphUtils {

   public static List<List<Integer>> transformAdjacencyMatrixToAdjacencyList(int V,
      List<List<Integer>> adjacencyMatrix) {
      List<List<Integer>> adjacencyList = new ArrayList<>();
      for (int i = 0; i < V; i++) {
         adjacencyList.add(new ArrayList<>());
      }
      for (int i = 0; i < V; i++) {
         for (int j = 0; j < V; j++) {
            if (adjacencyMatrix.get(i).get(j) == 1 && i != j) {
               adjacencyList.get(i).add(j);
            }
         }
      }
      return adjacencyList;
   }
}
