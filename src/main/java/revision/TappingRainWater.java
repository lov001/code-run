package revision;

public class TappingRainWater {

   public long getTrappedWater(long[] arr, int n) {
      if (n == 0) {
         return 0;
      }
      long peak = 0;
      long ans = 0;
      long peakVal = arr[0];

      // Moving left to right.
      for (int i = 0; i < n; i++) {
         if (arr[i] >= peakVal) {
            peak = i;
            peakVal = arr[i];
         }
      }

      // Initializing a min value.
      long maxSoFar = Long.MIN_VALUE;
      long countSubmerged = 0;
      long submergedArea = 0;

      // Traversing over a peak.
      for (int i = 0; i <= peak; i++) {
         if (arr[i] >= maxSoFar) {
            ans += (countSubmerged * maxSoFar - submergedArea);
            maxSoFar = arr[i];
            countSubmerged = 0;
            submergedArea = 0;
         } else {
            submergedArea += arr[i];
            countSubmerged++;
         }
      }

      maxSoFar = Long.MIN_VALUE;
      countSubmerged = 0;
      submergedArea = 0;

      // Moving right to left.
      for (int i = n - 1; i >= peak; i--) {
         if (arr[i] >= maxSoFar) {
            ans += (countSubmerged * maxSoFar - submergedArea);
            maxSoFar = arr[i];
            countSubmerged = 0;
            submergedArea = 0;
         } else {
            submergedArea += arr[i];
            countSubmerged++;
         }
      }
      return ans;
   }

   public long getTrappedWaterBruteForce(long[] arr, int n) {
      long maxTappedWater = 0;
      for (int i = 0; i < n; i++) {
         long maxLeftHeight = 0;
         for (int j = i; j >= 0; j--) {
            maxLeftHeight = Math.max(maxLeftHeight, arr[j]);
         }
         long maxRightHeight = 0;
         for (int j = i; j < n; j++) {
            maxRightHeight = Math.max(maxRightHeight, arr[j]);
         }
         maxTappedWater += Math.min(maxLeftHeight, maxRightHeight) - arr[i];
      }
      return maxTappedWater;
   }

   public long getTrappedWaterPreCompute(long[] arr, int n) {
      if (arr == null || arr.length == 0) {
         return 0;
      }
      long[] leftMax = new long[n];
      long[] rightMax = new long[n];

      leftMax[0] = arr[0];
      for (int i = 1; i < n; i++) {
         leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
      }
      rightMax[n - 1] = arr[n - 1];
      for (int i = n - 2; i >= 0; i--) {
         rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
      }
      long maxTappedWater = 0;
      for (int i = 0; i < n; i++) {
         maxTappedWater += Math.min(leftMax[i], rightMax[i]) - arr[i];
      }
      return maxTappedWater;
   }
}
