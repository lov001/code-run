package practice.binarysearch;

import java.util.ArrayList;

public class FindPeakElement {

   public int findPeakElement(ArrayList<Integer> arr) {
      int length = arr.size();
      if (length == 1 || arr.get(0) > arr.get(1)) {
         return arr.get(0);
      }
      if (arr.get(length - 1) > arr.get(length - 2)) {
         return arr.get(length - 1);
      }
      int low = 1;
      int high = length - 2;
      int ans = -1;
      while (low <= high) {
         int mid = low + (high - low) / 2;
         if (arr.get(mid - 1) < arr.get(mid) && arr.get(mid) > arr.get(mid + 1)) {
            ans = arr.get(mid);
            break;
         } else if (arr.get(mid - 1) < arr.get(mid)) {
            low = mid + 1;
         } else {
            high = mid - 1;
         }
      }
      return ans;
   }
}
