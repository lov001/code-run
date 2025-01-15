package practice.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSumProblem {

   public List<List<Integer>> fourSumBruteForce(int[] nums, int target) {
      Set<List<Integer>> result = new HashSet<>();
      int n = nums.length;
      for (int i = 0; i < n; i++) {
         for (int j = i + 1; j < n; j++) {
            for (int k = j + 1; k < n; k++) {
               for (int l = k + 1; l < n; l++) {
                  long sum = nums[i] + nums[j] + nums[k] + nums[l];
                  if (sum == target) {
                     List<Integer> temp = new ArrayList<>();
                     temp.add(nums[i]);
                     temp.add(nums[j]);
                     temp.add(nums[k]);
                     temp.add(nums[l]);
                     Collections.sort(temp);
                     result.add(temp);
                  }
               }
            }
         }
      }
      return new ArrayList<>(result);
   }
}
