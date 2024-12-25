package practice.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidParenthesisStringTest {

   ValidParenthesisString classObj = new ValidParenthesisString();

   @Test
   void test_checkValidString_expectTrue_whenStringOfLength4() {
      String input = "*())";
      Assertions.assertTrue(classObj.checkValidStringUsingRecursion(input));
      Assertions.assertTrue(classObj.checkValidString(input));
   }

   @Test
   void test_checkValidString_expectTrue_whenStringOfLength3() {
      String input = "(*)";
      Assertions.assertTrue(classObj.checkValidStringUsingRecursion(input));
      Assertions.assertTrue(classObj.checkValidString(input));
   }

   @Test
   void test_checkValidString_expectFalse_whenStringOfLength4() {
      String input = "())*";
      Assertions.assertFalse(classObj.checkValidStringUsingRecursion(input));
      Assertions.assertFalse(classObj.checkValidString(input));
   }
}
