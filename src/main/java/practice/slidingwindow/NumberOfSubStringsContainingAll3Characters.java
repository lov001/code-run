package practice.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class NumberOfSubStringsContainingAll3Characters {

   public int numberOfSubstringsBruteForce(String s) {
      int numberOfSubstrings = 0;
      int n = s.length();
      for (int i = 0; i < n; i++) {
         Set<Character> set = new HashSet<>();
         for (int j = i; j < n; j++) {
            Character ch = s.charAt(j);
            set.add(ch);
            if (set.size() == 3) {
               numberOfSubstrings++;
            }
         }
      }
      return numberOfSubstrings;
   }
}
