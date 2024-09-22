package practice.dynamicprogrammingandrecursion;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumSumOfNonAdjacentElements {

   public int maximumNonAdjacentSum(ArrayList<Integer> nums) {
      int[] dp = new int[nums.size() + 1];
      Arrays.fill(dp, -1);
      return recursion(nums.size() - 1, nums, dp);
   }

   private int recursion(int index, ArrayList<Integer> nums, int[] dp) {
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
         nums.get(index) + recursion(index - 2, nums, dp);
      int elementNotPickedSum = recursion(index - 1, nums, dp);
      dp[index] = Math.max(elementPickedSum, elementNotPickedSum);
      return dp[index];
   }

   public int maximumNonAdjacentSumTabulation(ArrayList<Integer> nums) {
      int[] dp = new int[nums.size()];
      dp[0] = nums.get(0);
      int pickElement, notPickElement;
      for (int i = 1; i < nums.size(); i++) {

         pickElement = nums.get(i);
         if (i > 1) {
            pickElement += dp[i - 2];
         }
         notPickElement = dp[i - 1];
         dp[i] = Math.max(pickElement, notPickElement);
      }
      return dp[nums.size() - 1];
   }

   public int maximumNonAdjacentSumTabulationSpaceOptimised(ArrayList<Integer> nums) {
      int previous2 = 0, current;
      int previous = nums.get(0);
      int pickElement, notPickElement;
      for (int i = 1; i < nums.size(); i++) {

         pickElement = nums.get(i);
         if (i > 1) {
            pickElement += previous2;
         }
         notPickElement = previous;
         current = Math.max(pickElement, notPickElement);
         previous2 = previous;
         previous = current;
      }
      return previous;
   }
}
