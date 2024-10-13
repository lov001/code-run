package practice.dynamicprogrammingandrecursion;

public class LongestCommonSubstring {

   public int lcs(String str1, String str2) {
      int n = str1.length();
      int m = str2.length();
      int[][] dp = new int[n + 1][m + 1];
      for (int i = 0; i <= n; i++) {
         dp[i][0] = 0;
      }
      for (int j = 0; j <= m; j++) {
         dp[0][j] = 0;
      }
      int max = 0;
      for (int index1 = 1; index1 <= n; index1++) {
         for (int index2 = 1; index2 <= m; index2++) {
            if (str1.charAt(index1 - 1) == str2.charAt(index2 - 1)) {
               dp[index1][index2] = 1 + dp[index1 - 1][index2 - 1];
               max = Math.max(max, dp[index1][index2]);
            } else {
               dp[index1][index2] = 0;
            }
         }
      }
      return max;
   }
}
