package practice.dynamicprogrammingandrecursion;

public class CountSubsetsWithSumK {

   public int findWays(int[] nums, int target) {
      int n = nums.length - 1;
      return helper(n, target, nums);
   }

   private int helper(int index, int target, int[] nums) {
      if (index == 0) {
         if (target == 0) {
            return 1;
         }
         return target == nums[0] ? 1 : 0;
      }
      int notPick = helper(index - 1, target, nums);
      int pick = 0;
      if (nums[index] <= target) {
         pick = helper(index - 1, target - nums[index], nums);
      }
      return notPick + pick;
   }
}
