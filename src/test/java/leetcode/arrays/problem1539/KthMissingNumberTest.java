package leetcode.arrays.problem1539;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KthMissingNumberTest {

    KthMissingNumber classObj = new KthMissingNumber();
    KthMissingNumberUsingBinarySearch classObj2 = new KthMissingNumberUsingBinarySearch();

    @Test
    void test_findKthPositive_expect9_whenKIs5AndMissingNumberIs9() {
        int[] input = {2, 3, 4, 7, 11};
        Assertions.assertEquals(9, classObj.findKthPositive(input, 5));
        Assertions.assertEquals(9, classObj2.findKthPositive(input, 5));
    }

    @Test
    void test_findKthPositive_expect6_whenKIs2AndMissingNumberIs6() {
        int[] input = {1, 2, 3, 4};
        Assertions.assertEquals(6, classObj.findKthPositive(input, 2));
        Assertions.assertEquals(6, classObj2.findKthPositive(input, 2));
    }

    @Test
    void test_findKthPositive_expect14_whenKIs9AndMissingNumberIs4() {
        int[] input = {5, 6, 7, 8, 9};
        Assertions.assertEquals(14, classObj.findKthPositive(input, 9));
        Assertions.assertEquals(14, classObj2.findKthPositive(input, 9));
    }
}
