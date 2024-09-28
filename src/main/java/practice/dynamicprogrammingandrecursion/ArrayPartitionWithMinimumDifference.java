package practice.dynamicprogrammingandrecursion;

public class ArrayPartitionWithMinimumDifference {

   public int minSubsetSumDifference(int[] arr, int n) {
      int totalSum = 0;
      for (int i = 0; i < n; i++) {
         totalSum += arr[i];
      }
      boolean[][] dp = partitionSum(n, totalSum, arr);
      int minimum = (int) 1e9;
      for (int i = 0; i <= totalSum / 2; i++) {
         if (dp[n - 1][i]) {
            int s2 = totalSum - i;
            minimum = Math.min(minimum, Math.abs(s2 - i));
         }
      }
      return minimum;
   }

   private boolean[][] partitionSum(int n, int k, int[] arr) {
      boolean[][] dp = new boolean[n][k + 1];
      for (int i = 0; i < n; i++) {
         dp[i][0] = true;
      }
      if (arr[0] <= k) {
         dp[0][arr[0]] = true;
      }
      for (int index = 1; index < n; index++) {
         for (int target = 1; target <= k; target++) {
            boolean notPick = dp[index - 1][target];
            boolean pick = false;
            if (target >= arr[index]) {
               pick = dp[index - 1][target - arr[index]];
            }
            dp[index][target] = notPick || pick;
         }
      }
      return dp;
   }
}
