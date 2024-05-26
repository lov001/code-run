package practice.dynamicprogrammingandrecursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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

   public List<String> generateParenthesesRecursive(int count) {
      char[] str = new char[count * 2];
      List<String> result = new ArrayList<>();
      addParentheses(result, count, count, str, 0);
      return result;
   }

   private void addParentheses(List<String> result, int leftRem, int rightRem, char[] str,
      int index) {
      if (leftRem < 0 || rightRem < leftRem) {
         return;
      } else if (leftRem == 0 && rightRem == 0) {
         result.add(String.copyValueOf(str));
      } else {
         str[index] = '(';
         addParentheses(result, leftRem - 1, rightRem, str, index + 1);

         str[index] = ')';
         addParentheses(result, leftRem, rightRem - 1, str, index + 1);
      }
   }
}
