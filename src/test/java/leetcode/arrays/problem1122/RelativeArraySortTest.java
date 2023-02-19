package leetcode.arrays.problem1122;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RelativeArraySortTest {

    RelativeArraySort classObj = new RelativeArraySort();

    @Test
    void test_relativeSortArray_expect_whenDuplicatesPresent() {
        int[] array1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] array2 = {2, 1, 4, 3, 9, 6};
        int[] output = {2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19};
        Assertions.assertEquals(Arrays.toString(output),
            Arrays.toString(classObj.relativeSortArray(array1, array2)));
    }

    @Test
    void test_relativeSortArray_expect_whenDuplicatesAbsent() {
        int[] array1 = {28, 6, 22, 8, 44, 17};
        int[] array2 = {22, 28, 8, 6};
        int[] output = {22, 28, 8, 6, 17, 44};
        Assertions.assertEquals(Arrays.toString(output),
            Arrays.toString(classObj.relativeSortArray(array1, array2)));
    }
}
