package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class MinimumPathSum {


   public int minPathSumTabulationSpaceOptimisation(int[][] grid) {
      int rows = grid.length;
      int columns = grid[0].length;
      int[] previous = new int[columns];
      Arrays.fill(previous, 0);
      for (int row = 0; row < rows; row++) {
         int[] current = new int[columns];
         for (int column = 0; column < columns; column++) {
            if (row == 0 && column == 0) {
               current[column] = grid[0][0];
               continue;
            }
            int up = grid[row][column];
            if (row > 0) {
               up += previous[column];
            } else {
               up += (int) Math.pow(10, 9);
            }
            int left = grid[row][column];
            if (column > 0) {
               left += current[column - 1];
            } else {
               left += (int) Math.pow(10, 9);
            }
            current[column] = Math.min(up, left);
         }
         previous = current;
      }
      return previous[columns - 1];
   }

   public int minPathSumTabulation(int[][] grid) {
      int rows = grid.length;
      int columns = grid[0].length;
      int[][] dp = new int[rows][columns];
      for (int row = 0; row < rows; row++) {
         for (int column = 0; column < columns; column++) {
            int up, left;
            if (row == 0 && column == 0) {
               dp[0][0] = grid[0][0];
               continue;
            }
            up = grid[row][column];
            left = grid[row][column];
            if (row > 0) {
               up += dp[row - 1][column];
            } else {
               up += (int) Math.pow(10, 9);
            }
            if (column > 0) {
               left += dp[row][column - 1];
            } else {
               left += (int) Math.pow(10, 9);
            }
            dp[row][column] = Math.min(up, left);
         }
      }
      return dp[rows - 1][columns - 1];
   }

   public int minPathSum(int[][] grid) {
      int rows = grid.length;
      int columns = grid[0].length;
      int[][] dp = new int[rows][columns];
      for (int[] r : dp) {
         Arrays.fill(r, -1);
      }
      return helper(rows - 1, columns - 1, grid, dp);
   }

   private int helper(int row, int column, int[][] grid, int[][] dp) {
      if (row == 0 && column == 0) {
         return grid[row][column];
      }
      if (row < 0 || column < 0) {
         return (int) Math.pow(10, 9);
      }
      if (dp[row][column] != -1) {
         return dp[row][column];
      }
      int up = grid[row][column] + helper(row - 1, column, grid, dp);
      int left = grid[row][column] + helper(row, column - 1, grid, dp);
      return dp[row][column] = Math.min(up, left);
   }
}
