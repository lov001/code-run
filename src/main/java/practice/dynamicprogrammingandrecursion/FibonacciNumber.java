package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class FibonacciNumber {

   public int fib(int n, String type) {
      if (n == 0 || n == 1) {
         return n;
      }
      int[] dp = new int[n + 1];
      if ("recursion".equalsIgnoreCase(type)) {
         return solve(n);
      } else if ("tabulation".equalsIgnoreCase(type)) {
         return tabulation(n);
      } else {
         Arrays.fill(dp, -1);
         return memoization(n, dp);
      }
   }

   private int solve(int number) {
      if (number <= 1) {
         return number;
      }
      return solve(number - 1) + solve(number - 2);
   }

   private int memoization(int number, int[] dp) {
      if (number <= 1) {
         return number;
      }
      if (dp[number] != -1) {
         return dp[number];
      }
      dp[number] = memoization(number - 1, dp) + memoization(number - 2, dp);
      return dp[number];
   }

   private int tabulation(int number) {
//      int[] dp = new int[number + 1];
//      dp[0] = 0;
//      dp[1] = 1;
//      for (int i = 2; i <= number; i++) {
//         dp[i] = dp[i - 1] + dp[i - 2];
//      }
//      return dp[number];
      /**
       * To further optimise above solution, we can remove this dp array and use two variables.
       * Since we are only interested in previous two values.
       */
      int prev2 = 0;
      int prev = 1;
      for (int i = 2; i <= number; i++) {
         int current = prev + prev2;
         prev2 = prev;
         prev = current;
      }
      return prev;
   }
}
