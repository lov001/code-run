package practice.binarysearch;


public class CountOccurrencesOfElement {

   public int count(int[] arr, int n, int x) {
      int[] output = new int[2];
      int first = firstOccurrence(arr, x, n);
      if (first == -1) {
         return 0;
      } else {
         output[0] = first;
         output[1] = lastOccurrence(arr, x, n);
      }
      return output[1] - output[0] + 1;
   }


   private int firstOccurrence(int[] arr, int k, int n) {
      int low = 0;
      int high = n - 1;
      int ans = -1;
      while (high >= low) {
         int mid = low + (high - low) / 2;
         if (arr[mid] == k) {
            ans = mid;
            high = mid - 1;
         } else if (arr[mid] < k) {
            low = mid + 1;
         } else {
            high = mid - 1;
         }
      }
      return ans;
   }

   private int lastOccurrence(int[] arr, int k, int n) {
      int low = 0;
      int high = n - 1;
      int ans = -1;
      while (high >= low) {
         int mid = low + (high - low) / 2;
         if (arr[mid] == k) {
            ans = mid;
            low = mid + 1;
         } else if (arr[mid] < k) {
            low = mid + 1;
         } else {
            high = mid - 1;
         }
      }
      return ans;
   }
}
