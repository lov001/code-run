package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class CostToCutChocolate {

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
