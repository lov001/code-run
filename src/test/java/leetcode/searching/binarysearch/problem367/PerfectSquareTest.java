package leetcode.searching.binarysearch.problem367;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PerfectSquareTest {

    PerfectSquare classObj = new PerfectSquare();

    @Test
    void test_isPerfectSquare_expectTrue_whenNumberIs16() {
        Assertions.assertTrue(classObj.isPerfectSquare(16));
    }

    @Test
    void test_isPerfectSquare_expectFalse_whenNumberIs14() {
        Assertions.assertFalse(classObj.isPerfectSquare(14));
    }

    @Test
    void test_isPerfectSquare_expectTrue_whenNumberIs808201() {
        Assertions.assertTrue(classObj.isPerfectSquare(808201));
    }
}
