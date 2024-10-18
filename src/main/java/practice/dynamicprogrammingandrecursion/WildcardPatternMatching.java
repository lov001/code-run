package practice.dynamicprogrammingandrecursion;

public class WildcardPatternMatching {

   public boolean wildcardMatching(String pattern, String text) {
      int n = pattern.length();
      int m = text.length();
      return helper(n - 1, m - 1, pattern, text);
   }

   private boolean helper(int index1, int index2, String pattern, String text) {
      if (index1 < 0 && index2 < 0) {
         return true;
      }
      if (index1 < 0 && index2 >= 0) {
         return false;
      }
      if (index2 < 0) {
         while (index1 >= 0) {
            if (pattern.charAt(index1) != '*') {
               return false;
            }
            index1--;
         }
         return true;
      }
      if (pattern.charAt(index1) == text.charAt(index2) || pattern.charAt(index1) == '?') {
         return helper(index1 - 1, index2 - 1, pattern, text);
      }
      if (pattern.charAt(index1) == '*') {
         return helper(index1 - 1, index2, pattern, text) ||
            helper(index1, index2 - 1, pattern, text);
      }

      return false;
   }

}
