package practice.binarysearch;

public class FindNumberOfRotations {

   public int findKRotation(int[] arr) {
      int[] ans = new int[2];
      int low = 0;
      int high = arr.length - 1;
      ans[0] = Integer.MAX_VALUE;
      ans[1] = Integer.MAX_VALUE;
      while (low <= high) {
         int mid = low + (high - low) / 2;
         if (arr[low] <= arr[high]) {
            if (arr[low] < ans[0]) {
               ans[0] = arr[low];
               ans[1] = low;
            }
            break;
         }
         if (arr[low] <= arr[mid]) {
            if (arr[low] < ans[0]) {
               ans[0] = arr[low];
               ans[1] = low;
            }
            low = mid + 1;
         } else {
            if (arr[mid] < ans[0]) {
               ans[0] = arr[mid];
               ans[1] = mid;
            }
            high = mid - 1;
         }
      }
      return ans[1];
   }
}
