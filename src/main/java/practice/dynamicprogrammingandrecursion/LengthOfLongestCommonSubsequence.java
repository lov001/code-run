package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class LengthOfLongestCommonSubsequence {

   public int lcsTabulation(String s, String t) {
      int n = s.length();
      int m = t.length();
      int[][] dp = new int[n + 1][m + 1];
      for (int j = 0; j <= m; j++) {
         dp[0][j] = 0;
      }
      for (int i = 0; i <= n; i++) {
         dp[i][0] = 0;
      }
      for (int index1 = 1; index1 <= n; index1++) {
         for (int index2 = 1; index2 <= m; index2++) {
            if (s.charAt(index1 - 1) == t.charAt(index2 - 1)) {
               dp[index1][index2] = 1 + dp[index1 - 1][index2 - 1];
            } else {
               dp[index1][index2] = Math.max(dp[index1][index2 - 1], dp[index1 - 1][index2]);
            }
         }
      }
      return dp[n][m];
   }

   public int lcsSpaceOptimisation(String s, String t) {
      int n = s.length();
      int m = t.length();
      int[] previous = new int[m + 1];
      for (int j = 0; j <= m; j++) {
         previous[j] = 0;
      }
      for (int index1 = 1; index1 <= n; index1++) {
         int[] current = new int[m + 1];
         for (int index2 = 1; index2 <= m; index2++) {
            if (s.charAt(index1 - 1) == t.charAt(index2 - 1)) {
               current[index2] = 1 + previous[index2 - 1];
            } else {
               current[index2] = Math.max(current[index2 - 1], previous[index2]);
            }
         }
         previous = current;
      }
      return previous[m];
   }

      public int lcs (String s, String t){
         int n = s.length();
         int m = t.length();
         int[][] dp = new int[n + 1][m + 1];
         for (int[] row : dp) {
            Arrays.fill(row, -1);
         }
         return helper(n - 1, m - 1, s, t, dp);
      }

      private int helper ( int index1, int index2, String s, String t,int[][] dp){
         if (index1 < 0 || index2 < 0) {
            return 0;
         }
         if (dp[index1][index2] != -1) {
            return dp[index1][index2];
         }
         if (s.charAt(index1) == t.charAt(index2)) {
            return dp[index1][index2] = 1 + helper(index1 - 1, index2 - 1, s, t, dp);
         } else {
            return dp[index1][index2] = Math.max(helper(index1, index2 - 1, s, t, dp),
               helper(index1 - 1, index2, s, t, dp));
         }
      }
   }
