package practice.dynamicprogrammingandrecursion;

public class CountSquareSubMatrices {

   public int countSquares(int n, int m, int[][] arr) {
      int[][] dp = new int[n][m];
      for (int j = 0; j < m; j++) {
         dp[0][j] = arr[0][j];
      }
      for (int i = 0; i < n; i++) {
         dp[i][0] = arr[i][0];
      }
      if (n <= 1 || m <= 1) {
         return n * m;
      }
      for (int i = 1; i < n; i++) {
         for (int j = 1; j < m; j++) {
            if (arr[i][j] == 0) {
               dp[i][j] = 0;
            } else {
               dp[i][j] = 1 + Math.min(dp[i - 1][j], Math.min(dp[i - 1][j - 1], dp[i][j - 1]));
            }
         }
      }
      int count = 0;
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < m; j++) {
            count += dp[i][j];
         }
      }
      return count;
   }
}
