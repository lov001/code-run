package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class HouseRobberII {

   public long houseRobber(int[] valueInHouse) {
      int n = valueInHouse.length;
      if (n == 1) {
         return valueInHouse[0];
      }
      int[] dp1 = new int[n - 1];
      int[] dp2 = new int[n - 1];
      Arrays.fill(dp1, -1);
      Arrays.fill(dp2, -1);
      int maxLootIncludingStart = helper(n - 2, Arrays.copyOfRange(valueInHouse, 0, n - 1), dp1);
      int maxLootExcludingStart = helper(n - 2, Arrays.copyOfRange(valueInHouse, 1, n), dp2);

      return Math.max(maxLootIncludingStart, maxLootExcludingStart);
   }

   private int helper(int index, int[] valueInHouse, int[] dp) {
      if (index == 0) {
         return valueInHouse[index];
      }
      if (index < 0) {
         return 0;
      }
      if (dp[index] != -1) {
         return dp[index];
      }
      int pickElement = valueInHouse[index];
      if (index > 1) {
         pickElement += helper(index - 2, valueInHouse, dp);
      }
      int notPickElement = helper(index - 1, valueInHouse, dp);
      dp[index] = Math.max(pickElement, notPickElement);
      return dp[index];
   }
}
