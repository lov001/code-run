package practice.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuickSortTest {

   QuickSort classObj = new QuickSort();

   @Test
   void test_quickSort_expectEmptyArray_whenInputArrayIsEmpty() {
      int[] input = {};
      int[] output = {};
      classObj.quickSort(input, -1, -1);
      Assertions.assertArrayEquals(output, input);
   }

   @Test
   void test_quickSort_expectSameArray_whenInputArrayHasOnlyOneElement() {
      int[] input = {2};
      int[] output = {2};
      classObj.quickSort(input, 0, 0);
      Assertions.assertArrayEquals(output, input);
   }

   @Test
   void test_quickSort_expectSortedArray_whenInputArrayHas2Elements() {
      int[] input = {7, 2};
      int[] output = {2, 7};
      classObj.quickSort(input, 0, 1);
      Assertions.assertArrayEquals(output, input);
   }

   @Test
   void test_quickSort_expectSortedArray_whenInputArrayHasNElements() {
      int[] input = {6, 2, 4, 19, 7, 8, 1};
      int[] output = {1, 2, 4, 6, 7, 8, 19};
      classObj.quickSort(input, 0, 6);
      Assertions.assertArrayEquals(output, input);
   }
}
