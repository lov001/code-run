package practice.binarysearch;

import java.util.ArrayList;

public class SingleElementInSortedArray {

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
