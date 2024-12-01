package practice.binarysearch;

import practice.utils.IntegerUtils;

public class DeliverShipmentInDDays {

   public int leastWeightCapacity(int[] weights, int d) {
      int leastCapacity = Integer.MAX_VALUE;
      int low = IntegerUtils.findMax(weights);
      int high = IntegerUtils.findSum(weights);
      for (int i = low; i <= high; i++) {
         if (possibleWithGivenCapacity(weights, i, d)) {
            leastCapacity = Math.min(i, leastCapacity);
         }
      }
      return leastCapacity;
   }

   private boolean possibleWithGivenCapacity(int[] weights, int capacity, int minDays) {
      int weight = 0;
      int days = 1;
      int i = 0;
      for (; i < weights.length; i++) {
         weight += weights[i];
         if (weight > capacity) {
            days++;
            weight = weights[i];
         }
      }
      return days <= minDays && i == weights.length;
   }
}
