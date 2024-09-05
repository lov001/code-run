package practice.graphs;

import java.util.HashSet;
import java.util.Set;

public class MaximumConnectedGroup {

   public int maxConnection(int[][] grid) {
      if (grid == null) {
         return 0;
      }
      int rows = grid.length;
      int columns = grid[0].length;
      DisjointSet ds = new DisjointSet(rows * columns);
      int[][] visited = new int[rows][columns];
      int[] delRow = {-1, 0, 1, 0};
      int[] delCol = {0, 1, 0, -1};
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < columns; j++) {
            if (visited[i][j] != 1 && grid[i][j] == 1) {
               visited[i][j] = 1;
               for (int k = 0; k < 4; k++) {
                  int adjRow = i + delRow[k];
                  int adjCol = j + delCol[k];
                  if (isValidNeighbor(adjRow, adjCol, rows, columns) && grid[adjRow][adjCol] == 1) {
                     int currentNode = (i * columns) + j;
                     int adjacentNode = (adjRow * columns) + adjCol;
                     if (ds.findUltimateParent(currentNode) != ds.findUltimateParent(
                        adjacentNode)) {
                        ds.unionBySize(currentNode, adjacentNode);
                     }
                  }
               }
            }
         }
      }
      int maxConnectedGroupSize = 0;
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < columns; j++) {
            if (grid[i][j] == 0) {
               Set<Integer> set = new HashSet<>();
               for (int k = 0; k < 4; k++) {
                  int adjRow = i + delRow[k];
                  int adjCol = j + delCol[k];
                  if (isValidNeighbor(adjRow, adjCol, rows, columns) && grid[adjRow][adjCol] == 1) {
                     int adjacentNode = (adjRow * columns) + adjCol;
                     int ultimateParent = ds.findUltimateParent(adjacentNode);
                     set.add(ultimateParent);
                  }
               }
               int currentMax = 1;
               for (int parent : set) {
                  currentMax += ds.size.get(parent);
               }
               maxConnectedGroupSize = Math.max(maxConnectedGroupSize, currentMax);
            }
         }
      }
      return maxConnectedGroupSize > 0 ? maxConnectedGroupSize : rows * columns;
   }

   private boolean isValidNeighbor(int nRow, int nCol, int rows, int cols) {
      return nRow >= 0 && nRow < rows && nCol >= 0 && nCol < cols;
   }
}
