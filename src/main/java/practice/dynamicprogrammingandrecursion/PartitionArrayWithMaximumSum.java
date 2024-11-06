package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class PartitionArrayWithMaximumSum {

   public int maximumSubArrayTabulation(int[] arr, int k) {
      int n = arr.length;
      int[] dp = new int[n + 1];
      int maxSum = Integer.MIN_VALUE;
      for (int index = n - 1; index >= 0; index--) {
         int max = Integer.MIN_VALUE;
         int length = 0;
         int end = Math.min(n, index + k);
         for (int j = index; j < end; j++) {
            length++;
            max = Math.max(max, arr[j]);
            int sum = max * length + dp[j + 1];
            maxSum = Math.max(maxSum, sum);
         }
         dp[index] = maxSum;
      }
      return dp[0];
   }

   public int maximumSubArray(int[] arr, int k) {
      int n = arr.length;
      int[] dp = new int[n + 1];
      Arrays.fill(dp, -1);
      return solve(0, k, n, arr, dp);
   }

   private int solve(int index, int k, int n, int[] arr, int[] dp) {
      if (index == n) {
         return 0;
      }
      if (dp[index] != -1) {
         return dp[index];
      }
      int maxSum = Integer.MIN_VALUE;
      int max = Integer.MIN_VALUE;
      int length = 0;
      int end = Math.min(n, index + k);
      for (int j = index; j < end; j++) {
         length++;
         max = Math.max(max, arr[j]);
         int sum = max * length + solve(j + 1, k, n, arr, dp);
         maxSum = Math.max(maxSum, sum);
      }
      return dp[index] = maxSum;
   }
}
