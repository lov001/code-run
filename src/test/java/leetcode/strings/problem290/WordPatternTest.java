package leetcode.strings.problem290;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordPatternTest {

    WordPattern classObj = new WordPattern();

    @Test
    void test_wordPattern_expectTrue_whenPatternIsFollowed() {
        String pattern = "abba";
        String text = "dog cat cat dog";
        Assertions.assertTrue(classObj.wordPattern(pattern, text));
    }

    @Test
    void test_wordPattern_expectFalse_whenPatternIsNotFollowed() {
        String pattern = "abba";
        String text = "dog cat cat fish";
        Assertions.assertFalse(classObj.wordPattern(pattern, text));
    }

    @Test
    void test_wordPattern_expectFalse_whenPatternIsNotFollowed2() {
        String pattern = "aaaa";
        String text = "dog cat cat dog";
        Assertions.assertFalse(classObj.wordPattern(pattern, text));
    }
}
