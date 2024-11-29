package practice.binarysearch;

import practice.utils.IntegerUtils;

public class MinimumDaysToMakeMBouquets {

   public int roseGarden(int[] arr, int r, int b) {
      if (arr.length < r * b) {
         return -1;
      }
      int low = IntegerUtils.findMin(arr);
      int high = IntegerUtils.findMax(arr);
      int minDays = -1;
      while (low <= high) {
         int middle = low + (high - low) / 2;
         if (possible(arr, middle, r, b)) {
            minDays = middle;
            high = middle - 1;
         } else {
            low = middle + 1;
         }
      }
      return minDays;
   }

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
