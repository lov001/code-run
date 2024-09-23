package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class UniquePaths {

   public int uniquePathsUsingTabulation(int m, int n) {
      if (m == 1 && n == 1) {
         return 1;
      }
      int[][] dp = new int[m][n];
      for (int row = 0; row < m; row++) {
         for (int col = 0; col < n; col++) {
            int up = 0, left = 0;
            if (row == 0 && col == 0) {
               dp[row][col] = 1;
               continue;
            }
            if (row > 0) {
               up = dp[row - 1][col];
            }
            if (col > 0) {
               left = dp[row][col - 1];
            }
            dp[row][col] = up + left;
         }
      }
      return dp[m - 1][n - 1];
   }

   public int uniquePathsUsingSpaceOptimisation(int m, int n) {
      if (m == 1 && n == 1) {
         return 1;
      }
      int[] previous = new int[n];
      for (int row = 0; row < m; row++) {
         int[] temp = new int[n];
         for (int col = 0; col < n; col++) {
            if (row == 0 && col == 0) {
               temp[col] = 1;
               continue;
            }
            int up = 0, left = 0;
            if (row > 0) {
               up = previous[col];
            }
            if (col > 0) {
               left = temp[col - 1];
            }
            temp[col] = up + left;
         }
         previous = temp;
      }
      return previous[n - 1];
   }

   public int uniquePaths(int m, int n) {
      if (m == 1 && n == 1) {
         return 1;
      }
      int[][] dp = new int[m][n];
      for (int i = 0; i < m; i++) {
         Arrays.fill(dp[i], -1);
      }
      return helper(m - 1, n - 1, dp);
   }

   private int helper(int row, int column, int[][] dp) {
      if (row == 0 && column == 0) {
         return 1;
      }
      if (row < 0 || column < 0) {
         return 0;
      }
      if (dp[row][column] != -1) {
         return dp[row][column];
      }
      int up = helper(row - 1, column, dp);
      int left = helper(row, column - 1, dp);
      return dp[row][column] = up + left;
   }
}
