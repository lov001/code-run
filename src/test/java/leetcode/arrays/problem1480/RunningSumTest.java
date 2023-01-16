package leetcode.arrays.problem1480;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class RunningSumTest {

    RunningSum classObj = new RunningSum();

    @Test
    void test_runningSum_expectRunningSum_whenAllDifferentInputInSortedOrder() {
        int[] input = {1, 2, 3, 4};
        int[] expectedOutput = {1, 3, 6, 10};
        assertArrayEquals(classObj.runningSum(input), expectedOutput);
    }

    @Test
    void test_runningSum_expectRunningSum_whenAllSameInput() {
        int[] input = {1, 1, 1, 1, 1};
        int[] expectedOutput = {1, 2, 3, 4, 5};
        assertArrayEquals(classObj.runningSum(input), expectedOutput);
    }

    @Test
    void test_runningSum_expectRunningSum_whenAllDifferentInputInAnyOrder() {
        int[] input = {3, 1, 2, 10, 1};
        int[] expectedOutput = {3, 4, 6, 16, 17};
        assertArrayEquals(classObj.runningSum(input), expectedOutput);
    }
}
