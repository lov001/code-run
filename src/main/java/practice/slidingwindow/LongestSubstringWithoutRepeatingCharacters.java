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
}
