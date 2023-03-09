package leetcode.searching.binarysearch.problem268;

import leetcode.searching.binarysearch.MissingNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MissingNumberTest {

    MissingNumber classObj = new MissingNumber();

    @Test
    void test_missingNumber_expect2_when2IsMissingNumber() {
        int[] input = {3, 0, 1};
        Assertions.assertEquals(2, classObj.missingNumber(input));
    }

    @Test
    void test_missingNumber_expect2_when2IsMissingNumberFromAnArrayOfSize2() {
        int[] input = {0, 1};
        Assertions.assertEquals(2, classObj.missingNumber(input));
    }

    @Test
    void test_missingNumber_expect8_when8IsMissingNumber() {
        int[] input = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        Assertions.assertEquals(8, classObj.missingNumber(input));
    }
}
