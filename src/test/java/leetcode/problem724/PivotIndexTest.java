package leetcode.problem724;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PivotIndexTest {

    PivotIndex classObj = new PivotIndex();

    @Test
    void test_pivotIndex_expect3_whenGivenInput() {
        int[] input = {1, 7, 3, 6, 5, 6};
        Assertions.assertEquals(3, classObj.pivotIndex(input));
    }

    @Test
    void test_pivotIndex_expectMinus1_whenGivenInput() {
        int[] input = {1, 2, 3};
        Assertions.assertEquals(-1, classObj.pivotIndex(input));
    }

    @Test
    void test_pivotIndex_expect0_whenGivenInput() {
        int[] input = {2, 1, -1};
        Assertions.assertEquals(0, classObj.pivotIndex(input));
    }
}
