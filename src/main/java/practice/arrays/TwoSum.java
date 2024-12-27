package practice.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

   public int[] twoSum(int[] arr, int n, int target) {
      int[] output = {-1, -1};
      Map<Integer, Integer> map = new HashMap<>();
      int smallestFirstIndex = Integer.MAX_VALUE;
      int smallestSecondIndex = Integer.MAX_VALUE;
      for (int i = 0; i < n; i++) {
         int difference = target - arr[i];
         if (map.containsKey(difference)) {
            int firstIndex = map.get(difference);
            int secondIndex = i;
            if (firstIndex < smallestFirstIndex ||
               (firstIndex == smallestFirstIndex && secondIndex < smallestSecondIndex)) {
               output[0] = firstIndex;
               output[1] = secondIndex;
               smallestFirstIndex = firstIndex;
               smallestSecondIndex = secondIndex;
            }
         }
         map.putIfAbsent(arr[i], i);
      }
      return output;
   }
}
