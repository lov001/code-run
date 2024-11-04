package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class NumberOfLongestIncreasingSubsequence {

   public int findNumberOfLIS(int[] arr) {
      int n = arr.length;
      int[] dp = new int[n];
      int[] count = new int[n];
      Arrays.fill(dp, 1);
      Arrays.fill(count, 1);
      int maxCount = 1;
      for (int i = 0; i < n; i++) {
         for (int prev = 0; prev < i; prev++) {
            if (arr[i] > arr[prev] && (1 + dp[prev] > dp[i])) {
               dp[i] = 1 + dp[prev];
               count[i] = count[prev];
            } else if (arr[i] > arr[prev] && (1 + dp[prev] == dp[i])) {
               count[i] += count[prev];
            }
         }
         maxCount = Math.max(maxCount, dp[i]);
      }
      int counts = 0;
      for(int i=0; i<n; i++){
         if(dp[i] == maxCount){
            counts += count[i];
         }
      }
      return counts;
   }
}
