package leetcode.arrays.problem1679;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxNumberOfKSumPairsTest {

    MaxNumberOfKSumPairs classObj = new MaxNumberOfKSumPairs();

    @Test
    void test_maxOperations_expect2_when() {
        int[] input = {1, 2, 3, 4};
        Assertions.assertEquals(classObj.maxOperations(input, 5), 2);
    }

    @Test
    void test_maxOperations_expect1_when() {
        int[] input = {3, 1, 3, 4, 3};
        Assertions.assertEquals(classObj.maxOperations(input, 6), 1);
    }
}
