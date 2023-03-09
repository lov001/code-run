package leetcode.searching.binarysearch.problem268;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MissingNumberTest {

    MissingNumber classObj = new MissingNumber();
    MissingNumberUsingBinarySearch classObj2 = new MissingNumberUsingBinarySearch();

    @Test
    void test_missingNumber_expect2_when2IsMissingNumber() {
        int[] input = {3, 0, 1};
        Assertions.assertEquals(2, classObj.missingNumber(input));
        Assertions.assertEquals(2, classObj2.missingNumber(input));
    }

    @Test
    void test_missingNumber_expect2_when2IsMissingNumberFromAnArrayOfSize2() {
        int[] input = {0, 1};
        Assertions.assertEquals(2, classObj.missingNumber(input));
        Assertions.assertEquals(2, classObj2.missingNumber(input));
    }

    @Test
    void test_missingNumber_expect8_when8IsMissingNumber() {
        int[] input = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        Assertions.assertEquals(8, classObj.missingNumber(input));
        Assertions.assertEquals(8, classObj2.missingNumber(input));
    }

    @Test
    void test_missingNumber_expect3_when3IsMissingNumber() {
        int[] input = {9, 6, 4, 2, 8, 5, 7, 0, 1};
        Assertions.assertEquals(3, classObj.missingNumber(input));
        Assertions.assertEquals(3, classObj2.missingNumber(input));
    }
}
