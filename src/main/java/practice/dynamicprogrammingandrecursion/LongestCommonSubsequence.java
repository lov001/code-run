package practice.dynamicprogrammingandrecursion;

public class LongestCommonSubsequence {

   public String findLCS(int n, int m, String s1, String s2) {
      int[][] dp = new int[n + 1][m + 1];
      for (int i = 0; i < n; i++) {
         dp[i][0] = 0;
      }
      for (int j = 0; j < n; j++) {
         dp[0][j] = 0;
      }
      for (int index1 = 1; index1 <= n; index1++) {
         for (int index2 = 1; index2 <= m; index2++) {
            if (s1.charAt(index1 - 1) == s2.charAt(index2 - 1)) {
               dp[index1][index2] = 1 + dp[index1 - 1][index2 - 1];
            } else {
               dp[index1][index2] = Math.max(dp[index1 - 1][index2], dp[index1][index2 - 1]);
            }
         }
      }
      int i = n;
      int j = m;
      int maxLength = dp[n][m];
      int index = maxLength - 1;
      StringBuilder str2 = new StringBuilder("$".repeat(Math.max(0, maxLength)));
      while (i > 0 && j > 0) {
         if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
            str2.setCharAt(index, s1.charAt(i - 1));
            index--;
            i--;
            j--;
         } else if (dp[i - 1][j] > dp[i][j - 1]) {
            i--;
         } else {
            j--;
         }
      }
      return str2.toString();
   }
}
