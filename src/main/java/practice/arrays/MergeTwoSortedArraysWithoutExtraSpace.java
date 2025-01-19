package practice.arrays;

import java.util.Arrays;

public class MergeTwoSortedArraysWithoutExtraSpace {

   public void mergeTwoSortedArraysWithoutExtraSpace(long[] a, long[] b) {
      int n = a.length;
      int m = b.length;
      long left = n - 1;
      long right = 0;
      while (left >= 0 && right < m) {
         if (a[(int) left] > b[(int) right]) {
            long temp = a[(int) left];
            a[(int) left] = b[(int) right];
            b[(int) right] = temp;
            left--;
            right++;
         } else {
            break;
         }
      }
      Arrays.sort(a);
      Arrays.sort(b);
   }
}
