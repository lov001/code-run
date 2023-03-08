package leetcode.searching.problem35;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchInsertPositionTest {

    SearchInsertPosition classObj = new SearchInsertPosition();

    @Test
    void test_searchInsert_expect2_whenElement5IsToBeInsertedAtIndex2() {
        int[] input = {1, 3, 5, 6};
        Assertions.assertEquals(2, classObj.searchInsert(input, 5));
    }

    @Test
    void test_searchInsert_expect1_whenElement2IsToBeInsertedAtIndex1() {
        int[] input = {1, 3, 5, 6};
        Assertions.assertEquals(1, classObj.searchInsert(input, 2));
    }

    @Test
    void test_searchInsert_expect4_whenElement7IsToBeInsertedAtIndex4() {
        int[] input = {1, 3, 5, 6};
        Assertions.assertEquals(4, classObj.searchInsert(input, 7));
    }
}
