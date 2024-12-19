package practice.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingSubstring {

   public int longestRepeatingSubstringBruteForce(String str, int k) {
      int n = str.length();
      int maxLength = 0;
      for (int i = 0; i < n; i++) {
         Map<Character, Integer> map = new HashMap<>();
         int maxFrequency = 0;
         for (int j = i; j < n; j++) {
            char ch = str.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            maxFrequency = Math.max(maxFrequency, map.get(ch));
            int changes = (j - i + 1) - maxFrequency;
            if (changes <= k) {
               maxLength = Math.max(maxLength, j - i + 1);
            } else {
               break;
            }
         }
      }
      return maxLength;
   }
}
