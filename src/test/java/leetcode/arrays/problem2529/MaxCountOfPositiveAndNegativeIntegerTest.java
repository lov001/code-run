package leetcode.arrays.problem2529;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxCountOfPositiveAndNegativeIntegerTest {

    MaxCountOfPositiveAndNegativeInteger classObj = new MaxCountOfPositiveAndNegativeInteger();

    @Test
    void test_maximumCount_expect3_when() {
        int[] input = {-2, -1, -1, 1, 2, 3};
        Assertions.assertEquals(3, classObj.maximumCount(input));
    }

    @Test
    void test_maximumCount_expect3_when0IsAlsoInInput() {
        int[] input = {-3, -2, -1, 0, 0, 1, 2};
        Assertions.assertEquals(3, classObj.maximumCount(input));
    }

    @Test
    void test_maximumCount_expect4_whenOnlyPositive() {
        int[] input = {5, 20, 66, 1314};
        Assertions.assertEquals(4, classObj.maximumCount(input));
    }

    @Test
    void test_maximumCount_expect1_whenInputIsOnlyMinus1() {
        int[] input = {-1};
        Assertions.assertEquals(1, classObj.maximumCount(input));
    }
}
