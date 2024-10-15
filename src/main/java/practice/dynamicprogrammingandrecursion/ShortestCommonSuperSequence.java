package practice.dynamicprogrammingandrecursion;

public class ShortestCommonSuperSequence {

   public String shortestSuperSequence(String a, String b) {
      int n = a.length();
      int m = b.length();
      int[][] dp = new int[n + 1][m + 1];
      for (int i = 0; i <= n; i++) {
         dp[i][0] = 0;
      }
      for (int j = 0; j <= m; j++) {
         dp[0][j] = 0;
      }
      generateLCS(n, m, a, b, dp);
      StringBuilder ans = new StringBuilder();
      int i = n;
      int j = m;
      while (i > 0 && j > 0) {
         if (a.charAt(i - 1) == b.charAt(j - 1)) {
            ans.append(a.charAt(i - 1));
            i--;
            j--;
         } else if (dp[i - 1][j] > dp[i][j - 1]) {
            ans.append(a.charAt(i - 1));
            i--;
         } else {
            ans.append(b.charAt(j - 1));
            j--;
         }
      }
      while (i > 0) {
         ans.append(a.charAt(i - 1));
         i--;
      }
      while (j > 0) {
         ans.append(b.charAt(j - 1));
         j--;
      }
      return ans.reverse().toString();
   }

   private void generateLCS(int n, int m, String a, String b, int[][] dp) {
      for (int i = 1; i <= n; i++) {
         for (int j = 1; j <= m; j++) {
            if (a.charAt(i - 1) == b.charAt(j - 1)) {
               dp[i][j] = 1 + dp[i - 1][j - 1];
            } else {
               dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
         }
      }
   }
}
