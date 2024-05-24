package practice.dynamicprogrammingandrecursion;

import java.util.HashSet;
import java.util.Set;

public class ParenthesesCombination {

   public Set<String> generateParentheses(int remaining) {
      Set<String> result = new HashSet<>();
      if (remaining == 0) {
         result.add("");

      } else {
         Set<String> prev = generateParentheses(remaining - 1);
         for (String str : prev) {
            for (int i = 0; i < str.length(); i++) {
               if (str.charAt(i) == '(') {
                  String s = insertInside(str, i);
                  result.add(s);
               }
            }
            result.add("()" + str);
         }
      }
      return result;
   }

   private String insertInside(String str, int leftIndex) {
      String left = str.substring(0, leftIndex + 1);
      String right = str.substring(leftIndex + 1);
      return left + "()" + right;
   }
}
