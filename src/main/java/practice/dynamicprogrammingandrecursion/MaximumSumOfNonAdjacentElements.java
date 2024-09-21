package practice.dynamicprogrammingandrecursion;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumSumOfNonAdjacentElements {

   public int maximumNonAdjacentSum(ArrayList<Integer> nums) {
      int[] dp = new int[nums.size() + 1];
      Arrays.fill(dp, -1);
      return recursion(0, nums.size() - 1, nums, dp);
   }

   private int recursion(int sum, int index, ArrayList<Integer> nums, int[] dp) {
      if (index == 0) {
         return nums.get(index);
      }
      if (index < 0) {
         return 0;
      }
      if (dp[index] != -1) {
         return dp[index];
      }

      int elementPickedSum =
         nums.get(index) + recursion(sum + nums.get(index), index - 2, nums, dp);
      int elementNotPickedSum = recursion(sum, index - 1, nums, dp);
      dp[index] = Math.max(elementPickedSum, elementNotPickedSum);
      return dp[index];
   }
}
