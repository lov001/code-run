package practice.dynamicprogrammingandrecursion;

import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParenthesesCombinationTest {

   ParenthesesCombination classObj = new ParenthesesCombination();

   @Test
   void test_generateParentheses_expect_whenNIs1() {
      Set<String> output = Set.of("()");
      Assertions.assertEquals(output, classObj.generateParentheses(1));
      Assertions.assertEquals(output.stream().toList(), classObj.generateParenthesesRecursive(1));
   }

   @Test
   void test_generateParentheses_expect_whenNIs2() {
      Set<String> output = Set.of("()()", "(())");
      List<String> output2 = List.of("(())", "()()");
      Assertions.assertEquals(output, classObj.generateParentheses(2));
      Assertions.assertEquals(output2.stream().toList(), classObj.generateParenthesesRecursive(2));
   }

   @Test
   void test_generateParentheses_expect_whenNIs3() {
      Set<String> output = Set.of("()()()", "((()))", "(()())", "()(())", "(())()");
      List<String> output2 = List.of("((()))", "(()())", "(())()", "()(())", "()()()");
      Assertions.assertEquals(output, classObj.generateParentheses(3));
      Assertions.assertEquals(output2.stream().toList(), classObj.generateParenthesesRecursive(3));
   }
}
