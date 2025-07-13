package practice.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BalancedParenthesesCheckerTest {

   BalancedParenthesesChecker classObj = new BalancedParenthesesChecker();

   @Test
   void test_isBalanced_expectTrue_whenParenthesesAreBalanced() {
      String expression = "{[()]}";
      Assertions.assertTrue(classObj.isBalanced(expression));
   }

   @Test
   void test_isBalanced_expectTrue_whenParenthesesAreBalanced1() {
      String expression = "((()))[]{}";
      Assertions.assertTrue(classObj.isBalanced(expression));
   }

   @Test
   void test_isBalanced_expectFalse_whenParenthesesAreBalanced() {
      String expression = "{[(])}";
      Assertions.assertFalse(classObj.isBalanced(expression));
   }

   @Test
   void test_isBalanced_expectFalse_whenParenthesesAreBalanced1() {
      String expression = "([)]";
      Assertions.assertFalse(classObj.isBalanced(expression));
   }
}
