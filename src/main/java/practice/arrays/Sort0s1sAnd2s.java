package practice.arrays;

import java.util.ArrayList;

public class Sort0s1sAnd2s {

   public void sortArray(ArrayList<Integer> arr, int n) {
      int low = 0;
      int mid = 0;
      int high = n - 1;
      while (mid <= high) {
         if (arr.get(mid) == 0) {
            int temp = arr.get(low);
            arr.set(low, arr.get(mid));
            arr.set(mid, temp);
            low++;
            mid++;
         } else if (arr.get(mid) == 1) {
            mid++;
         } else {
            int temp = arr.get(high);
            arr.set(high, arr.get(mid));
            arr.set(mid, temp);
            high--;
         }
      }
   }
}
