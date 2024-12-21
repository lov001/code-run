package practice.greedy;

public class JumpGame {

   public boolean canJump(int[] nums) {
      int maxIndex = 0;
      int n = nums.length;
      for (int i = 0; i < n; i++) {
         if (maxIndex < i) {
            return false;
         }
         maxIndex = Math.max(maxIndex, i + nums[i]);
      }
      return true;
   }
}
