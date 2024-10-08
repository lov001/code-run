package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class RodCuttingProblem {

   public int cutRodTabulation(int[] price, int n) {
      int[][] dp = new int[n][n + 1];
      for (int N = 0; N <= n; N++) {
         dp[0][N] = N * price[0];
      }
      for (int index = 1; index < n; index++) {
         for (int N = 0; N <= n; N++) {
            int notTake = dp[index - 1][N];
            int take = Integer.MIN_VALUE;
            int rodLength = index + 1;
            if (rodLength <= N) {
               take = price[index] + dp[index][N - rodLength];
            }
            dp[index][N] = Math.max(notTake, take);
         }
      }
      return dp[n - 1][n];
   }

   public int cutRodSpaceOptimisation(int[] price, int n) {
      int[] previous = new int[n + 1];
      for (int N = 0; N <= n; N++) {
         previous[N] = N * price[0];
      }
      for (int index = 1; index < n; index++) {
         int[] current = new int[n + 1];
         for (int N = 0; N <= n; N++) {
            int notTake = previous[N];
            int take = Integer.MIN_VALUE;
            int rodLength = index + 1;
            if (rodLength <= N) {
               take = price[index] + current[N - rodLength];
            }
            current[N] = Math.max(notTake, take);
         }
         previous = current;
      }
      return previous[n];
   }

   public int cutRod(int[] price, int n) {
      int[][] dp = new int[n][n + 1];
      for (int[] rows : dp) {
         Arrays.fill(rows, -1);
      }
      return solve(n - 1, n, price, dp);
   }

   private int solve(int index, int N, int[] price, int[][] dp) {
      if (index == 0) {
         return N * price[0];
      }
      if (dp[index][N] != -1) {
         return dp[index][N];
      }
      int notTake = solve(index - 1, N, price, dp);
      int take = Integer.MIN_VALUE;
      int rodLength = index + 1;
      if (rodLength <= N) {
         take = price[index] + solve(index, N - rodLength, price, dp);
      }
      return dp[index][N] = Math.max(notTake, take);
   }
}
