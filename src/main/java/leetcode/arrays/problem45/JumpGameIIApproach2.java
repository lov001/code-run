package leetcode.arrays.problem45;

public class JumpGameIIApproach2 {


   public int jumps(int[] nums) {
      int result = 0;
      int current = 0, farthest = 0;
      for (int i = 0; i < nums.length - 1; i++) {
         farthest = Math.max(farthest, i + nums[i]);
         if (i == current) {
            current = farthest;
            result++;
         }
      }
      return result;
   }
}
