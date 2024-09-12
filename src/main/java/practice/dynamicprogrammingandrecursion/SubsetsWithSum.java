package practice.dynamicprogrammingandrecursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetsWithSum {

   public List<List<Integer>> subsetsWithSum(int[] nums, int sum) {
      List<List<Integer>> subsets = new ArrayList<>();
      List<Integer> set = new ArrayList<>();
      helper(0, nums, set, subsets, 0, sum);
      return subsets;
   }

   private void helper(int index, int[] nums, List<Integer> set, List<List<Integer>> subsets,
      int currentSum, int sum) {
      if (index >= nums.length) {
         if (currentSum == sum) {
            List<Integer> temp = new ArrayList<>(set);
            subsets.add(temp);
         }
         return;
      }
      set.add(nums[index]);
      currentSum += nums[index];
      helper(index + 1, nums, set, subsets, currentSum, sum);
      set.remove(set.size() - 1);
      currentSum -= nums[index];
      helper(index + 1, nums, set, subsets, currentSum, sum);
   }
}
