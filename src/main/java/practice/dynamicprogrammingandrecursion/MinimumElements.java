package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class MinimumElements {

   public int minimumElements(int[] num, int x) {
      int n = num.length;
      int[][] dp = new int[n][x + 1];
      for (int[] rows : dp) {
         Arrays.fill(rows, -1);
      }
      int result = solve(n-1, x, num, dp);
      return result >= (int) 1e9 ? -1 : result;
   }

   private int solve(int index, int target, int[] num, int[][] dp) {
      if (index == 0) {
         if (target % num[0] == 0) {
            return target / num[0];
         } else {
            return (int) 1e9;
         }
      }
      if (dp[index][target] != -1) {
         return dp[index][target];
      }
      int notPick = solve(index - 1, target, num, dp);
      int pick = Integer.MAX_VALUE;
      if (target >= num[index]) {
         pick = 1 + solve(index, target - num[index], num, dp);
      }
      return dp[index][target] = Math.min(notPick, pick);
   }
}
