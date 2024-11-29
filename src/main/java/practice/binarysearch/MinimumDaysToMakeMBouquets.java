package practice.binarysearch;

import practice.utils.IntegerUtils;

public class MinimumDaysToMakeMBouquets {

   public int roseGardenBruteForce(int[] arr, int r, int b) {
      int minDays = Integer.MAX_VALUE;
      int low = IntegerUtils.findMin(arr);
      int high = IntegerUtils.findMax(arr);
      for (int i = low; i <= high; i++) {
         if (possible(arr, i, r, b)) {
            minDays = Math.min(minDays, i);
         }
      }
      return minDays == Integer.MAX_VALUE ? -1 : minDays;
   }

   private boolean possible(int[] arr, int day, int r, int b) {
      int count = 0;
      int numberOfBouquets = 0;
      for (int j : arr) {
         if (j <= day) {
            count++;
         } else {
            numberOfBouquets += (count / r);
            count = 0;
         }
      }
      numberOfBouquets += (count / r);
      return numberOfBouquets >= b;
   }
}
