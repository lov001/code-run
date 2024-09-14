package practice.dynamicprogrammingandrecursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumWithoutDuplicates {

   public List<List<Integer>> combinationSum2(int[] candidates, int target) {
      List<List<Integer>> output = new ArrayList<>();
      Arrays.sort(candidates);
      helper(0, target, candidates, new ArrayList<>(), output);
      return output;
   }

   private void helper(int index, int target, int[] candidates, List<Integer> list,
      List<List<Integer>> output) {
      if (target == 0) {
         List<Integer> temp = new ArrayList<>(list);
         output.add(temp);
         return;
      }
      for (int i = index; i < candidates.length; i++) {
         if (i > index && candidates[i] == candidates[i - 1]) {
            continue;
         }
         if (candidates[i] > target) {
            break;
         }
         list.add(candidates[i]);
         helper(i + 1, target - candidates[i], candidates, list, output);
         list.remove(list.size() - 1);
      }
   }
}
