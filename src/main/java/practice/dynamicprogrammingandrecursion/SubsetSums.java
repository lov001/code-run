package practice.dynamicprogrammingandrecursion;

import java.util.ArrayList;

public class SubsetSums {

   ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {
      ArrayList<Integer> output = new ArrayList<>();
      helper(0, 0, output, arr);
      return output;
   }

   private void helper(int index, int sum, ArrayList<Integer> output, ArrayList<Integer> arr) {
      if (index == arr.size()) {
         output.add(sum);
         return;
      }
      helper(index + 1, sum + arr.get(index), output, arr);
      helper(index + 1, sum, output, arr);
   }
}
