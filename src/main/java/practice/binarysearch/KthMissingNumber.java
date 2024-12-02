package practice.binarysearch;

import practice.utils.IntegerUtils;

public class KthMissingNumber {

   public int missingKBinarySearch(int[] array, int n, int k) {
      int low = 0;
      int high = n - 1;
      while (low <= high) {
         int middle = low + (high - low) / 2;
         int missing = array[middle] - (middle + 1);
         if (missing < k) {
            low = middle + 1;
         } else {
            high = middle - 1;
         }
      }
      /*
         Missing = array[high] - (high + 1)
         More = (k - missing)
         Answer = array[high] + more
       */
      return 1 + k + high;
   }

   public int missingKBruteForce2(int[] array, int n, int k) {
      for (int i = 0; i < n; i++) {
         if (array[i] <= k) {
            k++;
         } else {
            break;
         }
      }
      return k;
   }

   public int missingK(int[] array, int k) {
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
