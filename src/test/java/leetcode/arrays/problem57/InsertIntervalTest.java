package leetcode.arrays.problem57;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InsertIntervalTest {

    InsertInterval classObj = new InsertInterval();

    @Test
    void test_insert_expect_whenIntervalDoesNotOverlaps() {
        int[][] input = {{1, 3}, {6, 9}};
        int[] interval = {2, 5};
        int[][] output = {{1, 5}, {6, 9}};
        Assertions.assertEquals(output, classObj.insert(input, interval));
    }

    @Test
    void test_insert_expect_whenIntervalOverlaps() {
        int[][] input = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] interval = {4, 8};
        int[][] output = {{1, 2}, {3, 10}, {12, 16}};
        Assertions.assertEquals(output, classObj.insert(input, interval));
    }
}
