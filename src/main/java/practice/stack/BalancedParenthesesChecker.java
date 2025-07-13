package practice.stack;

import java.util.Stack;

public class BalancedParenthesesChecker {

   public boolean isBalanced(String expression) {
      Stack<Character> stack = new Stack<>();

      for (char ch : expression.toCharArray()) {
         if (ch == '(' || ch == '{' || ch == '[') {
            stack.push(ch);
         } else if (ch == ')' || ch == '}' || ch == ']') {
            if (stack.isEmpty()) {
               return false;
            }
            char top = stack.pop();
            if (!isMatchingPair(top, ch)) {
               return false;
            }
         }
      }
      return stack.isEmpty();
   }

   private static boolean isMatchingPair(char open, char close) {
      return (open == '(' && close == ')')
         || (open == '{' && close == '}')
         || (open == '[' && close == ']');
   }
}
