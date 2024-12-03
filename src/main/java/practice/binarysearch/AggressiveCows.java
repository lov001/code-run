package practice.binarysearch;

import java.util.Arrays;

public class AggressiveCows {

   public int aggressiveCows(int[] stalls, int k) {
      Arrays.sort(stalls);
      int n = stalls.length;
      int limit = stalls[n - 1] - stalls[0];
      for (int i = 1; i <= limit; i++) {
         if (!canBePlaced(stalls, i, k)) {
            return (i - 1);
         }
      }
      return limit;
   }

   private boolean canBePlaced(int[] stalls, int distance, int k) {
      int cowsPlaced = 1;
      int lastCowPlacedAt = stalls[0];
      for (int i = 1; i < stalls.length; i++) {
         if (stalls[i] - lastCowPlacedAt >= distance) {
            cowsPlaced++;
            lastCowPlacedAt = stalls[i];
         }
      }
      return cowsPlaced >= k;
   }
}
