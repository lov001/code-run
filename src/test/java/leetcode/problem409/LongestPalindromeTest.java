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
}
