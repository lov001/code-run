package practice.binarysearch;

import practice.utils.IntegerUtils;

public class SmallestDivisor {

   public int smallestDivisor(int[] arr, int limit) {
      int smallestDivisor = -1;
      if (arr.length > limit) {
         return smallestDivisor;
      }
      int low = 1;
      int high = IntegerUtils.findMax(arr);
      while (low <= high) {
         int middle = low + (high - low) / 2;
         if (smallestDivisor(arr, middle, limit)) {
            smallestDivisor = middle;
            high = middle - 1;
         } else {
            low = middle + 1;
         }
      }
      return smallestDivisor;
   }

   public int smallestDivisorBruteForce(int[] arr, int limit) {
      int smallestDivisor = Integer.MAX_VALUE;
      int max = IntegerUtils.findMax(arr);
      for (int i = 1; i <= max; i++) {
         if (smallestDivisor(arr, i, limit)) {
            smallestDivisor = Math.min(smallestDivisor, i);
         }
      }
      return smallestDivisor;
   }

   private boolean smallestDivisor(int[] arr, int current, int limit) {
      int sum = 0;
      for (int number : arr) {
         double divisor = Math.ceil((double) number / current);
         sum += divisor;
      }
      return sum <= limit;
   }
}
