package practice.dynamicprogrammingandrecursion;

public class LongestCommonPalindromicSubsequence {

   public int longestPalindromeSubsequence(String s) {
      int n = s.length();
      if (n == 0) {
         return 0;
      }
      int[][] dp = new int[n + 1][n + 1];
      for (int i = 0; i <= n; i++) {
         dp[i][0] = 0;
         dp[0][i] = 0;
      }
      StringBuilder sb = new StringBuilder(s);
      String t = sb.reverse().toString();
      for (int index1 = 1; index1 <= n; index1++) {
         for (int index2 = 1; index2 <= n; index2++) {
            if (s.charAt(index1 - 1) == t.charAt(index2 - 1)) {
               dp[index1][index2] = 1 + dp[index1 - 1][index2 - 1];
            } else {
               dp[index1][index2] = Math.max(dp[index1 - 1][index2], dp[index1][index2 - 1]);
            }
         }
      }
      return dp[n][n];
   }
}
