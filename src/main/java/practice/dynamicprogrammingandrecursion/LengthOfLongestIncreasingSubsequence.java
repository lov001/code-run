package practice.dynamicprogrammingandrecursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import practice.utils.BinarySearchUtils;

public class LengthOfLongestIncreasingSubsequence {

   public int longestIncreasingSubsequenceBinarySearch(int[] arr) {
      int n = arr.length;
      List<Integer> result = new ArrayList<>();
      result.add(arr[0]);
      int length = 1;
      for (int i = 1; i < n; i++) {
         if (arr[i] > result.get(result.size() - 1)) {
            result.add(arr[i]);
            length++;
         } else {
            int index = BinarySearchUtils.lowerBound(result, arr[i]);
            if (index < 0) {
               index = -index - 1;
            }
            result.set(index, arr[i]);
         }
      }
      return length;
   }

   public int longestIncreasingSubsequenceOptimised(int[] arr) {
      int n = arr.length;
      int[] dp = new int[n];
      Arrays.fill(dp, 1);
      int maxLength = 0;
      for (int index = 0; index < n; index++) {
         for (int previous = 0; previous < index; previous++) {
            if (arr[previous] < arr[index]) {
               dp[index] = Math.max(dp[index], 1 + dp[previous]);
            }
            maxLength = Math.max(maxLength, dp[index]);
         }
      }
      return maxLength;
   }

   public int longestIncreasingSubsequenceTabulation(int[] arr) {
      int n = arr.length;
      int[][] dp = new int[n + 1][n + 1];
      for (int index = n - 1; index >= 0; index--) {
         for (int previous = index - 1; previous >= -1; previous--) {
            int length = dp[index + 1][previous + 1];
            if (previous == -1 || arr[index] > arr[previous]) {
               length = Math.max(length, 1 + dp[index + 1][index + 1]);
            }
            dp[index][previous + 1] = length;
         }
      }
      return dp[0][0];
   }

   public int longestIncreasingSubsequenceSpaceOptimisation(int[] arr) {
      int n = arr.length;
      int[] current = new int[n + 1];
      int[] next = new int[n + 1];
      for (int index = n - 1; index >= 0; index--) {
         for (int previous = index - 1; previous >= -1; previous--) {
            int length = next[previous + 1];
            if (previous == -1 || arr[index] > arr[previous]) {
               length = Math.max(length, 1 + next[index + 1]);
            }
            current[previous + 1] = length;
         }
         next = current;
      }
      return next[0];
   }

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
