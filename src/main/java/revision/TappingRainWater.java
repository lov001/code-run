package revision;

public class TappingRainWater {

   public long getTrappedWater(long[] arr, int n) {
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
}
