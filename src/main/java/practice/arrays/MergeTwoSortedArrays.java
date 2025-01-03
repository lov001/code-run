package practice.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MergeTwoSortedArrays {

   public List<Integer> sortedArrayBruteForce(int[] a, int[] b) {
      Set<Integer> set = new TreeSet<>();
      for (int element : a) {
         set.add(element);
      }
      for (int element : b) {
         set.add(element);
      }
      return new ArrayList<>(set);
   }

   public List<Integer> sortedArrayOptimised(int[] a, int[] b) {
      List<Integer> list = new ArrayList<>();
      int n = a.length;
      int m = b.length;
      int i = 0;
      int j = 0;
      while (i < n && j < m) {
         int size = list.size();
         if (a[i] < b[j]) {
            if (size == 0 || list.get(size - 1) != a[i]) {
               list.add(a[i]);
            }
            i++;
         } else {
            if (size == 0 || list.get(size - 1) != b[j]) {
               list.add(b[j]);
            }
            j++;
         }
      }
      while (i < n) {
         int size = list.size();
         if (size == 0 || list.get(size - 1) != a[i]) {
            list.add(a[i]);
         }
         i++;
      }
      while (j < m) {
         int size = list.size();
         if (size == 0 || list.get(size - 1) != b[j]) {
            list.add(b[j]);
         }
         j++;
      }
      return list;
   }
}
