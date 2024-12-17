package practice.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithAtMostKDistinctCharacters {

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
