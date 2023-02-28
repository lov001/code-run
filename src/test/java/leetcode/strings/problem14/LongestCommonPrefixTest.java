package leetcode.strings.problem14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestCommonPrefixTest {

    LongestCommonPrefix classObj = new LongestCommonPrefix();
    LongestCommonPrefixApproach2 classObj2 = new LongestCommonPrefixApproach2();

    @Test
    void test_longestCommonPrefix_expectFL_whenInputHasFlAsPrefix() {
        String[] input = {"flower", "flow", "flight"};
        Assertions.assertEquals("fl", classObj.longestCommonPrefix(input));
        Assertions.assertEquals("fl", classObj2.longestCommonPrefix(input));
    }

    @Test
    void test_longestCommonPrefix_expectEmptyString_whenInputHasNoPrefix() {
        String[] input = {"dog", "racecar", "car"};
        Assertions.assertEquals("", classObj.longestCommonPrefix(input));
        Assertions.assertEquals("", classObj2.longestCommonPrefix(input));
    }

    @Test
    void test_longestCommonPrefix_expectEmptyAA_whenInputHasOnlyAs() {
        String[] input = {"aaa", "aa", "aaa"};
        Assertions.assertEquals("aa", classObj.longestCommonPrefix(input));
        Assertions.assertEquals("aa", classObj2.longestCommonPrefix(input));
    }
}
