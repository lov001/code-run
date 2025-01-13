package practice.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {

   public List<Integer> majorityElement(int[] v) {
      int count1 = 0, element1 = Integer.MIN_VALUE;
      int count2 = 0, element2 = Integer.MIN_VALUE;
      for (int element : v) {
         if (count1 == 0 && element2 != element) {
            element1 = element;
            count1 = 1;
         } else if (count2 == 0 && element1 != element) {
            element2 = element;
            count2 = 1;
         } else if (element1 == element) {
            count1++;
         } else if (element2 == element) {
            count2++;
         } else {
            count1--;
            count2--;
         }
      }

      count1 = 0;
      count2 = 0;
      for (int element : v) {
         if (element == element1) {
            count1++;
         } else if (element == element2) {
            count2++;
         }
      }
      int lowerBound = (v.length / 3) + 1;
      List<Integer> result = new ArrayList<>();
      if (count1 >= lowerBound) {
         result.add(element1);
      }
      if (count2 >= lowerBound) {
         result.add(element2);
         Collections.sort(result);
      }
      return result;
   }

   public List<Integer> majorityElementBruteForce(int[] v) {
      List<Integer> result = new ArrayList<>();
      if (v.length == 1) {
         result.add(v[0]);
         return result;
      }
      Map<Integer, Integer> map = new HashMap<>();
      int lowerBound = (v.length / 3) + 1;
      for (int number : v) {
         map.put(number, map.getOrDefault(number, 0) + 1);
         Integer numCount = map.get(number);
         if (numCount == lowerBound) {
            result.add(number);
         }
         if (result.size() == 2) {
            break;
         }
      }
      Collections.sort(result);
      return result;
   }
}
