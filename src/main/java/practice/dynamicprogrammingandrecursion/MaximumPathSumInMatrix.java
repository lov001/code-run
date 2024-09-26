package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class MaximumPathSumInMatrix {

   public int getMaxPathSumTabulation(int[][] matrix) {
      int rows = matrix.length;
      int columns = matrix[0].length;
      int[][] dp = new int[rows][columns];
      for (int j = 0; j < columns; j++) {
         dp[0][j] = matrix[0][j];
      }
      for (int i = 1; i < rows; i++) {
         for (int j = 0; j < columns; j++) {
            int leftDiagonal = matrix[i][j];
            if (j > 0) {
               leftDiagonal += dp[i - 1][j - 1];
            } else {
               leftDiagonal += -(int) 1e9;
            }
            int up = matrix[i][j] + dp[i - 1][j];
            int rightDiagonal = matrix[i][j];
            if (j + 1 < columns) {
               rightDiagonal += dp[i - 1][j + 1];
            } else {
               rightDiagonal += -(int) 1e9;
            }

            dp[i][j] = Math.max(leftDiagonal, Math.max(up, rightDiagonal));
         }
      }
      int maxSum = dp[rows - 1][0];
      for (int j = 1; j < columns; j++) {
         maxSum = Math.max(maxSum, dp[rows - 1][j]);
      }
      return maxSum;
   }

   public int getMaxPathSum(int[][] matrix) {
      int rows = matrix.length;
      int columns = matrix[0].length;
      int maxSum = -(int) 1e9;
      int[][] dp = new int[rows][columns];
      for (int[] cols : dp) {
         Arrays.fill(cols, -1);
      }
      for (int j = 0; j < columns; j++) {
         maxSum = Math.max(maxSum, helper(rows - 1, j, matrix, dp));
      }
      return maxSum;
   }

   private int helper(int row, int column, int[][] matrix, int[][] dp) {
      if (column < 0 || column >= matrix[0].length) {
         return -(int) 1e9;
      }
      if (row == 0) {
         return matrix[0][column];
      }
      if (dp[row][column] != -1) {
         return dp[row][column];
      }
      int leftDiagonal = matrix[row][column] + helper(row - 1, column - 1, matrix, dp);
      int up = matrix[row][column] + helper(row - 1, column, matrix, dp);
      int rightDiagonal = matrix[row][column] + helper(row - 1, column + 1, matrix, dp);

      return dp[row][column] = Math.max(leftDiagonal, Math.max(up, rightDiagonal));
   }
}
