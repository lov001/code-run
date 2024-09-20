package practice.dynamicprogrammingandrecursion;

import java.util.ArrayList;
import java.util.List;

public class CountInversions {

   public int numberOfInversions(int[] array, int n) {
      return mergeSort(0, n - 1, array);
   }

   private int mergeSort(int start, int end, int[] array) {
      int inversionCount = 0;
      if (start >= end) {
         return inversionCount;
      }
      int mid = (start + end) / 2;
      inversionCount += mergeSort(start, mid, array);
      inversionCount += mergeSort(mid + 1, end, array);
      inversionCount += merge(start, mid, end, array);
      return inversionCount;
   }

   private int merge(int start, int mid, int end, int[] array) {
      int left = start, right = mid + 1;
      int inversionCount = 0;
      List<Integer> temp = new ArrayList<>();
      while (left <= mid && right <= end) {
         if (array[left] > array[right]) {
            inversionCount += (mid - left + 1);
            temp.add(array[right++]);
         } else {
            temp.add(array[left++]);
         }
      }
      while (left <= mid) {
         temp.add(array[left++]);
      }
      while (right <= end) {
         temp.add(array[right++]);
      }
      for (int i = start; i <= end; i++) {
         array[i] = temp.get(i - start);
      }
      return inversionCount;
   }
}
