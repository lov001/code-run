package leetcode.arrays.problem55;

public class JumpGameBackTracking {


   public boolean canJump(int[] nums) {
      int maxReachable = nums.length - 1;
      for (int i = nums.length - 1  ; i >= 0   ; i--) {
         if (nums[i] + i >= maxReachable) {
            maxReachable = i;
         }
      }
      return maxReachable == 0;
   }
}
