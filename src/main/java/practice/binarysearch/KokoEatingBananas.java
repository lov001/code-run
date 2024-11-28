package practice.binarysearch;

public class KokoEatingBananas {

   public int minimumRateToEatBananas(int[] piles, int h) {
      int low = 1;
      int high = findMax(piles);
      while (low <= high) {
         int middle = (high + low) / 2;
         int timeTaken = calculateTotalHours(piles, middle);
         if (timeTaken <= h) {
            high = middle - 1;
         } else {
            low = middle + 1;
         }
      }
      return low;
   }

   private int findMax(int[] piles) {
      int max = Integer.MIN_VALUE;
      for (int pile : piles) {
         max = Math.max(max, pile);
      }
      return max;
   }

   private int calculateTotalHours(int[] piles, int k) {
      int timeTaken = 0;
      for (int pile : piles) {
         timeTaken += Math.ceil((double) pile / k);
      }
      return timeTaken;
   }
}
