package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class RodCuttingProblem {

   public int cutRod(int[] price, int n) {
      int[][] dp = new int[n][n+1];
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
