package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class FrogJump {

   public int jump(int n, int[] heights) {
      int[] dp = new int[n + 1];
      Arrays.fill(dp, -1);
      return memoization(n - 1, heights, dp);
   }

   public int frogJump(int n, int[] heights) {
      int[] dp = new int[n];
      Arrays.fill(dp, -1);
      dp[0] = 0;
      for (int i = 1; i < n; i++) {
         int left = dp[i - 1] + Math.abs(heights[i] - heights[i - 1]);
         int right = Integer.MAX_VALUE;
         if (i > 1) {
            right = dp[i - 2] + Math.abs(heights[i] - heights[i - 2]);
         }
         dp[i] = Math.min(left, right);
      }
      return dp[n - 1];
   }

   private int memoization(int current, int[] heights, int[] dp) {
      if (current == 0) {
         return 0;
      }
      if (dp[current] != -1) {
         return dp[current];
      }
      int oneStep =
         memoization(current - 1, heights, dp) + Math.abs(heights[current] - heights[current - 1]);
      int twoStep = Integer.MAX_VALUE;
      if (current > 1) {
         twoStep =
            memoization(current - 2, heights, dp) + Math.abs(
               heights[current] - heights[current - 2]);
      }
      dp[current] = Math.min(oneStep, twoStep);
      return dp[current];
   }
}
