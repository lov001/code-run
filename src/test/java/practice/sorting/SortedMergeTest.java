package practice.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortedMergeTest {

   SortedMerge classObj = new SortedMerge();

   @Test
   void test_sortedMerge_expectSortedArray_whenArray2IsEmpty() {
      int[] array1 = {3, 5, 7, 8};
      int[] array2 = {};
      classObj.sortedMerge(array1, array2, 4, 0);
      int[] output = {3, 5, 7, 8};
      Assertions.assertArrayEquals(output, array1);
   }

   @Test
   void test_sortedMerge_expectSortedArray_whenArray1IsEmpty() {
      int[] array1 = {-1, -1, -1, -1};
      int[] array2 = {3, 5, 7, 8};
      classObj.sortedMerge(array1, array2, 0, 4);
      int[] output = {3, 5, 7, 8};
      Assertions.assertArrayEquals(output, array1);
   }

   @Test
   void test_sortedMerge_expectSortedArray_whenBothArraysHave1Element() {
      int[] array1 = {4, -1};
      int[] array2 = {5};
      classObj.sortedMerge(array1, array2, 1, 1);
      int[] output = {4, 5};
      Assertions.assertArrayEquals(output, array1);
   }

   @Test
   void test_sortedMerge_expectSortedArray_whenGivenArrays() {
      int[] array1 = {3, 5, 7, 8, -1, -1, -1, -1, -1};
      int[] array2 = {1, 4, 9, 10, 12};
      classObj.sortedMerge(array1, array2, 4, 5);
      int[] output = {1, 3, 4, 5, 7, 8, 9, 10, 12};
      Assertions.assertArrayEquals(output, array1);
   }
}
