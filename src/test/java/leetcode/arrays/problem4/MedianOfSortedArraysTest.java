package leetcode.arrays.problem4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MedianOfSortedArraysTest {

    MedianOfSortedArrays classObj = new MedianOfSortedArrays();

    @Test
    void test_findMedianSortedArrays_expect2_whenTwoGivenArrays() {
        int[] input1 = {1, 3};
        int[] input2 = {2};
        Assertions.assertEquals(2.0, classObj.findMedianSortedArrays(input1, input2));
    }

    @Test
    void test_findMedianSortedArrays_expect2Point5_whenTwoGivenArrays() {
        int[] input1 = {1, 2};
        int[] input2 = {3, 4};
        Assertions.assertEquals(2.5, classObj.findMedianSortedArrays(input1, input2));
    }
}
