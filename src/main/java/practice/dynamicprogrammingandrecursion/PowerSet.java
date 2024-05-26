package practice.dynamicprogrammingandrecursion;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {

   public List<List<Integer>> getSubset(List<Integer> set, int index) {
      List<List<Integer>> allSubsets;
      if (set.size() == index) {
         allSubsets = new ArrayList<>();
         allSubsets.add(new ArrayList<>());
      } else {
         allSubsets = getSubset(set, index + 1);
         int item = set.get(index);
         List<List<Integer>> moreSubsets = new ArrayList<>();
         for (List<Integer> subset : allSubsets) {
            List<Integer> newSubset = new ArrayList<>(subset);
            newSubset.add(item);
            moreSubsets.add(newSubset);
         }
         allSubsets.addAll(moreSubsets);
      }
      return allSubsets;
   }
}
