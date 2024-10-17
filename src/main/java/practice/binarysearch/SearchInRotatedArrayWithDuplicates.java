package practice.binarysearch;

public class SearchInRotatedArrayWithDuplicates {

   public boolean search(int[] arr, int k) {
      int low = 0;
      int high = arr.length - 1;
      int ans = -1;
      while (low <= high) {
         int mid = low + (high - low) / 2;
         if (arr[mid] == k) {
            ans = mid;
            break;
         } else if (arr[low] == arr[mid] && arr[low] == arr[high]) {
            low = low + 1;
            high = high - 1;
         } else if (arr[low] <= arr[mid]) {
            if (arr[low] <= k && k <= arr[mid]) {
               high = mid - 1;
            } else {
               low = mid + 1;
            }

         } else {
            if (arr[mid] <= k && k <= arr[high]) {
               low = mid + 1;
            } else {
               high = mid - 1;
            }
         }
      }
      return ans != -1;
   }
}
