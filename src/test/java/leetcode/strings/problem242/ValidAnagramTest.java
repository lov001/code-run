package leetcode.strings.problem242;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidAnagramTest {

    ValidAnagram classObj = new ValidAnagram();

    @Test
    void test_isAnagram_expectTrue_whenStringsAreAnagram() {
        String s = "anagram";
        String t = "nagaram";
        Assertions.assertTrue(classObj.isAnagram(s, t));
    }

    @Test
    void test_isAnagram_expectFalse_whenStringsAreNotAnagram() {
        String s = "rat";
        String t = "car";
        Assertions.assertFalse(classObj.isAnagram(s, t));
    }

    @Test
    void test_isAnagram_expectFalse_whenStringsAreNotAnagramWith2Characters() {
        String s = "aacc";
        String t = "ccac";
        Assertions.assertFalse(classObj.isAnagram(s, t));
    }
}
