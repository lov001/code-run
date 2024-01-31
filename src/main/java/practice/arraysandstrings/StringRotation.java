package practice.arraysandstrings;

import java.util.Arrays;

public class StringRotation {


   public boolean isSubstring(String s1, String s2) {
      int len = s1.length();
      if (len == s2.length() && len > 0) {
         String combined = s1 + s1;
         return combined.contains(s2);
      }
      return false;
   }

   public boolean isSubstringBruteForce(String s1, String s2) {
      char[] chars = s1.toCharArray();
      for (int i = 0; i < s1.length(); i++) {
         if (Arrays.equals(s2.toCharArray(), chars)) {
            return true;
         }
         char temp = chars[0];
         for (int j = 1; j < s1.length(); j++) {
            chars[j - 1] = chars[j];
         }
         chars[chars.length - 1] = temp;
      }
      return false;
   }
}
