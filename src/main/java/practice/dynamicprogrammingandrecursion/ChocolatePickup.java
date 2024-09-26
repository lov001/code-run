package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class ChocolatePickup {

   public int maximumChocolatesTabulation(int r, int c, int[][] grid) {
      int[][][] dp = new int[r][c][c];
      dp[r - 1][0][0] = grid[0][0];
      dp[r - 1][0][c - 1] = grid[0][c - 1];
      for (int j1 = 0; j1 < c; j1++) {
         for (int j2 = 0; j2 < c; j2++) {
            if (j1 == j2) {
               dp[r - 1][j1][j2] = grid[r - 1][j1];
            } else {
               dp[r - 1][j1][j2] = grid[r - 1][j1] + grid[r - 1][j2];
            }
         }
      }
      for (int i = r - 2; i >= 0; i--) {
         for (int j1 = 0; j1 < c; j1++) {
            for (int j2 = 0; j2 < c; j2++) {
               int maxChocolates = -(int) 1e9;
               for (int del1 = -1; del1 <= 1; del1++) {
                  for (int del2 = -1; del2 <= 1; del2++) {
                     int value;
                     if (j1 == j2) {
                        value = grid[i][j1];
                     } else {
                        value = grid[i][j1] + grid[i][j2];
                     }
                     if (j1 + del1 >= 0 && j1 + del1 < c && j2 + del2 >= 0 && j2 + del2 < c) {
                        value += dp[i + 1][j1 + del1][j2 + del2];
                     } else {
                        value += -(int) 1e9;
                     }

                     maxChocolates = Math.max(maxChocolates, value);
                  }
               }
               dp[i][j1][j2] = maxChocolates;
            }
         }
      }
      return dp[0][0][c - 1];
   }

   public int maximumChocolates(int r, int c, int[][] grid) {
      int[][][] dp = new int[r][c][c];
      for (int[][] rows : dp) {
         for (int[] cols : rows) {
            Arrays.fill(cols, -1);
         }
      }
      return helper(0, 0, c - 1, r, c, grid, dp);
   }

   private int helper(int row, int column1, int column2, int r, int c, int[][] grid, int[][][] dp) {
      if (column1 < 0 || column1 >= c || column2 < 0 || column2 >= c) {
         return -(int) 1e9;
      }
      if (row == r - 1) {
         if (column1 == column2) {
            return grid[row][column1];
         } else {
            return grid[row][column1] + grid[row][column2];
         }
      }
      if (dp[row][column1][column2] != -1) {
         return dp[row][column1][column2];
      }
      int maxChocolates = -(int) 1e9;
      for (int i = -1; i <= 1; i++) {
         for (int j = -1; j <= 1; j++) {
            int value;
            if (column1 == column2) {
               value = grid[row][column1];
            } else {
               value = grid[row][column1] + grid[row][column2];
            }
            value += helper(row + 1, column1 + i, column2 + j, r, c, grid, dp);
            maxChocolates = Math.max(maxChocolates, value);
         }
      }
      return dp[row][column1][column2] = maxChocolates;
   }
}
