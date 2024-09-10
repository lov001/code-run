package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class FibonacciNumber {

   public int fib(int n, String type) {
      int[] dp = new int[n + 1];
      if ("recursion".equalsIgnoreCase(type)) {
         return solve(n);
      } else {
         Arrays.fill(dp, -1);
         return solve(n, dp);
      }
   }

   private int solve(int number) {
      if (number <= 1) {
         return number;
      }
      return solve(number - 1) + solve(number - 2);
   }

   private int solve(int number, int[] dp) {
      if (number <= 1) {
         return number;
      }
      if (dp[number] != -1) {
         return dp[number];
      }
      dp[number] = solve(number - 1, dp) + solve(number - 2, dp);
      return dp[number];
   }

}
