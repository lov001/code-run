package practice.binarysearch;

public class CeilAndFloor {

   public int[] getFloorAndCeil(int[] a, int n, int x) {
      int[] output = new int[2];
      int low = 0;
      int high = n - 1;
      int ceil = -1;

      output[1] = lowerBound(a, n, x);

      while (high >= low) {
         int mid = low + (high - low) / 2;
         if (a[mid] <= x) {
            ceil = a[mid];
            low = mid + 1;
         } else {
            high = mid - 1;
         }
      }
      output[0] = ceil;
      return output;
   }

   private int lowerBound(int[] arr, int n, int x) {
      int low = 0;
      int high = n - 1;
      int ans = -1;
      while (low <= high) {
         int mid = low + (high - low) / 2;
         if (arr[mid] >= x) {
            ans = arr[mid];
            high = mid - 1;
         } else {
            low = mid + 1;
         }
      }
      return ans;
   }
}
