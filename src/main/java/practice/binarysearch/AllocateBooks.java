package practice.binarysearch;

import java.util.ArrayList;
import java.util.Comparator;

public class AllocateBooks {

   public int findPages(ArrayList<Integer> arr, int n, int m) {
      if (m > n) {
         return -1;
      }
      int low = arr.stream().max(Comparator.naturalOrder()).orElse(-1);
      int high = arr.stream().reduce(Integer::sum).orElse(-1);
      int minPages = -1;
      for (int pages = low; pages <= high; pages++) {
         if (allocateBooks(arr, pages, m)) {
            minPages = pages;
            break;
         }
      }
      return minPages;
   }

   private boolean allocateBooks(ArrayList<Integer> arr, int pages, int m) {
      int studentsAllocated = 1;
      int noOfPagesAllocated = arr.get(0);
      for (int i = 1; i < arr.size(); i++) {
         if (noOfPagesAllocated + arr.get(i) <= pages) {
            noOfPagesAllocated += arr.get(i);
         } else {
            studentsAllocated++;
            noOfPagesAllocated = arr.get(i);
         }
      }
      return studentsAllocated == m;
   }
}
