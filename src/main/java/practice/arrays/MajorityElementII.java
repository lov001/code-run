package practice.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {

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
