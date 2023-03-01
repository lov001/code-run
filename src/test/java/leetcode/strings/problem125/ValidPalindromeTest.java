package leetcode.strings.problem125;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidPalindromeTest {

    ValidPalindrome classObj = new ValidPalindrome();
    ValidPalindromeByRemovingCharacters classObj2 = new ValidPalindromeByRemovingCharacters();

    @Test
    void test_isPalindrome_expectTrue_whenInputStringIsPalindrome() {
        String input = "A man, a plan, a canal: Panama";
        Assertions.assertTrue(classObj.isPalindrome(input));
        Assertions.assertTrue(classObj2.isPalindrome(input));
    }

    @Test
    void test_isPalindrome_expectFalse_whenInputStringIsPalindrome() {
        String input = "race a car";
        Assertions.assertFalse(classObj.isPalindrome(input));
        Assertions.assertFalse(classObj2.isPalindrome(input));
    }

    @Test
    void test_isPalindrome_expectTrue_whenInputStringIsEmpty() {
        String input = " ";
        Assertions.assertTrue(classObj.isPalindrome(input));
        Assertions.assertTrue(classObj2.isPalindrome(input));
    }

    @Test
    void test_isPalindrome_expectTrue_whenInputStringIsOnlySpecialCharacters() {
        String input = ".,";
        Assertions.assertTrue(classObj.isPalindrome(input));
        Assertions.assertTrue(classObj2.isPalindrome(input));
    }

    @Test
    void test_isPalindrome_expectTrue_whenInputStringIsADot() {
        String input = "a.";
        Assertions.assertTrue(classObj.isPalindrome(input));
        Assertions.assertTrue(classObj2.isPalindrome(input));
    }

    @Test
    void test_isPalindrome_expectFalse_whenInputStringIs0P() {
        String input = "0P";
        Assertions.assertFalse(classObj.isPalindrome(input));
        Assertions.assertFalse(classObj2.isPalindrome(input));
    }

    @Test
    void test_isPalindrome_expectTrue_whenInputStringIsDotA() {
        String input = ".a";
        Assertions.assertTrue(classObj.isPalindrome(input));
        Assertions.assertTrue(classObj2.isPalindrome(input));
    }

    @Test
    void test_isPalindrome_expectFalse_whenInputStringIsAb() {
        String input = "ab";
        Assertions.assertFalse(classObj.isPalindrome(input));
        Assertions.assertFalse(classObj2.isPalindrome(input));
    }
}
