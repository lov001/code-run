package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class DistinctSubsequences {

   private static final int MOD = 1000000007;

   public int distinctSubsequencesTabulation(String str, String sub) {
      int count = 0;
      if (sub.length() > str.length()) {
         return count;
      }
      int n = str.length();
      int m = sub.length();
      int[][] dp = new int[n + 1][m + 1];
      for (int i = 0; i <= n; i++) {
         dp[i][0] = 1;
      }
      for (int j = 1; j <= m; j++) {
         dp[0][j] = 0;
      }
      for (int index1 = 1; index1 <= n; index1++) {
         for (int index2 = 1; index2 <= m; index2++) {
            if (str.charAt(index1 - 1) == sub.charAt(index2 - 1)) {
               dp[index1][index2] = (dp[index1 - 1][index2 - 1] + dp[index1 - 1][index2]) % MOD;
            } else {
               dp[index1][index2] = dp[index1 - 1][index2] % MOD;
            }
         }
      }
      return dp[n][m];
   }

   public int distinctSubsequences(String str, String sub) {
      int count = 0;
      if (sub.length() > str.length()) {
         return count;
      }
      int n = str.length();
      int m = sub.length();
      int[][] dp = new int[n + 1][m + 1];
      for (int[] row : dp) {
         Arrays.fill(row, -1);
      }
      return helper(n - 1, m - 1, str, sub, dp);
   }

   private int helper(int index1, int index2, String str, String sub, int[][] dp) {
      if (index2 < 0) {
         return 1;
      }
      if (index1 < 0) {
         return 0;
      }
      if (dp[index1][index2] != -1) {
         return dp[index1][index2];
      }
      if (str.charAt(index1) == sub.charAt(index2)) {
         dp[index1][index2] =
            (helper(index1 - 1, index2 - 1, str, sub, dp) + helper(index1 - 1, index2, str, sub,
               dp)) % MOD;
      } else {
         dp[index1][index2] = helper(index1 - 1, index2, str, sub, dp) % MOD;
      }
      return dp[index1][index2];
   }
}
