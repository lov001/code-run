package practice.slidingwindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class NumberOfSubStringsContainingAll3Characters {

   public int numberOfSubstrings(String s) {
      int numberOfSubstrings = 0;
      int n = s.length();
      int r = 0;
      Map<Character, Integer> map = new HashMap<>();
      map.put('a', -1);
      map.put('b', -1);
      map.put('c', -1);
      while (r < n) {
         Character ch = s.charAt(r);
         map.put(ch, r);
         int leftMostIndex = leastIndex(map);
         if (leftMostIndex != -1) {
            numberOfSubstrings += leftMostIndex + 1;
         }
         r++;
      }
      return numberOfSubstrings;
   }

   private int leastIndex(Map<Character, Integer> map) {
      int min = Integer.MAX_VALUE;
      for (Entry<Character, Integer> entry : map.entrySet()) {
         min = Math.min(min, entry.getValue());
      }
      return min;
   }

   public int numberOfSubstringsBruteForce(String s) {
      int numberOfSubstrings = 0;
      int n = s.length();
      for (int i = 0; i < n; i++) {
         Set<Character> set = new HashSet<>();
         for (int j = i; j < n; j++) {
            Character ch = s.charAt(j);
            set.add(ch);
            if (set.size() == 3) {
               numberOfSubstrings += n - j;
               break;
            }
         }
      }
      return numberOfSubstrings;
   }
}
