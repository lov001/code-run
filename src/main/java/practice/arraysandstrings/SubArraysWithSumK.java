package practice.arraysandstrings;

import java.util.HashMap;
import java.util.Map;

public class SubArraysWithSumK {

   public int numSubArraysWithSum(int[] nums, int k) {
      int count = 0;
      int prefixSum = 0;
      Map<Integer, Integer> map = new HashMap<>();
      map.put(0, 1);
      for (int num : nums) {
         prefixSum += num;
         int remove = prefixSum - k;
         count += map.getOrDefault(remove, 0);
         map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
      }
      return count;
   }

   public int numSubArraysWithSumBruteForce(int[] nums, int k) {
      int count = 0;
      int n = nums.length;
      for (int i = 0; i < n; i++) {
         int sum = 0;
         for (int j = i; j < n; j++) {
            sum += nums[j];
            if (sum == k) {
               count++;
            } else if (sum > k) {
               break;
            }
         }
      }
      return count;
   }
}
