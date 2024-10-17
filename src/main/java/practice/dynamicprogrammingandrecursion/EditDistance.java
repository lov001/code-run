package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class EditDistance {

   public int editDistance(String str1, String str2) {
      int n = str1.length();
      int m = str2.length();
      int[][] dp = new int[n + 1][m + 1];
      for (int[] row : dp) {
         Arrays.fill(row, -1);
      }
      return helper(n - 1, m - 1, str1, str2, dp);
   }

   private int helper(int index1, int index2, String str1, String str2, int[][] dp) {
      if (index1 < 0) {
         return index2 + 1;
      }
      if (index2 < 0) {
         return index1 + 1;
      }
      if (dp[index1][index2] != -1) {
         return dp[index1][index2];
      }
      if (str1.charAt(index1) == str2.charAt(index2)) {
         dp[index1][index2] = helper(index1 - 1, index2 - 1, str1, str2, dp);
      } else {
         int insert = 1 + helper(index1, index2 - 1, str1, str2, dp);
         int delete = 1 + helper(index1 - 1, index2, str1, str2, dp);
         int replace = 1 + helper(index1 - 1, index2 - 1, str1, str2, dp);
         dp[index1][index2] = Math.min(insert, Math.min(delete, replace));
      }
      return dp[index1][index2];
   }

}
