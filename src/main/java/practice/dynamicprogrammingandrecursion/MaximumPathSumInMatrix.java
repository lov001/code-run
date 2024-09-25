package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class MaximumPathSumInMatrix {

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
