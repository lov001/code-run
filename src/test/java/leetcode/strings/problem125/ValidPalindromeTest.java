package leetcode.strings.problem125;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidPalindromeTest {

    ValidPalindrome classObj = new ValidPalindrome();

    @Test
    void test_isPalindrome_expectTrue_whenInputStringIsPalindrome() {
        String input = "A man, a plan, a canal: Panama";
        Assertions.assertTrue(classObj.isPalindrome(input));
    }

    @Test
    void test_isPalindrome_expectFalse_whenInputStringIsPalindrome() {
        String input = "race a car";
        Assertions.assertFalse(classObj.isPalindrome(input));
    }

    @Test
    void test_isPalindrome_expectTrue_whenInputStringIsEmpty() {
        String input = " ";
        Assertions.assertTrue(classObj.isPalindrome(input));
    }
}
