package practice.dynamicprogrammingandrecursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PermutationWithDuplicates {

   public List<String> getPermutations(String string) {
      List<String> result = new ArrayList<>();
      Map<Character, Integer> freqMap = freqMap(string);
      permutations(freqMap, "", string.length(), result);
      return result;
   }

   private void permutations(Map<Character, Integer> freqMap, String prefix, int remaining,
      List<String> result) {
      if (remaining == 0) {
         result.add(prefix);
         return;
      }
      for (Character ch : freqMap.keySet()) {
         int count = freqMap.get(ch);
         if (count > 0) {
            freqMap.put(ch, count - 1);
            permutations(freqMap, prefix + ch, remaining - 1, result);
            freqMap.put(ch, count);
         }
      }
   }

   private Map<Character, Integer> freqMap(String str) {
      Map<Character, Integer> map = new HashMap<>();
      for (char ch : str.toCharArray()) {
         map.put(ch, map.getOrDefault(ch, 1) + 1);
      }
      return map;
   }
}
