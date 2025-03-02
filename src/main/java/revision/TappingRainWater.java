package revision;

public class TappingRainWater {

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
