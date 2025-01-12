package practice.arrays;

import java.util.HashMap;
import java.util.Map;

public class CountSubArraysWithSumK {

   public int findAllSubArraysWithGivenSum(int[] arr, int s) {
      int count = 0;
      int prefixSum = 0;
      Map<Integer, Integer> map = new HashMap<>();
      map.put(0, 1);
      for (int number : arr) {
         prefixSum += number;
         int remaining = prefixSum - s;
         count += map.getOrDefault(remaining, 0);
         map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
      }
      return count;
   }
}
