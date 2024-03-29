package leetcode.searching.binarysearch.problem704;

import leetcode.searching.binarysearch.problem704.BinarySearch;
import leetcode.searching.binarysearch.problem704.BinarySearchRecursiveApproach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {

    BinarySearch classObj = new BinarySearch();
    BinarySearchRecursiveApproach classObj2 = new BinarySearchRecursiveApproach();

    @Test
    void test_search_expect4_whenElement9IsAtIndex4() {
        int[] input = {-1, 0, 3, 5, 9, 12};
        Assertions.assertEquals(4, classObj.search(input, 9));
        Assertions.assertEquals(4, classObj2.search(input, 9));
    }

    @Test
    void test_search_expectMinus2_whenElement2IsNotPresent() {
        int[] input = {-1, 0, 3, 5, 9, 12};
        Assertions.assertEquals(-1, classObj.search(input, 2));
        Assertions.assertEquals(-1, classObj2.search(input, 2));
    }

    @Test
    void test_search_expect0_whenElement5IsTheOnlyElement() {
        int[] input = {5};
        Assertions.assertEquals(0, classObj.search(input, 5));
        Assertions.assertEquals(0, classObj2.search(input, 5));
    }
}
