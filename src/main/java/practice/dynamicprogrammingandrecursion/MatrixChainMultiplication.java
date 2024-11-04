package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class MatrixChainMultiplication {

   public int matrixMultiplication(int[] arr, int N) {
      int[][] dp = new int[N][N];
      for (int[] rows : dp) {
         Arrays.fill(rows, -1);
      }
      return helper(1, N - 1, arr, dp);
   }

   private int helper(int i, int j, int[] arr, int[][] dp) {
      if (i == j) {
         return 0;
      }
      if (dp[i][j] != -1) {
         return dp[i][j];
      }
      int steps = Integer.MAX_VALUE;
      for (int k = i; k < j; k++) {
         int operations =
            arr[i - 1] * arr[k] * arr[j] + helper(i, k, arr, dp) + helper(k + 1, j, arr,
               dp);
         steps = Math.min(steps, operations);
      }
      return dp[i][j] = steps;
   }
}
