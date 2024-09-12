package practice.dynamicprogrammingandrecursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

   public List<List<Integer>> subsets(int[] nums) {
      List<List<Integer>> subsets = new ArrayList<>();
      helper(0, nums, subsets, new ArrayList<>());
      return subsets;
   }

   private void helper(int index, int[] nums, List<List<Integer>> subset, List<Integer> set) {
      if (index >= nums.length) {
         List<Integer> temp = new ArrayList<>(set);
         subset.add(temp);
         return;
      }
      set.add(nums[index]);
      helper(index + 1, nums, subset, set);
      set.remove(set.size() - 1);
      helper(index + 1, nums, subset, set);
   }
}
