package leetcode.strings.problem14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestCommonPrefixTest {

    LongestCommonPrefix classObj = new LongestCommonPrefix();

    @Test
    void test_longestCommonPrefix_expectFL_whenInputHasFlAsPrefix() {
        String[] input = {"flower", "flow", "flight"};
        Assertions.assertEquals("fl", classObj.longestCommonPrefix(input));
    }

    @Test
    void test_longestCommonPrefix_expectEmptyString_whenInputHasNoPrefix() {
        String[] input = {"dog", "racecar", "car"};
        Assertions.assertEquals("", classObj.longestCommonPrefix(input));
    }
}
