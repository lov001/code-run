package leetcode.problem409;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestPalindromeTest {

    LongestPalindrome classObj = new LongestPalindrome();

    @Test
    void test_longestPalindrome_expect7_whenInputGiven() {
        String input = "abccccdd";
        Assertions.assertEquals(7, classObj.longestPalindrome(input));
    }

    @Test
    void test_longestPalindrome_expect1_whenInputGivenIsOfLength1() {
        String input = "a";
        Assertions.assertEquals(1, classObj.longestPalindrome(input));
    }

    @Test
    void test_longestPalindrome_expect2_whenInputGivenIsOfLength2() {
        String input = "bb";
        Assertions.assertEquals(2, classObj.longestPalindrome(input));
    }

    @Test
    void test_longestPalindrome_expect3_whenInputConsistsSameOneLetterOnly() {
        String input = "ccc";
        Assertions.assertEquals(3, classObj.longestPalindrome(input));
    }

    @Test
    void test_longestPalindrome_expect3_whenInputConsistsDifferentLetter() {
        String input = "abb";
        Assertions.assertEquals(3, classObj.longestPalindrome(input));
    }

    @Test
    void test_longestPalindrome_expect5_whenInputIsBananas() {
        String input = "bananas";
        Assertions.assertEquals(5, classObj.longestPalindrome(input));
    }

    @Test
    void test_longestPalindrome_expect3_whenGivenInput() {
        String input = "abcbe";
        Assertions.assertEquals(3, classObj.longestPalindrome(input));
    }
}
