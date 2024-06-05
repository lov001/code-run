package practice.sorting;

import utils.SwapNumbersInArray;

public class QuickSort {

   public void quickSort(int[] array, int left, int right) {
      if (left < 0 || right < 0) {
         return;
      }
      int index = partition(array, left, right);
      if (left < index - 1) {
         quickSort(array, left, index - 1);
      }
      if (index < right) {
         quickSort(array, index, right);
      }
   }

   private int partition(int[] array, int left, int right) {
      int pivot = array[(left + right) / 2];
      while (left <= right) {
         while (array[left] < pivot) {
            left++;
         }
         while (pivot < array[right]) {
            right--;
         }
         if (left <= right) {
            SwapNumbersInArray.swap(array, left, right);
            left++;
            right--;
         }
      }
      return left;
   }
}
