package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class MiningDiamonds {

   public int maxCoins(int[] a) {
      int n = a.length;
      int[] updatedArray = new int[n + 2];
      updatedArray[0] = 1;
      updatedArray[updatedArray.length - 1] = 1;
      System.arraycopy(a, 0, updatedArray, 1, n);
      int[][] dp = new int[n + 2][n + 2];
      for (int[] rows : dp) {
         Arrays.fill(rows, -1);
      }
      return helper(1, n, updatedArray, dp);
   }

   private int helper(int i, int j, int[] diamonds, int[][] dp) {
      if (i > j) {
         return 0;
      }
      if (dp[i][j] != -1) {
         return dp[i][j];
      }
      int maxCoins = Integer.MIN_VALUE;
      for (int index = i; index <= j; index++) {
         int cost = diamonds[i - 1] * diamonds[index] * diamonds[j + 1]
            + helper(i, index - 1, diamonds, dp) + helper(index + 1, j, diamonds, dp);
         maxCoins = Math.max(maxCoins, cost);
      }
      return dp[i][j] = maxCoins;
   }
}
