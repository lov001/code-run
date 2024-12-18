package practice.slidingwindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithAtMostKDistinctCharacters {

   public int kDistinctChars(int k, String str) {
      int maxLength = 0;
      int n = str.length();
      int l = 0;
      int r = 0;
      Map<Character, Integer> map = new HashMap<>();
      while (r < n) {
         Character character = str.charAt(r);
         map.put(character, map.getOrDefault(character, 0) + 1);
         // With while time complexity is O(2N), by replacing while with if, Time Complexity: O(N)
         while (map.size() > k) {
            Character leftMostChar = str.charAt(l);
            map.put(leftMostChar, map.get(leftMostChar) - 1);
            if (map.get(leftMostChar) == 0) {
               map.remove(leftMostChar);
            }
            l++;
         }
         int length = r - l + 1;
         maxLength = Math.max(maxLength, length);
         r++;
      }
      return maxLength;
   }

   public int kDistinctCharsBruteForce(int k, String str) {
      int maxLength = 0;
      int n = str.length();
      for (int i = 0; i < n; i++) {
         int length = 0;
         Set<Character> set = new HashSet<>();
         for (int j = i; j < n; j++) {
            set.add(str.charAt(j));
            if (set.size() > k) {
               break;
            }
            length++;
         }
         maxLength = Math.max(maxLength, length);
      }
      return maxLength;
   }
}
