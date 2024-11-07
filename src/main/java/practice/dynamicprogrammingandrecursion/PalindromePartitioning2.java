package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class PalindromePartitioning2 {

   public int palindromePartitioningTabulation(String str) {
      int n = str.length();
      int[] dp = new int[n + 1];
      for (int i = n - 1; i >= 0; i--) {
         int minCount = Integer.MAX_VALUE;
         for (int j = i; j < n; j++) {
            if (isPalindrome(str, i, j)) {
               int cost = 1 + dp[j + 1];
               minCount = Math.min(minCount, cost);
            }
         }
         dp[i] = minCount;
      }
      return dp[0] - 1;
   }

   public int palindromePartitioning(String str) {
      int n = str.length();
      int[] dp = new int[n];
      Arrays.fill(dp, -1);
      return helper(0, n, str, dp) - 1;
   }

   private int helper(int i, int n, String str, int[] dp) {
      if (i == n) {
         return 0;
      }
      if (dp[i] != -1) {
         return dp[i];
      }
      int minCount = Integer.MAX_VALUE;
      for (int j = i; j < n; j++) {
         if (isPalindrome(str, i, j)) {
            int cost = 1 + helper(j + 1, n, str, dp);
            minCount = Math.min(minCount, cost);
         }
      }
      return dp[i] = minCount;
   }

   private boolean isPalindrome(String str, int start, int end) {
      while (start < end) {
         if (str.charAt(start) != str.charAt(end)) {
            return false;
         }
         start++;
         end--;
      }
      return true;
   }
}
