package practice.dynamicprogrammingandrecursion;

import java.util.Set;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParenthesesCombinationTest {

   ParenthesesCombination classObj = new ParenthesesCombination();

   @Test
   void test_generateParentheses_expect_whenNIs1() {
      Set<String> output = Set.of("()");
      Assertions.assertEquals(output, classObj.generateParentheses(1));
   }

   @Test
   void test_generateParentheses_expect_whenNIs2() {
      Set<String> output = Set.of("()()", "(())");
      Assertions.assertEquals(output, classObj.generateParentheses(2));
   }

   @Test
   void test_generateParentheses_expect_whenNIs3() {
      Set<String> output = Set.of("()()()", "((()))", "(()())", "()(())", "(())()");
      Assertions.assertEquals(output, classObj.generateParentheses(3));
   }
}
