package practice.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeSortTest {

   MergeSort classObj = new MergeSort();

   @Test
   void test_mergeSort_expectEmptyArray_whenInputArrayIsEmpty() {
      int[] input = {};
      int[] output = {};
      classObj.mergeSort(input);
      Assertions.assertArrayEquals(output, input);
   }

   @Test
   void test_mergeSort_expectSameArray_whenInputArrayHasOnlyOneElement() {
      int[] input = {2};
      int[] output = {2};
      classObj.mergeSort(input);
      Assertions.assertArrayEquals(output, input);
   }

   @Test
   void test_mergeSort_expectSortedArray_whenInputArrayHas2Elements() {
      int[] input = {7, 2};
      int[] output = {2, 7};
      classObj.mergeSort(input);
      Assertions.assertArrayEquals(output, input);
   }

   @Test
   void test_mergeSort_expectSortedArray_whenInputArrayHasNElements() {
      int[] input = {6, 2, 4, 19, 7, 8, 1};
      int[] output = {1, 2, 4, 6, 7, 8, 19};
      classObj.mergeSort(input);
      Assertions.assertArrayEquals(output, input);
   }
}
