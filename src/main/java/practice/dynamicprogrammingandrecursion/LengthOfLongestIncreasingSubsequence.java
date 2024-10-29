package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class LengthOfLongestIncreasingSubsequence {

   public int longestIncreasingSubsequence(int[] arr) {
      int n = arr.length;
      int[][] dp = new int[n][n + 1];
      for (int[] rows : dp) {
         Arrays.fill(rows, -1);
      }
      return helper(0, -1, n, arr, dp);
   }

   private int helper(int index, int previous, int n, int[] arr, int[][] dp) {
      if (index == n) {
         return 0;
      }
      if (dp[index][previous + 1] != -1) {
         return dp[index][previous + 1];
      }
      int len = helper(index + 1, previous, n, arr, dp);
      if (previous == -1 || arr[index] > arr[previous]) {
         len = Math.max(len, 1 + helper(index + 1, index, n, arr, dp));
      }
      return dp[index][previous + 1] = len;
   }
}
