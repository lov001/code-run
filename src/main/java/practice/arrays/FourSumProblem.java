package practice.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSumProblem {


   public List<List<Integer>> fourSumTwoPointer(int[] nums, int target) {
      Set<List<Integer>> result = new HashSet<>();
      int n = nums.length;
      Arrays.sort(nums);
      for (int i = 0; i < n; i++) {
         if (i > 0 && nums[i] == nums[i - 1]) {
            continue;
         }
         for (int j = i + 1; j < n; j++) {
            if (j != (i + 1) && nums[j] == nums[j - 1]) {
               continue;
            }
            int start = j + 1;
            int end = n - 1;
            while (start < end) {
               int sum = nums[i] + nums[j] + nums[start] + nums[end];
               if (sum == target) {
                  result.add(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));
                  start++;
                  end--;
                  while (start < end && nums[start] == nums[start - 1]) {
                     start++;
                  }
                  while (start < end && nums[end] == nums[end + 1]) {
                     end--;
                  }
               } else if (sum < target) {
                  start++;
               } else {
                  end--;
               }
            }
         }
      }
      return new ArrayList<>(result);
   }

   public List<List<Integer>> fourSumHashing(int[] nums, int target) {
      Set<List<Integer>> result = new HashSet<>();
      int n = nums.length;
      for (int i = 0; i < n; i++) {
         for (int j = i + 1; j < n; j++) {
            Set<Integer> map = new HashSet<>();
            for (int k = j + 1; k < n; k++) {
               int fourth = target - (nums[i] + nums[j] + nums[k]);
               if (map.contains(fourth)) {
                  List<Integer> temp = new ArrayList<>();
                  temp.add(nums[i]);
                  temp.add(nums[j]);
                  temp.add(nums[k]);
                  temp.add(fourth);
                  Collections.sort(temp);
                  result.add(temp);
               }
               map.add(nums[k]);
            }
         }
      }
      return new ArrayList<>(result);
   }

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
