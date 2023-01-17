package leetcode.arrays.problem2053;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KthDistinctStringTest {

    KthDistinctString classObj = new KthDistinctString();

    @Test
    void test_kthDistinct_expectA_whenInputContainsOnlyTwoDistinctStrings() {
        String[] input = {"d", "b", "c", "b", "c", "a"};
        Assertions.assertEquals("a", classObj.kthDistinct(input, 2));
    }

    @Test
    void test_kthDistinct_expectAAA_whenInputContainsAllDistinctStrings() {
        String[] input = {"aaa", "aa", "a"};
        Assertions.assertEquals("aaa", classObj.kthDistinct(input, 2));
    }

    @Test
    void test_kthDistinct_expectEmptyString_whenKthDistinctStringIsNotThere() {
        String[] input = {"a", "b", "a"};
        Assertions.assertEquals("", classObj.kthDistinct(input, 2));
    }
}
