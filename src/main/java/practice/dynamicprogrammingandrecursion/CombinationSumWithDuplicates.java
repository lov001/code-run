package practice.dynamicprogrammingandrecursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumWithDuplicates {

   public List<List<Integer>> combinationSum(int[] candidates, int target) {
      List<List<Integer>> output = new ArrayList<>();
      helper(0, target, new ArrayList<>(), candidates, output);
      return output;
   }

   private void helper(int index, int target, List<Integer> list, int[] candidates,
      List<List<Integer>> output) {
      if (index == candidates.length) {
         if (target == 0) {
            List<Integer> temp = new ArrayList<>(list);
            output.add(temp);
         }
         return;
      }
      if (candidates[index] <= target) {
         // Pick current index element
         list.add(candidates[index]);
         helper(index, target - candidates[index], list, candidates, output);
         list.remove(list.size() - 1);
      }
      // Don't pick current index element
      helper(index + 1, target, list, candidates, output);
   }
}
