package practice.arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

   public int majorityElement(int[] v) {
      Map<Integer, Integer> map = new HashMap<>();
      for (int element : v) {
         map.put(element, map.getOrDefault(element, 0) + 1);
         if (map.get(element) > (v.length / 2)) {
            return element;
         }
      }
      return -1;
   }
}
