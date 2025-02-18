package revision;

import java.util.LinkedList;
import java.util.Queue;
import practice.graphs.Pair;

public class NumberOfIslands {

   public int getTotalIslands(int[][] mat, String traversal) {
      int count = 0;
      int n = mat.length;
      int m = mat[0].length;
      boolean[][] visited = new boolean[n][m];
      if ("dfs".equalsIgnoreCase(traversal)) {
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
               if (mat[i][j] == 1 && !visited[i][j]) {
                  dfs(i, j, n, m, mat, visited);
                  count++;
               }
            }
         }
      } else {
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
               if (mat[i][j] == 1 && !visited[i][j]) {
                  bfs(i, j, n, m, mat, visited);
                  count++;
               }
            }
         }
      }

      return count;
   }

   private void bfs(int ro, int co, int n, int m, int[][] mat, boolean[][] visited) {
      visited[ro][co] = true;
      Queue<Pair> queue = new LinkedList<>();
      queue.add(new Pair(ro, co));
      while (!queue.isEmpty()) {
         Pair pair = queue.poll();
         int row = pair.first;
         int col = pair.second;
         for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
               int delRow = row + i;
               int delCol = col + j;
               if (isValid(delRow, delCol, n, m) && !visited[delRow][delCol]
                  && mat[delRow][delCol] == 1) {
                  visited[delRow][delCol] = true;
                  queue.add(new Pair(delRow, delCol));
               }
            }
         }
      }
   }

   private void dfs(int row, int column, int n, int m, int[][] grid, boolean[][] visited) {
      visited[row][column] = true;
      for (int i = -1; i <= 1; i++) {
         for (int j = -1; j <= 1; j++) {
            int delRow = row + i;
            int delCol = column + j;
            if (isValid(delRow, delCol, n, m) && !visited[delRow][delCol]
               && grid[delRow][delCol] == 1) {
               dfs(delRow, delCol, n, m, grid, visited);
            }
         }
      }
   }

   private boolean isValid(int row, int column, int n, int m) {
      return (row >= 0 && row < n) && (column >= 0 && column < m);
   }
}
