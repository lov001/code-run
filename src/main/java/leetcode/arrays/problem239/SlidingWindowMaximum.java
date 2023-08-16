package leetcode.arrays.problem239;

import java.util.ArrayList;
import java.util.List;

public class SlidingWindowMaximum {


   public int[] maxSlidingWindow(int[] nums, int k) {
      List<Integer> result = new ArrayList<>();
      for (int i = 0; i <= nums.length - k; i++) {
         int max = Integer.MIN_VALUE;
         for (int j = i; j < i + k; j++) {
            max = Math.max(nums[j], max);
         }
         result.add(max);
      }
      return result.stream().mapToInt(Integer::intValue).toArray();
   }

}
