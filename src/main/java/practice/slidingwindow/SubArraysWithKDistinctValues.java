package practice.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class SubArraysWithKDistinctValues {

   public int kDistinctSubArrays(int[] arr, int n, int k) {
      if (k < 0) {
         return 0;
      }
      int count = 0;
      int l = 0;
      int r = 0;
      Map<Integer, Integer> map = new HashMap<>();
      while (r < n) {
         map.put(arr[r], map.getOrDefault(arr[r], 0) + 1);
         while (map.size() > k) {
            map.put(arr[l], map.get(arr[l]) - 1);
            if (map.get(arr[l]) == 0) {
               map.remove(arr[l]);
            }
            l++;
         }
         count += (r - l + 1);
         r++;
      }
      return count;
   }
}
