package leetcode.arrays.problem88;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeSortedArrayTest {


   MergeSortedArrayBruteForceWithExtraSpace classObj = new MergeSortedArrayBruteForceWithExtraSpace();
   MergeSortedArrayOptimalSolution classObj2 = new MergeSortedArrayOptimalSolution();

   @Test
   void test_merge_expectMergedSortedArray_whenTwoArraysOfSize3() {
      int[] array1 = {1, 2, 3, 0, 0, 0};
      int[] array2 = {2, 5, 6};
      int m = 3, n = 3;
      int[] expectedOutput = {1, 2, 2, 3, 5, 6};
//      classObj.merge(array1, m, array2, n);
      classObj2.merge(array1, m, array2, n);
      Assertions.assertArrayEquals(expectedOutput, array1);
   }

   @Test
   void test_merge_expectMergedSortedArray_whenOneArrayIsEmpty() {
      int[] array1 = {1};
      int[] array2 = {};
      int m = 1, n = 0;
      int[] expectedOutput = {1};
//      classObj.merge(array1, m, array2, n);
      classObj2.merge(array1, m, array2, n);
      Assertions.assertArrayEquals(expectedOutput, array1);
   }

   @Test
   void test_merge_expectMergedSortedArray_whenMIs0() {
      int[] array1 = {0};
      int[] array2 = {1};
      int m = 0, n = 1;
      int[] expectedOutput = {1};
//      classObj.merge(array1, m, array2, n);
      classObj2.merge(array1, m, array2, n);
      Assertions.assertArrayEquals(expectedOutput, array1);
   }

   @Test
   void test_merge_expectMergedSortedArray_whenArray2WillComeBeforeArray1() {
      int[] array1 = {4, 5, 6, 0, 0, 0};
      int[] array2 = {1, 2, 3};
      int m = 3, n = 3;
      int[] expectedOutput = {1, 2, 3, 4, 5, 6};
//      classObj.merge(array1, m, array2, n);
      classObj2.merge(array1, m, array2, n);
      Assertions.assertArrayEquals(expectedOutput, array1);
   }

   @Test
   void test_merge_expectMergedSortedArray_whenArray1ContainsOnly4() {
      int[] array1 = {4, 0, 0, 0, 0, 0};
      int[] array2 = {1, 2, 3, 5, 6};
      int m = 1, n = 5;
      int[] expectedOutput = {1, 2, 3, 4, 5, 6};
//      classObj.merge(array1, m, array2, n);
      classObj2.merge(array1, m, array2, n);
      Assertions.assertArrayEquals(expectedOutput, array1);
   }
}
