package revision;

import java.util.ArrayList;

public class MagicIndex {

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
