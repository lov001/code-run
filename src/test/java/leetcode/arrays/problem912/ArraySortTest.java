package leetcode.arrays.problem912;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraySortTest {

    ArraySort classObj = new ArraySort();

    @Test
    void test_sortArray_expectSortedArray_whenInput() {
        int[] input = {5, 2, 3, 1};
        int[] output = {1, 2, 3, 5};
        Assertions.assertEquals(Arrays.toString(output),
            Arrays.toString(classObj.sortArray(input)));
    }

    @Test
    void test_sortArray_expectSortedArray_whenInputContainsDuplicates() {
        int[] input = {5, 1, 1, 2, 0, 0};
        int[] output = {0, 0, 1, 1, 2, 5};
        Assertions.assertEquals(Arrays.toString(output),
            Arrays.toString(classObj.sortArray(input)));
    }
}
