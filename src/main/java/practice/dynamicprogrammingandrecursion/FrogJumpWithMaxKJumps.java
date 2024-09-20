package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class FrogJumpWithMaxKJumps {

   public int jump(int n, int[] heights, int k) {
      int[] dp = new int[n + 1];
      Arrays.fill(dp, -1);
      return memoization(n - 1, heights, dp, k);
   }

   private int memoization(int current, int[] heights, int[] dp, int k) {
      if (current == 0) {
         return 0;
      }
      if (dp[current] != -1) {
         return dp[current];
      }
      int minEnergy = Integer.MAX_VALUE;
      for (int i = 1; i <= k; i++) {
         if ((current - i) >= 0) {
            int jump = memoization(current - i, heights, dp, k) + Math.abs(
               heights[current] - heights[current - i]);
            minEnergy = Math.min(jump, minEnergy);
         }
      }
      dp[current] = minEnergy;
      return dp[current];
   }

   public int jumpViaTabulation(int n, int[] heights, int k) {
      int[] dp = new int[n + 1];
      Arrays.fill(dp, -1);
      dp[0] = 0;
      for (int i = 1; i < n; i++) {
         int minHeight = Integer.MAX_VALUE;
         for (int j = 1; j <= k; j++) {
            if (i - j >= 0) {
               int jump = dp[i - j] + Math.abs(heights[i - j] - heights[i]);
               minHeight = Math.min(minHeight, jump);
            }
         }
         dp[i] = minHeight;
      }
      return dp[n - 1];
   }
}
