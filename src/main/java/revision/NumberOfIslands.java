package revision;

public class NumberOfIslands {

   public int getTotalIslands(int[][] mat) {
      int count = 0;
      int n = mat.length;
      int m = mat[0].length;
      boolean[][] visited = new boolean[n][m];
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < m; j++) {
            if (mat[i][j] == 1 && !visited[i][j]) {
               dfs(i, j, n, m, mat, visited);
               count++;
            }
         }
      }
      return count;
   }

   private void dfs(int row, int column, int n, int m, int[][] grid, boolean[][] visited) {
      visited[row][column] = true;
      int[] delRows = {-1, -1, 0, 1, 1, 1, 0, -1};
      int[] delCols = {0, 1, 1, 1, 0, -1, -1, -1};
      for (int i = 0; i < 8; i++) {
         for (int j = 0; j < 8; j++) {
            int delRow = row + delRows[i];
            int delCol = column + delCols[j];
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
