package practice.dynamicprogrammingandrecursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

   public List<List<Integer>> permuteWithExtraSpace(int[] nums) {
      List<List<Integer>> output = new ArrayList<>();
      int[] marked = new int[nums.length];
      helper(marked, new ArrayList<>(), output, nums);
      return output;
   }

   private void helper(int[] marked, List<Integer> sets, List<List<Integer>> output, int[] nums) {
      if (sets.size() == nums.length) {
         output.add(new ArrayList<>(sets));
         return;
      }
      for (int i = 0; i < marked.length; i++) {
         if (marked[i] == 0) {
            sets.add(nums[i]);
            marked[i] = 1;
            helper(marked, sets, output, nums);
            sets.remove(sets.size() - 1);
            marked[i] = 0;
         }
      }
   }
}
