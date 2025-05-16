package practice.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

   public int lengthOfLongestSubstring(String s) {
      int n = s.length();
      int l = 0;
      int r = 0;
      int maxLength = 0;
      Map<Character, Integer> map = new HashMap<>();
      while (r < n) {
         char ch = s.charAt(r);
         if (map.containsKey(ch) && map.get(ch) >= l) {
            l = map.get(ch) + 1;
         }
         map.put(ch, r);
         int len = r - l + 1;
         maxLength = Math.max(maxLength, len);
         r++;
      }
      return maxLength;
   }

   public int lengthOfLongestSubstringBruteForce(String s) {
      int n = s.length();
      if (n == 0 || n == 1) {
         return n;
      }
      int maxLength = Integer.MIN_VALUE;

      for (int i = 0; i < n; i++) {
         int currentLength = 0;
         int[] charMap = new int[256];
         for (int j = i; j < n; j++) {
            int character = s.charAt(j);
            if (charMap[character] > 0) {
               charMap[character]--;
               break;
            } else {
               charMap[character]++;
               currentLength++;
            }
         }
         maxLength = Math.max(maxLength, currentLength);
      }
      return maxLength;
   }
}
