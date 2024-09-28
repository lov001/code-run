package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class SubsetSumEqualToK {

   public boolean subsetSumToK(int n, int k, int[] arr) {
      int[][] dp = new int[n][k + 1];
      for (int[] a : dp) {
         Arrays.fill(a, -1);
      }
      return helper(n - 1, k, arr, dp);
   }

   private boolean helper(int index, int target, int[] arr, int[][] dp) {
      if (target == 0) {
         return true;
      }
      if (index == 0) {
         return arr[index] == target;
      }
      if (dp[index][target] != -1) {
         return dp[index][target] != 0;
      }
      boolean notPick = helper(index - 1, target, arr, dp);
      boolean pick = false;
      if (target >= arr[index]) {
         pick = helper(index - 1, target - arr[index], arr, dp);
      }
      dp[index][target] = notPick || pick ? 1 : 0;
      return notPick || pick;
   }
}
