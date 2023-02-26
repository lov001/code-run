package leetcode.strings.problem953;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlienDictionaryTest {

    AlienDictionary classObj = new AlienDictionary();

    @Test
    void test_isAlienSorted_expectTrue_whenSequenceIsSorted() {
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        String[] words = {"hello", "leetcode"};
        Assertions.assertTrue(classObj.isAlienSorted(words, order));
    }

    @Test
    void test_isAlienSorted_expectFalse_whenSequenceIsNotSorted() {
        String order = "worldabcefghijkmnpqstuvxyz";
        String[] words = {"word", "world", "row"};
        Assertions.assertFalse(classObj.isAlienSorted(words, order));
    }

    @Test
    void test_isAlienSorted_expectFalse_whenSequenceIsSortedButSizeIsMismatch() {
        String order = "abcdefghijklmnopqrstuvwxyz";
        String[] words = {"apple", "app"};
        Assertions.assertFalse(classObj.isAlienSorted(words, order));
    }
}
