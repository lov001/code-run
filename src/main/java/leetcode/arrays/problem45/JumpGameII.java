package leetcode.arrays.problem45;

public class JumpGameII {


   public int canJump(int[] nums) {
      int result = 0;
      int left = 0, right = 0;
      while (right < nums.length - 1) {
         int farthest = 0;
         for (int i = left; i < right + 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
         }
         left = right + 1;
         right = farthest;
         result++;
         if (farthest >= nums.length - 1) {
            return result;
         }
      }
      return result;
   }
}
