package practice.arrays;

import java.util.Arrays;

public class MergeTwoSortedArraysWithoutExtraSpace {

   // uses shell sort
   // TC: log(n+m) * (n+m)
   public void mergeTwoSortedArraysWithoutExtraSpaceUsingGapMethod(long[] a, long[] b) {
      int n = a.length;
      int m = b.length;
      int length = n + m;
      int gap = (length / 2) + (length % 2);
      while (gap > 0) {
         int left = 0;
         int right = left + gap;
         while (right < length) {
            // both pointers on array1 and array2
            if (left < n && right >= n) {
               swapIfGreater(a, b, left, right - n);
            } else if (left >= n) {
               // both pointer on right side
               swapIfGreater(b, b, left - n, right - n);
            } else {
               // both pointers on left side
               swapIfGreater(a, a, left, right);
            }
            left++;
            right++;
         }
         if (gap == 1) {
            break;
         }
         gap = (gap / 2) + (gap % 2);
      }
   }

   // TC: O(max(n, m)) + O(nlog(n)) + O(mlog(m))
   public void mergeTwoSortedArraysWithoutExtraSpace(long[] a, long[] b) {
      int n = a.length;
      int m = b.length;
      int left = n - 1;
      int right = 0;
      while (left >= 0 && right < m) {
         if (a[left] > b[right]) {
            long temp = a[left];
            a[left] = b[right];
            b[right] = temp;
            left--;
            right++;
         } else {
            break;
         }
      }
      Arrays.sort(a);
      Arrays.sort(b);
   }

   private void swapIfGreater(long[] a, long[] b, int left, int right) {
      if (a[left] > b[right]) {
         long temp = a[left];
         a[left] = b[right];
         b[right] = temp;
      }
   }
}
