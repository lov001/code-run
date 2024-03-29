package leetcode.searching.binarysearch.problem349;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntersectionOfTwoArraysTest {

    IntersectionOfTwoArrays classObj = new IntersectionOfTwoArrays();
    IntersectionOfTwoArraysUsingBinarySearch classObj2 =
        new IntersectionOfTwoArraysUsingBinarySearch();
    IntersectionOfTwoArraysUsingTwoHashSet classObj3 = new IntersectionOfTwoArraysUsingTwoHashSet();

    @Test
    void test_intersection_expect2_whenIntersectionOccursAt2Only() {
        int[] arr1 = {1, 2, 2, 1};
        int[] arr2 = {2, 2};
        int[] result = {2};
        Assertions.assertEquals(Arrays.toString(result),
            Arrays.toString(classObj.intersection(arr1, arr2)));
        Assertions.assertEquals(Arrays.toString(result),
            Arrays.toString(classObj2.intersection(arr1, arr2)));
        Assertions.assertEquals(Arrays.toString(result),
            Arrays.toString(classObj3.intersection(arr1, arr2)));
    }

    @Test
    void test_intersection_expect4And9_whenIntersectionOccursAt4And9Only() {
        int[] arr1 = {4, 9, 5};
        int[] arr2 = {9, 4, 9, 8, 4};
        int[] result = {4, 9};
        Assertions.assertEquals(Arrays.toString(result),
            Arrays.toString(classObj.intersection(arr1, arr2)));
        Assertions.assertEquals(Arrays.toString(result),
            Arrays.toString(classObj2.intersection(arr1, arr2)));
        Assertions.assertEquals(Arrays.toString(result),
            Arrays.toString(classObj3.intersection(arr1, arr2)));
    }
}
