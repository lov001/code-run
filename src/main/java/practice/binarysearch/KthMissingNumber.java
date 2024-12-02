package practice.binarysearch;

import practice.utils.IntegerUtils;

public class KthMissingNumber {

   public int missingK(int[] array, int n, int k) {
      int low = 1;
      int high = IntegerUtils.findMax(array);
      int index = 0;
      for (; low <= high; low++) {
         if (low == array[index]) {
            index++;
         } else {
            k--;
         }
         if (k == 0) {
            break;
         }
      }
      while (k != 0) {
         k--;
         if (k == 0) {
            break;
         }
         low++;
      }
      return low;
   }
}
