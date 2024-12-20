package practice.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

   public String minSubStringBruteForce(String a, String b) {
      int n = a.length();
      int m = b.length();

      if (n == 0 || m == 0 || n < m) {
         return "";
      }

      Map<Character, Integer> originalMap = new HashMap<>();
      for (Character ch : b.toCharArray()) {
         originalMap.put(ch, originalMap.getOrDefault(ch, 0) + 1);
      }

      int minLength = Integer.MAX_VALUE;
      int startIndex = -1;

      for (int i = 0; i < n; i++) {
         Map<Character, Integer> map = new HashMap<>(originalMap);
         int count = 0;

         for (int j = i; j < n; j++) {
            char ch = a.charAt(j);
            int charCount = map.getOrDefault(ch, 0);

            if (charCount > 0) {
               count++;
            }
            map.put(ch, charCount - 1);

            if (count == m) {
               if ((j - i + 1) < minLength) {
                  minLength = j - i + 1;
                  startIndex = i;
               }
               break;
            }
         }
      }

      return (startIndex == -1) ? "" : a.substring(startIndex, startIndex + minLength);
   }
}
