package practice.binarysearch;

import java.util.ArrayList;
import java.util.Objects;

public class SingleElementInSortedArray {


   public int singleNonDuplicateOptimised(ArrayList<Integer> arr) {
      int n = arr.size();
      if (n == 1 || !Objects.equals(arr.get(0), arr.get(1))) {
         return arr.get(0);
      }
      if (!Objects.equals(arr.get(n - 1), arr.get(n - 2))) {
         return arr.get(n - 1);
      }
      int ans = -1;
      int low = 1;
      int high = n - 2;
      while (low <= high) {
         int mid = low + (high - low) / 2;
         if (!Objects.equals(arr.get(mid), arr.get(mid - 1)) && !Objects.equals(arr.get(mid),
            arr.get(mid + 1))) {
            return arr.get(mid);
         }
         if ((mid % 2 == 1 && Objects.equals(arr.get(mid), arr.get(mid - 1)))
            || mid % 2 == 0 && Objects.equals(arr.get(mid), arr.get(mid + 1))) {
            low = mid + 1;
         } else {
            high = mid - 1;
         }
      }
      return ans;
   }

   public int singleNonDuplicate(ArrayList<Integer> arr) {
      int n = arr.size();
      if (n == 1) {
         return arr.get(0);
      }
      int ans = -1;
      for (int i = 0; i < n; i++) {
         if (i == 0) {
            if (!arr.get(i).equals(arr.get(i + 1))) {
               ans = arr.get(i);
               break;
            }
         } else if (i == n - 1) {
            if (!arr.get(i).equals(arr.get(i - 1))) {
               ans = arr.get(i);
               break;
            }
         } else {
            if (!arr.get(i).equals(arr.get(i + 1)) && !arr.get(i).equals(arr.get(i - 1))) {
               ans = arr.get(i);
               break;
            }
         }
      }
      return ans;
   }
}
