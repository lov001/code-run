package leetcode.strings.problem20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidParenthesesTest {

    ValidParentheses classObj = new ValidParentheses();
    ValidParenthesesWithStringBuilder classObj2 = new ValidParenthesesWithStringBuilder();

    @Test
    void test_isValid_expectTrue_whenStringIsValidParenthesesOfLength2() {
        String input = "()";
        Assertions.assertTrue(classObj.isValid(input));
        Assertions.assertTrue(classObj2.isValid(input));
    }

    @Test
    void test_isValid_expectTrue_whenStringIsValidParentheses() {
        String input = "()[]{}";
        Assertions.assertTrue(classObj.isValid(input));
        Assertions.assertTrue(classObj2.isValid(input));
    }

    @Test
    void test_isValid_expectFalse_whenStringIsNotValidParentheses() {
        String input = "(]";
        Assertions.assertFalse(classObj.isValid(input));
        Assertions.assertFalse(classObj2.isValid(input));
    }
}
