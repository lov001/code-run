package practice.binarysearch;

import java.util.ArrayList;

public class SearchInRotatedArray {

   public int search(ArrayList<Integer> arr, int n, int k) {
      int low = 0;
      int high = n - 1;
      int ans = -1;
      while (low <= high) {
         int mid = low + (high - low) / 2;
         if (arr.get(mid) == k) {
            ans = mid;
            break;
         } else if (arr.get(low) <= arr.get(mid)) {
            if (arr.get(low) <= k && k <= arr.get(mid)) {
               high = mid - 1;
            } else {
               low = mid + 1;
            }

         } else {
            if (arr.get(mid) <= k && k <= arr.get(high)) {
               low = mid + 1;
            } else {
               high = mid - 1;
            }
         }
      }
      return ans;
   }
}
