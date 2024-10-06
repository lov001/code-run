package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class CoinChange {

   public long countWaysToMakeChangeTabulation(int[] denominations, int value) {
      int n = denominations.length;
      long[][] dp = new long[n][value + 1];
      for (int T = 0; T <= value; T++) {
         dp[0][T] = T % denominations[0] == 0 ? 1 : 0;
      }
      for (int index = 1; index < n; index++) {
         for (int target = 0; target <= value; target++) {
            long notPick = dp[index - 1][target];
            long pick = 0;
            if (denominations[index] <= target) {
               pick = dp[index][target - denominations[index]];
            }
            dp[index][target] = notPick + pick;
         }
      }
      return dp[n - 1][value];
   }

   public long countWaysToMakeChangeSpaceOptimisation(int[] denominations, int value) {
      int n = denominations.length;
      long[] previous = new long[value + 1];
      for (int T = 0; T <= value; T++) {
         previous[T] = T % denominations[0] == 0 ? 1 : 0;
      }
      for (int index = 1; index < n; index++) {
         long[] current = new long[value + 1];
         for (int target = 0; target <= value; target++) {
            long notPick = previous[target];
            long pick = 0;
            if (denominations[index] <= target) {
               pick = current[target - denominations[index]];
            }
            current[target] = notPick + pick;
         }
         previous = current;
      }
      return previous[value];
   }

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
