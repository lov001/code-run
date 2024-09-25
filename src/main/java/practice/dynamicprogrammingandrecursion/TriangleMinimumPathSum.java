package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class TriangleMinimumPathSum {

   public int minimumPathSumTabulation(int[][] triangle, int n) {
      int[][] dp = new int[n][n];
      for (int i = 0; i < n; i++) {
         dp[n - 1][i] = triangle[n - 1][i];
      }
      for (int i = n - 2; i >= 0; i--) {
         for (int j = 0; j <= i; j++) {
            int down = triangle[i][j] + dp[i + 1][j];
            int diagonal = triangle[i][j] + dp[i + 1][j + 1];
            dp[i][j] = Math.min(down, diagonal);
         }
      }
      return dp[0][0];
   }

   public int minimumPathSum(int[][] triangle, int n) {
      int[][] dp = new int[n][n];
      for (int[] r : dp) {
         Arrays.fill(r, -1);
      }
      return helper(0, 0, n, triangle, dp);
   }

   private int helper(int row, int column, int n, int[][] triangle, int[][] dp) {
      if (row == n - 1) {
         return triangle[row][column];
      }
      if (dp[row][column] != -1) {
         return dp[row][column];
      }
      int down = triangle[row][column] + helper(row + 1, column, n, triangle, dp);
      int diagonal = triangle[row][column] + helper(row + 1, column + 1, n, triangle, dp);
      return dp[row][column] = Math.min(down, diagonal);
   }
}
