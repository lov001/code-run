package practice.graphs;

import java.util.ArrayList;
import java.util.List;

public class NumberOfIslands2 {

   public List<Integer> numOfIslands(int rows, int cols, int[][] operators) {
      List<Integer> output = new ArrayList<>();
      int[] visited = new int[rows * cols];
      int k = operators.length;
      DisjointSet ds = new DisjointSet(rows * cols);
      int currentIslands = 0;
      int[] delRow = {-1, 0, 1, 0};
      int[] delCol = {0, 1, 0, -1};
      for (int i = 0; i < k; i++) {
         int row = operators[i][0];
         int col = operators[i][1];
         if (visited[(cols * row) + col] == 1) {
            output.add(currentIslands);
            continue;
         }
         visited[(cols * row) + col] = 1;
         currentIslands++;
         for (int r = 0; r < 4; r++) {
            int deltaRow = row + delRow[r];
            int deltaCol = col + delCol[r];
            if (deltaRow >= 0 && deltaRow < rows && deltaCol >= 0 && deltaCol < cols) {
               if (visited[(cols * deltaRow) + deltaCol] == 1) {
                  int uParentOfOperator = ds.findUltimateParent((cols * row) + col);
                  int uParentOfNode = ds.findUltimateParent((cols * deltaRow) + deltaCol);
                  if (uParentOfOperator != uParentOfNode) {
                     ds.unionByRank((cols * row) + col, (cols * deltaRow) + deltaCol);
                     currentIslands--;
                  }
               }
            }
         }
         output.add(currentIslands);
      }
      return output;
   }
}
