package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class UniquePaths {

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
