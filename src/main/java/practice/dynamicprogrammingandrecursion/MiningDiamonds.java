package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class MiningDiamonds {

   public int maxCoinsTabulation(int[] a) {
      int n = a.length;
      int[] diamonds = new int[n + 2];
      diamonds[0] = 1;
      diamonds[diamonds.length - 1] = 1;
      System.arraycopy(a, 0, diamonds, 1, n);
      int[][] dp = new int[n + 2][n + 2];
      for (int i = n; i >= 1; i--) {
         for (int j = 1; j <= n; j++) {
            if (i > j) {
               continue;
            }
            int maxCoins = Integer.MIN_VALUE;
            for (int index = i; index <= j; index++) {
               int cost = diamonds[i - 1] * diamonds[index] * diamonds[j + 1]
                  + dp[i][index - 1] + dp[index + 1][j];
               maxCoins = Math.max(maxCoins, cost);
            }
            dp[i][j] = maxCoins;
         }
      }
      return dp[1][n];
   }

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
