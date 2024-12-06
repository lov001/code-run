package practice.binarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AllocateBooks {

   public int findPages(ArrayList<Integer> arr, int n, int m) {
      if (m > n) {
         return -1;
      }
      int low = Collections.max(arr);
      int high = arr.stream().mapToInt(Integer::intValue).sum();
      while (low <= high) {
         int middle = low + (high - low) / 2;
         int allocatedStudents = allocateBooks(arr, middle);
         if (allocatedStudents > m) {
            low = middle + 1;
         } else {
            high = middle - 1;
         }
      }
      return low;
   }

   public int findPagesBruteForce(ArrayList<Integer> arr, int n, int m) {
      if (m > n) {
         return -1;
      }
      int low = arr.stream().max(Comparator.naturalOrder()).orElse(-1);
      int high = arr.stream().reduce(Integer::sum).orElse(-1);
      int minPages = -1;
      for (int pages = low; pages <= high; pages++) {
         int allocatedStudents = allocateBooks(arr, pages);
         if (allocatedStudents == m) {
            minPages = pages;
            break;
         }
      }
      return minPages;
   }

   private int allocateBooks(ArrayList<Integer> arr, int pages) {
      int studentsAllocated = 1;
      int noOfPagesAllocated = 0;
      for (Integer entry : arr) {
         if (noOfPagesAllocated + entry <= pages) {
            noOfPagesAllocated += entry;
         } else {
            studentsAllocated++;
            noOfPagesAllocated = entry;
         }
      }
      return studentsAllocated;
   }
}
