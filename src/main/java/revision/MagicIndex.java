package revision;

import java.util.ArrayList;

public class MagicIndex {

   // TC: O(log(N)), but this will fail for duplicates
   public int magicIndexBinarySearchModified(ArrayList<Integer> a, int n) {
      return searchMagicIndex(a, 0, n - 1);
   }

   private int searchMagicIndex(ArrayList<Integer> a, int start, int end) {
      if (start > end) {
         return -1;
      }
      int mid = (start + end) / 2;
      if (a.get(mid) == mid) {
         return mid;
      }
      int leftIndex = Math.min(mid - 1, a.get(mid));
      int left = searchMagicIndex(a, start, leftIndex);
      if (left >= 0) {
         return left;
      }

      int rightIndex = Math.max(mid + 1, a.get(mid));
      return searchMagicIndex(a, rightIndex, end);
   }

   // TC: O(log(N)), but this will fail for duplicates
   public int magicIndexBinarySearch(ArrayList<Integer> a, int n) {
      int low = 0;
      int high = n - 1;
      int ans = -1;
      while (low <= high) {
         int mid = (low + high) / 2;
         if (a.get(mid) == mid) {
            ans = mid;
            break;
         } else if (a.get(mid) < mid) {
            low = mid + 1;
         } else {
            high = mid - 1;
         }
      }
      return ans;
   }

   // TC: O(N)
   public int magicIndex(ArrayList<Integer> a, int n) {
      for (int i = 0; i < n; i++) {
         if (a.get(i) == i) {
            return i;
         }
      }
      return -1;
   }
}
