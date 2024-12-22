package practice.greedy;

import java.util.Arrays;

public class JumpGame2 {


   public int jump(int[] nums) {
      int l = 0;
      int r = 0;
      int n = nums.length;
      int minJumps = 0;
      while (r < n - 1) {
         int farthest = 0;
         for (int index = l; index <= r; index++) {
            farthest = Math.max(farthest, index + nums[index]);
         }
         l = r + 1;
         r = farthest;
         minJumps++;
         if (farthest >= nums.length - 1) {
            return minJumps;
         }
      }
      return minJumps;
   }

   public int jumpRecursionOptimised(int[] nums) {
      int[][] dp = new int[nums.length][nums.length];
      for (int[] rows : dp) {
         Arrays.fill(rows, -1);
      }
      return helper(0, 0, nums, dp);
   }

   private int helper(int index, int jumpCount, int[] nums, int[][] dp) {
      if (index >= nums.length - 1) {
         return jumpCount;
      }
      if (dp[index][jumpCount] != -1) {
         return dp[index][jumpCount];
      }
      int minJumps = Integer.MAX_VALUE;
      for (int i = 1; i <= nums[index]; i++) {
         minJumps = Math.min(minJumps, helper(index + i, jumpCount + 1, nums, dp));
      }
      return dp[index][jumpCount] = minJumps;
   }

   public int jumpBruteForceWithRecursion(int[] nums) {
      return helper(0, 0, nums);
   }

   private int helper(int index, int jumpCount, int[] nums) {
      if (index >= nums.length - 1) {
         return jumpCount;
      }
      int minJumps = Integer.MAX_VALUE;
      for (int i = 1; i <= nums[index]; i++) {
         minJumps = Math.min(minJumps, helper(index + i, jumpCount + 1, nums));
      }
      return minJumps;
   }
}
