package practice.binarysearch;

import java.util.ArrayList;

public class FirstAndLastOccurrencesOfElement {

   public int[] firstAndLastPositionUsingBinarySearch(ArrayList<Integer> arr, int n, int k) {
      int[] output = new int[2];
      int first = firstOccurrence(arr, k, n);
      if (first == -1) {
         output[0] = -1;
         output[1] = -1;
      } else {
         output[0] = first;
         output[1] = lastOccurrence(arr, k, n);
      }
      return output;
   }


   private int firstOccurrence(ArrayList<Integer> arr, int k, int n) {
      int low = 0;
      int high = n - 1;
      int ans = -1;
      while (high >= low) {
         int mid = low + (high - low) / 2;
         if (arr.get(mid) == k) {
            ans = mid;
            high = mid - 1;
         } else if (arr.get(mid) < k) {
            low = mid + 1;
         } else {
            high = mid - 1;
         }
      }
      return ans;
   }

   private int lastOccurrence(ArrayList<Integer> arr, int k, int n) {
      int low = 0;
      int high = n - 1;
      int ans = -1;
      while (high >= low) {
         int mid = low + (high - low) / 2;
         if (arr.get(mid) == k) {
            ans = mid;
            low = mid + 1;
         } else if (arr.get(mid) < k) {
            low = mid + 1;
         } else {
            high = mid - 1;
         }
      }
      return ans;
   }

   public int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
      int[] output = new int[2];
      int lb = lowerBound(arr, k, n);
      if (lb == n || arr.get(lb) != k) {
         output[0] = -1;
         output[1] = -1;
      } else {
         output[0] = lb;
         output[1] = upperBound(arr, k, n) - 1;
      }
      return output;
   }

   private int lowerBound(ArrayList<Integer> arr, int k, int n) {
      int low = 0;
      int high = n - 1;
      int ans = n;
      while (high >= low) {
         int mid = low + (high - low) / 2;
         if (arr.get(mid) >= k) {
            ans = mid;
            high = mid - 1;
         } else {
            low = mid + 1;
         }
      }
      return ans;
   }

   private int upperBound(ArrayList<Integer> arr, int k, int n) {
      int low = 0;
      int high = n - 1;
      int ans = n;
      while (high >= low) {
         int mid = low + (high - low) / 2;
         if (arr.get(mid) > k) {
            ans = mid;
            high = mid - 1;
         } else {
            low = mid + 1;
         }
      }
      return ans;
   }
}
