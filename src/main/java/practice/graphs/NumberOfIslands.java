package practice.graphs;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {

   public int numberOfIslands(char[][] grid, String algorithm) {
      int count = 0;
      int rows = grid.length;
      int columns = grid[0].length;
      boolean[][] visited = new boolean[rows][columns];
      if ("bfs".equalsIgnoreCase(algorithm)) {
         for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
               if (grid[row][column] == '1' && !visited[row][column]) {
                  bfs(visited, grid, row, column);
                  count++;
               }
            }
         }
      } else {
         for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
               if (grid[row][column] == '1' && !visited[row][column]) {
                  dfs(visited, grid, row, column);
                  count++;
               }
            }
         }
      }
      return count;
   }

   private void dfs(boolean[][] visited, char[][] grid, int ro, int co) {
      visited[ro][co] = true;
      int n = grid.length;
      int m = grid[0].length;
      for (int deltaRow = -1; deltaRow <= 1; deltaRow++) {
         for (int deltaCol = -1; deltaCol <= 1; deltaCol++) {
            int nRow = ro + deltaRow;
            int nCol = co + deltaCol;
            if (nRow >= 0 && nRow < n && nCol >= 0 && nCol < m
               && grid[nRow][nCol] == '1' && !visited[nRow][nCol]) {
               visited[nRow][nCol] = true;
               dfs(visited, grid, nRow, nCol);
            }
         }
      }
   }

   private void bfs(boolean[][] visited, char[][] grid, int ro, int co) {
      visited[ro][co] = true;
      Queue<Pair> queue = new LinkedList<>();
      queue.add(new Pair(ro, co));

      int n = grid.length;
      int m = grid[0].length;
      while (!queue.isEmpty()) {
         Pair pair = queue.poll();
         int row = pair.first;
         int col = pair.second;
         for (int deltaRow = -1; deltaRow <= 1; deltaRow++) {
            for (int deltaCol = -1; deltaCol <= 1; deltaCol++) {
               int nRow = row + deltaRow;
               int nCol = col + deltaCol;
               if (nRow >= 0 && nRow < n && nCol >= 0 && nCol < m
                  && grid[nRow][nCol] == '1' && !visited[nRow][nCol]) {
                  visited[nRow][nCol] = true;
                  queue.add(new Pair(nRow, nCol));
               }
            }
         }
      }
   }
}
