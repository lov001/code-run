package leetcode.arrays.problem1122;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RelativeArraySortTest {

    RelativeArraySort classObj = new RelativeArraySort();
    RelativeArraySortApproach2 classObj2 = new RelativeArraySortApproach2();

    @Test
    void test_relativeSortArray_expect_whenDuplicatesPresent() {
        int[] array1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] array2 = {2, 1, 4, 3, 9, 6};
        int[] output = {2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19};
//        Assertions.assertEquals(Arrays.toString(output),
//            Arrays.toString(classObj.relativeSortArray(array1, array2)));
        Assertions.assertEquals(Arrays.toString(output),
            Arrays.toString(classObj2.relativeSortArray(array1, array2)));
    }

    @Test
    void test_relativeSortArray_expect_whenDuplicatesAbsent() {
        int[] array1 = {28, 6, 22, 8, 44, 17};
        int[] array2 = {22, 28, 8, 6};
        int[] output = {22, 28, 8, 6, 17, 44};
        Assertions.assertEquals(Arrays.toString(output),
            Arrays.toString(classObj.relativeSortArray(array1, array2)));
        Assertions.assertEquals(Arrays.toString(output),
            Arrays.toString(classObj2.relativeSortArray(array1, array2)));
    }

    @Test
    void test_relativeSortArray_expect_whenDuplicatesPresentAndTC13() {
        int[] array1 = {2, 21, 43, 38, 0, 42, 33, 7, 24, 13, 12, 27, 12, 24, 5, 23, 29, 48, 30, 31};
        int[] array2 = {2, 42, 38, 0, 43, 21};
        int[] output = {2, 42, 38, 0, 43, 21, 5, 7, 12, 12, 13, 23, 24, 24, 27, 29, 30, 31, 33, 48};
        Assertions.assertEquals(Arrays.toString(output),
            Arrays.toString(classObj.relativeSortArray(array1, array2)));
        Assertions.assertEquals(Arrays.toString(output),
            Arrays.toString(classObj2.relativeSortArray(array1, array2)));
    }

    @Test
    void test_relativeSortArray_expect_whenDuplicatesAbsentAndTC16() {
        int[] array1 = {1, 2, 3, 4, 5, 0};
        int[] array2 = {4, 1, 3};
        int[] output = {4, 1, 3, 0, 2, 5};
        Assertions.assertEquals(Arrays.toString(output),
            Arrays.toString(classObj.relativeSortArray(array1, array2)));
        Assertions.assertEquals(Arrays.toString(output),
            Arrays.toString(classObj2.relativeSortArray(array1, array2)));
    }
}
