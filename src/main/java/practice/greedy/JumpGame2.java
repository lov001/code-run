package practice.greedy;

public class JumpGame2 {

   public int jumpBruteForceWithRecursion(int[] nums) {
      return helper(0, 0, nums);
   }

   private int helper(int index, int jumpCount, int[] nums) {
      if (index >= nums.length - 1) {
         return jumpCount ;
      }
      int minJumps = Integer.MAX_VALUE;
      for (int i = 1; i <= nums[index]; i++) {
         minJumps = Math.min(minJumps, helper(index + i, jumpCount + 1, nums));
      }
      return minJumps;
   }
}
