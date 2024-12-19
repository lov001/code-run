package practice.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class BinarySubArraysWithSum {

   public int numSubArraysWithSumUsingSlidingWindow(int[] nums, int goal) {
      if (goal < 0) {
         return 0;
      }
      int n = nums.length;
      int count = 0;
      int l = 0;
      int r = 0;
      int sum = 0;
      while (r < n) {
         sum += nums[r];
         while (sum > goal) {
            sum -= nums[l];
            l++;
         }
         count += (r - l + 1);
         r++;
      }
      return count;
   }

   public int numSubArraysWithSumUsingPrefixSum(int[] nums, int goal) {
      int n = nums.length;
      int count = 0;
      int r = 0;
      int prefixSum = 0;
      Map<Integer, Integer> map = new HashMap<>();
      map.put(0, 1);
      while (r < n) {
         prefixSum += nums[r];
         int remove = prefixSum - goal;
         count += map.getOrDefault(remove, 0);
         map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
         r++;
      }
      return count;
   }

   public int numSubArraysWithSumBruteForce(int[] nums, int goal) {
      int count = 0;
      int n = nums.length;
      for (int i = 0; i < n; i++) {
         int sum = 0;
         for (int j = i; j < n; j++) {
            sum += nums[j];
            if (sum == goal) {
               count++;
            } else if (sum > goal) {
               break;
            }
         }
      }
      return count;
   }
}
