package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class ClimbingStairs {

   public int climbStairs(int n) {
      int[] dp = new int[n + 1];
      Arrays.fill(dp, -1);
      return helper(0, n, dp);
   }

   private int helper(int currentStep, int n, int[] dp) {
      if (currentStep > n) {
         return 0;
      }
      if (currentStep == n) {
         return 1;
      }
      if (dp[currentStep] != -1) {
         return dp[currentStep];
      }
      int left = helper(currentStep + 1, n, dp);
      int right = helper(currentStep + 2, n, dp);
      dp[currentStep] = left + right;
      return left + right;
   }
}
