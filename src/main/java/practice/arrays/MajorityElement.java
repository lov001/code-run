package practice.arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

   public int majorityElementMooreAlgorithm(int[] v) {
      int element = 0;
      int count = 0;
      for (int j : v) {
         if (count == 0) {
            element = j;
            count++;
            continue;
         }
         if (j == element) {
            count++;
         } else {
            count--;
         }
      }
      int verifyCount = 0;
      for (int j : v) {
         if (j == element) {
            verifyCount++;
         }
      }
      if (verifyCount > (v.length / 2)) {
         return element;
      }
      return -1;
   }

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
