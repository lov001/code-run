package practice.graphs;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfEnclaves {

   int numberOfEnclaves(int[][] grid, String algorithm) {
      int rows = grid.length;
      int columns = grid[0].length;
      boolean[][] visited = new boolean[rows][columns];
      int[] delRow = {-1, 0, 1, 0};
      int[] delCol = {0, 1, 0, -1};
      if ("dfs".equalsIgnoreCase(algorithm)) {
         for (int j = 0; j < columns; j++) {
            if (grid[0][j] == 1 && !visited[0][j]) {
               dfs(grid, visited, 0, j, delRow, delCol);
            }
            if (grid[rows - 1][j] == 1 && !visited[rows - 1][j]) {
               dfs(grid, visited, rows - 1, j, delRow, delCol);
            }
         }
         for (int i = 0; i < rows; i++) {
            if (grid[i][0] == 1 && !visited[i][0]) {
               dfs(grid, visited, i, 0, delRow, delCol);
            }
            if (grid[i][columns - 1] == 1 && !visited[i][columns - 1]) {
               dfs(grid, visited, i, columns - 1, delRow, delCol);
            }
         }
      } else {
         Queue<Pair> queue = new LinkedList<>();
         for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
               if (i == 0 || j == 0 || i == rows - 1 || j == columns - 1) {
                  if (grid[i][j] == 1) {
                     visited[i][j] = true;
                     queue.add(new Pair(i, j));
                  }
               }
            }
         }
         while (!queue.isEmpty()) {
            Pair node = queue.poll();
            for (int i = 0; i < 4; i++) {
               int nRow = node.first + delRow[i];
               int nCol = node.second + delCol[i];
               if (nRow >= 0 && nRow < grid.length && nCol >= 0 && nCol < grid[0].length
                  && !visited[nRow][nCol] && grid[nRow][nCol] == 1) {
                  queue.add(new Pair(nRow, nCol));
                  visited[nRow][nCol] = true;
               }
            }
         }
      }
      int count = 0;
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < columns; j++) {
            if (grid[i][j] == 1 && !visited[i][j]) {
               count++;
            }
         }
      }
      return count;
   }

   private void dfs(int[][] grid, boolean[][] visited, int row, int column, int[] delRow,
      int[] delCol) {
      visited[row][column] = true;
      for (int i = 0; i < 4; i++) {
         int nRow = row + delRow[i];
         int nCol = column + delCol[i];
         if (nRow >= 0 && nRow < grid.length && nCol >= 0 && nCol < grid[0].length
            && !visited[nRow][nCol] && grid[nRow][nCol] == 1) {
            dfs(grid, visited, nRow, nCol, delRow, delCol);
         }
      }
   }
}
