package practice.dynamicprogrammingandrecursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets2 {

   public List<List<Integer>> subsetsWithDup(int[] nums) {
      List<List<Integer>> output = new ArrayList<>();
      Arrays.sort(nums);
      helper(0, nums, new ArrayList<>(), output);
      return output;
   }

   private void helper(int index, int[] nums, List<Integer> subset, List<List<Integer>> output) {
      output.add(new ArrayList<>(subset));
      for (int i = index; i < nums.length; i++) {
         if (i != index && nums[i] == nums[i - 1]) {
            continue;
         }
         subset.add(nums[i]);
         helper(i + 1, nums, subset, output);
         subset.remove(subset.size() - 1);
      }
   }
}
