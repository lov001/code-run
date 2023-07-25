package leetcode.arrays.problem45;

public class JumpGameIIBruteForce {


   public int jumps(int[] nums) {
      return minJumps(nums, 0);
   }

   public int minJumps(int[] nums, int pos) {
      if (pos >= nums.length - 1) {
         return 0;
      }
      int minJumps = 10001;  // initialising to max possible jumps + 1
      for (int j = 1; j <= nums[pos]; j++)  // explore all possible jump sizes from current position
      {
         minJumps = Math.min(minJumps, 1 + minJumps(nums, pos + j));
      }
      return minJumps;
   }
}
