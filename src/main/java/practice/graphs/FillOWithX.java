package practice.graphs;

public class FillOWithX {

   public char[][] fill(int n, int m, char[][] matrix, String algorithm) {
      boolean[][] visited = new boolean[n][m];
      if ("dfs".equalsIgnoreCase(algorithm)) {
         for (int i = 0; i < m; i++) {
            if (matrix[0][i] == 'O' && !visited[0][i]) {
               dfs(matrix, visited, 0, i);
            }
            if (matrix[n - 1][i] == 'O' && !visited[n - 1][i]) {
               dfs(matrix, visited, n - 1, i);
            }
         }
         for (int i = 0; i < n; i++) {
            if (matrix[i][0] == 'O' && !visited[i][0]) {
               dfs(matrix, visited, i, 0);
            }
            if (matrix[i][m - 1] == 'O' && !visited[i][m - 1]) {
               dfs(matrix, visited, i, m - 1);
            }
         }
      }
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < m; j++) {
            if (!visited[i][j] && matrix[i][j] == 'O') {
               matrix[i][j] = 'X';
            }
         }
      }
      return matrix;
   }

   private void dfs(char[][] grid, boolean[][] visited, int row, int column) {
      visited[row][column] = true;
      int[] delRow = {-1, 0, 1, 0};
      int[] delCol = {0, 1, 0, -1};
      for (int i = 0; i < 4; i++) {
         int nRow = row + delRow[i];
         int nCol = column + delCol[i];
         if (nRow >= 0 && nRow < grid.length && nCol >= 0 && nCol < grid[0].length
            && !visited[nRow][nCol] && grid[nRow][nCol] == 'O') {
            visited[nRow][nCol] = true;
            dfs(grid, visited, nRow, nCol);
         }
      }
   }
}
