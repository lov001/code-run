package practice.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NumberWithOneOccurrence {

   public int getSingleElementBruteForce(int[] arr) {
      Map<Integer, Integer> map = new HashMap<>();

      for (int j : arr) {
         map.put(j, map.getOrDefault(j, 0) + 1);
      }
      for (Entry<Integer, Integer> entry : map.entrySet()) {
         if (entry.getValue() == 1) {
            return entry.getKey();
         }
      }
      return -1;
   }

   public int getSingleElementOptimised(int[] arr) {
      int xor = 0;
      for (int number : arr) {
         xor = xor ^ number;
      }
      return xor;
   }
}
