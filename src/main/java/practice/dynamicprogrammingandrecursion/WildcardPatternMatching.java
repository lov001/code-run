package practice.dynamicprogrammingandrecursion;

public class WildcardPatternMatching {

   public boolean wildcardMatchingTabulation(String pattern, String text) {
      int n = pattern.length();
      int m = text.length();
      boolean[][] dp = new boolean[n + 1][m + 1];
      dp[0][0] = true;
      for (int i = 1; i <= n; i++) {
         dp[i][0] = isAllStars(pattern, i);
      }
      for (int index1 = 1; index1 <= n; index1++) {
         for (int index2 = 1; index2 <= m; index2++) {
            if (pattern.charAt(index1 - 1) == text.charAt(index2 - 1)
               || pattern.charAt(index1 - 1) == '?') {
               dp[index1][index2] = dp[index1 - 1][index2 - 1];
            } else {
               if (pattern.charAt(index1 - 1) == '*') {
                  dp[index1][index2] = dp[index1 - 1][index2] || dp[index1][index2 - 1];
               } else {
                  dp[index1][index2] = false;
               }
            }

         }
      }

      return dp[n][m];
   }

   public boolean wildcardMatching(String pattern, String text) {
      int n = pattern.length();
      int m = text.length();
      boolean[][] dp = new boolean[n + 1][m + 1];
      return helper(n - 1, m - 1, pattern, text, dp);
   }

   private boolean helper(int index1, int index2, String pattern, String text, boolean[][] dp) {
      if (index1 < 0 && index2 < 0) {
         return true;
      }
      if (index1 < 0 && index2 >= 0) {
         return false;
      }
      if (index2 < 0) {
         while (index1 >= 0) {
            if (pattern.charAt(index1) != '*') {
               return false;
            }
            index1--;
         }
         return true;
      }
      if (dp[index1][index2]) {
         return dp[index1][index2];
      }
      if (pattern.charAt(index1) == text.charAt(index2) || pattern.charAt(index1) == '?') {
         dp[index1][index2] = helper(index1 - 1, index2 - 1, pattern, text, dp);
      }
      if (pattern.charAt(index1) == '*') {
         dp[index1][index2] = helper(index1 - 1, index2, pattern, text, dp) ||
            helper(index1, index2 - 1, pattern, text, dp);
      }

      return dp[index1][index2];
   }

   private boolean isAllStars(String S1, int i) {
      for (int j = 1; j <= i; j++) {
         if (S1.charAt(j - 1) != '*') {
            return false;
         }
      }
      return true;
   }

}
