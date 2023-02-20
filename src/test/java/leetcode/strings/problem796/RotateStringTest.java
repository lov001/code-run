package leetcode.strings.problem796;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RotateStringTest {

    RotateString classObj = new RotateString();

    @Test
    void test_rotateString_expectTrue_whenMatch() {
        String input = "abcde";
        String goal = "cdeab";
        Assertions.assertTrue(classObj.rotateString(input, goal));
    }

    @Test
    void test_rotateString_expectFalse_whenNoMatch() {
        String input = "abcde";
        String goal = "abced";
        Assertions.assertFalse(classObj.rotateString(input, goal));
    }

    @Test
    void test_rotateString_expectFalse_whenNOnlyOneElement() {
        String input = "aa";
        String goal = "a";
        Assertions.assertFalse(classObj.rotateString(input, goal));
    }
}
