package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class LongestCommonSubsequence {

   public int lcs(String s, String t) {
      int n = s.length();
      int m = t.length();
      int[][] dp = new int[n + 1][m + 1];
      for (int[] row : dp) {
         Arrays.fill(row, -1);
      }
      return helper(n - 1, m - 1, s, t, dp);
   }

   private int helper(int index1, int index2, String s, String t, int[][] dp) {
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
