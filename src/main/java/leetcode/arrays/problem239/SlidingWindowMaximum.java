package leetcode.arrays.problem239;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {


   public int[] maxSlidingWindow(int[] nums, int k) {
      int n = nums.length;
      if (n == 0 || k == 0) {
         return new int[0];
      }
      int[] result = new int[n - k + 1];
      Deque<Integer> window = new ArrayDeque<>();

      for (int i = 0; i < n; i++) {
         while (window.size() > 0 && window.peekFirst() <= i - k) {
            window.pollFirst();
         }
         // remove indices whose corresponding values are less than nums[i]
         while (window.size() > 0 && nums[window.peekLast()] < nums[i]) {
            window.pollLast();
         }
         // add nums[i]
         window.offerLast(i);
         // add to result
         if (i >= k - 1) {
            result[i - k + 1] = nums[window.peekFirst()];
         }
      }
      return result;
   }
}