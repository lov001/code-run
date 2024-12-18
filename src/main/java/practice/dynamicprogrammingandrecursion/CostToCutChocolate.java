package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class CostToCutChocolate {

   public int costTabulation(int n, int c, int[] cuts) {
      int[] updatedCuts = new int[cuts.length + 2];
      updatedCuts[0] = 0;
      updatedCuts[updatedCuts.length - 1] = n;
      System.arraycopy(cuts, 0, updatedCuts, 1, cuts.length);
      Arrays.sort(updatedCuts);
      int[][] dp = new int[cuts.length + 2][cuts.length + 2];
      for (int i = c; i >= 1; i--) {
         for (int j = 1; j <= c; j++) {
            if (i > j) {
               continue;
            }
            int min = Integer.MAX_VALUE;
            for (int index = i; index <= j; index++) {
               int cost =
                  updatedCuts[j + 1] - updatedCuts[i - 1] + dp[i][index - 1] + dp[index + 1][j];
               min = Math.min(min, cost);
            }
            dp[i][j] = min;
         }
      }
      return dp[1][c];
   }

   public int cost(int n, int c, int[] cuts) {
      int[] updatedCuts = new int[cuts.length + 2];
      updatedCuts[0] = 0;
      updatedCuts[updatedCuts.length - 1] = n;
      System.arraycopy(cuts, 0, updatedCuts, 1, cuts.length);
      Arrays.sort(updatedCuts);
      int[][] dp = new int[cuts.length + 2][cuts.length + 2];
      for (int[] rows : dp) {
         Arrays.fill(rows, -1);
      }
      return helper(1, c, updatedCuts, dp);
   }

   private int helper(int i, int j, int[] cuts, int[][] dp) {
      if (i > j) {
         return 0;
      }
      if (dp[i][j] != -1) {
         return dp[i][j];
      }
      int min = Integer.MAX_VALUE;
      for (int index = i; index <= j; index++) {
         int cost =
            cuts[j + 1] - cuts[i - 1] + helper(i, index - 1, cuts, dp) + helper(index + 1, j, cuts,
               dp);
         min = Math.min(min, cost);
      }
      return dp[i][j] = min;
   }
}
