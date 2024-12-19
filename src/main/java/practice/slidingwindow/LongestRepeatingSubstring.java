package practice.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingSubstring {

   public int longestRepeatingSubstring(String str, int k) {
      int n = str.length();
      int maxLength = 0;
      int l = 0;
      int r = 0;
      Map<Character, Integer> map = new HashMap<>();
      int maxFrequency = 0;
      while (r < n) {
         char ch = str.charAt(r);
         map.put(ch, map.getOrDefault(ch, 0) + 1);
         maxFrequency = Math.max(maxFrequency, map.get(ch));
         while (((r - l + 1) - maxFrequency) > k) {
            char leftChar = str.charAt(l);
            map.put(leftChar, map.get(leftChar) - 1);
            maxFrequency = Math.max(maxFrequency, map.get(leftChar));
            l++;
         }
         maxLength = Math.max(maxLength, r - l + 1);
         r++;
      }
      return maxLength;
   }

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
