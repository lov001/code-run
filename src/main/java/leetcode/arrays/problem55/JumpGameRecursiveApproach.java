package leetcode.arrays.problem55;

public class JumpGameRecursiveApproach {


   public boolean canJump(int[] nums) {
      return jump(nums, 0, false, nums[0]);
   }

   private boolean jump(int[] nums, int index, boolean goBackwards, int jumpBy) {
      if (index == nums.length - 1 || jumpBy + nums[index] == nums.length - 1) {
         return true;
      }
      if (nums[index] == 0) {
         return jump(nums, nums[index], true, index - 1);
      }
      if (index + nums[index] >= nums.length) {
         return jump(nums, index, true, jumpBy - 1);
      } else {
         goBackwards = jump(nums, index + jumpBy, false, nums[index + jumpBy]);
      }

      if (goBackwards) {
         return jump(nums, nums[index], true, jumpBy - 1);
      }
      return goBackwards;
   }
}
