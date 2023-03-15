package leetcode.strings.problem409;

import leetcode.strings.problem409.LongestPalindrome;
import leetcode.strings.problem409.LongestPalindromeSetBasedApproach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestPalindromeTest {

    LongestPalindrome classObj = new LongestPalindrome();
    LongestPalindromeSetBasedApproach classObj2 = new LongestPalindromeSetBasedApproach();

    @Test
    void test_longestPalindrome_expect7_whenInputGiven() {
        String input = "abccccdd";
        Assertions.assertEquals(7, classObj.longestPalindrome(input));
        Assertions.assertEquals(7, classObj2.longestPalindrome(input));
    }

    @Test
    void test_longestPalindrome_expect1_whenInputGivenIsOfLength1() {
        String input = "a";
        Assertions.assertEquals(1, classObj.longestPalindrome(input));
        Assertions.assertEquals(1, classObj2.longestPalindrome(input));
    }

    @Test
    void test_longestPalindrome_expect2_whenInputGivenIsOfLength2() {
        String input = "bb";
        Assertions.assertEquals(2, classObj.longestPalindrome(input));
        Assertions.assertEquals(2, classObj2.longestPalindrome(input));
    }

    @Test
    void test_longestPalindrome_expect3_whenInputConsistsSameOneLetterOnly() {
        String input = "ccc";
        Assertions.assertEquals(3, classObj.longestPalindrome(input));
        Assertions.assertEquals(3, classObj2.longestPalindrome(input));
    }

    @Test
    void test_longestPalindrome_expect3_whenInputConsistsDifferentLetter() {
        String input = "abb";
        Assertions.assertEquals(3, classObj.longestPalindrome(input));
        Assertions.assertEquals(3, classObj2.longestPalindrome(input));
    }

    @Test
    void test_longestPalindrome_expect5_whenInputIsBananas() {
        String input = "bananas";
        Assertions.assertEquals(5, classObj.longestPalindrome(input));
        Assertions.assertEquals(5, classObj2.longestPalindrome(input));
    }

    @Test
    void test_longestPalindrome_expect3_whenGivenInput() {
        String input = "abcbe";
        Assertions.assertEquals(3, classObj.longestPalindrome(input));
        Assertions.assertEquals(3, classObj2.longestPalindrome(input));
    }
}
