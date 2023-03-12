package leetcode.searching.binarysearch.problem1346;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberAndItsDoubleTest {

    NumberAndItsDouble classObj = new NumberAndItsDouble();

    @Test
    void test_checkIfExist_expectTrue_if5Double10Exists() {
        int[] input = {10, 2, 5, 3};
        Assertions.assertTrue(classObj.checkIfExist(input));
    }

    @Test
    void test_checkIfExist_expectFalse_ifNoDoubleExists() {
        int[] input = {3, 1, 7, 11};
        Assertions.assertFalse(classObj.checkIfExist(input));
    }

    @Test
    void test_checkIfExist_expectFalse_ifNoDoubleExistsInArrayHavingNegativeValues() {
        int[] input = {-2, 0, 10, -19, 4, 6, -8};
        Assertions.assertFalse(classObj.checkIfExist(input));
    }

    @Test
    void test_checkIfExist_expectTrue_if0Double0Exists() {
        int[] input = {0, 0};
        Assertions.assertTrue(classObj.checkIfExist(input));
    }
}
