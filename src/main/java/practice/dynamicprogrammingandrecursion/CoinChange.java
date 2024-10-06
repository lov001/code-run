package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class CoinChange {

   public long countWaysToMakeChange(int[] denominations, int value) {
      int n = denominations.length;
      long[][] dp = new long[n][value + 1];
      for (long[] row : dp) {
         Arrays.fill(row, -1);
      }
      return helper(n - 1, value, denominations, dp);
   }

   private long helper(int index, int value, int[] denominations, long[][] dp) {
      if (index == 0) {
         if (value % denominations[0] == 0) {
            return 1;
         } else {
            return 0;
         }
      }
      if (dp[index][value] != -1) {
         return dp[index][value];
      }
      long notPick = helper(index - 1, value, denominations, dp);
      long pick = 0;
      if (denominations[index] <= value) {
         pick = helper(index, value - denominations[index], denominations, dp);
      }
      return dp[index][value] = notPick + pick;
   }
}
