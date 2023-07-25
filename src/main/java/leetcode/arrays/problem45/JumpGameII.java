package leetcode.arrays.problem45;

public class JumpGameII {


   public int canJump(int[] nums) {
      int reachable = 0;
      for (int i = 0; i < nums.length; i++) {
         if (i > reachable) {
            return reachable;
         }
         reachable = Math.max(reachable, i + nums[i]);
      }
      return reachable;
   }
}
