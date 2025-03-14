package practice.binarysearch;

import java.util.ArrayList;

public class KthElementOfTwoSortedArrays {

   public int kthElement(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n1, int n2, int k) {
      if (n1 > n2) {
         return kthElement(arr2, arr1, n2, n1, k);
      }
      int low = Math.max(0, k - n2);
      int high = Math.min(k, n1);
      while (low <= high) {
         int mid1 = (low + high) / 2;
         int mid2 = k - mid1;
         int l1 = Integer.MIN_VALUE;
         int l2 = Integer.MIN_VALUE;
         int r1 = Integer.MAX_VALUE;
         int r2 = Integer.MAX_VALUE;
         if (mid1 < n1) {
            r1 = arr1.get(mid1);
         }
         if (mid2 < n2) {
            r2 = arr2.get(mid2);
         }
         if (mid1 - 1 >= 0) {
            l1 = arr1.get(mid1 - 1);
         }
         if (mid2 - 1 >= 0) {
            l2 = arr2.get(mid2 - 1);
         }

         if (l1 <= r2 && l2 <= r1) {
            return Math.max(l1, l2);
         } else if (l1 > r2) {
            high = mid1 - 1;
         } else {
            low = mid1 + 1;
         }
      }
      return 0;
   }
}
