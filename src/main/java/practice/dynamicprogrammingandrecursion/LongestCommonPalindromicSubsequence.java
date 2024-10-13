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

   public int longestPalindromeSubsequenceSpaceOptimised(String s) {
      int n = s.length();
      if (n == 0) {
         return 0;
      }
      int[] previous = new int[n + 1];
      for (int i = 0; i <= n; i++) {
         previous[0] = 0;
      }
      StringBuilder sb = new StringBuilder(s);
      String t = sb.reverse().toString();
      for (int index1 = 1; index1 <= n; index1++) {
         int[] current = new int[n + 1];
         for (int index2 = 1; index2 <= n; index2++) {
            if (s.charAt(index1 - 1) == t.charAt(index2 - 1)) {
               current[index2] = 1 + previous[index2 - 1];
            } else {
               current[index2] = Math.max(previous[index2], current[index2 - 1]);
            }
         }
         previous = current;
      }
      return previous[n];
   }
}
