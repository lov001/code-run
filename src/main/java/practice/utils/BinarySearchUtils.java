package practice.utils;

import java.util.List;

public class BinarySearchUtils {

   public static int upperBound(int[] array, int number) {
      int n = array.length;
      int low = 0;
      int high = n - 1;
      int ans = n;
      while (low <= high) {
         int mid = low + (high - low) / 2;
         if (array[mid] > number) {
            ans = mid;
            high = mid - 1;
         } else {
            low = mid + 1;
         }
      }
      return ans;
   }

   public static int lowerBound(int[] array, int number) {
      int n = array.length;
      int low = 0;
      int high = n - 1;
      int ans = n;
      while (low <= high) {
         int mid = low + (high - low) / 2;
         if (array[mid] >= number) {
            ans = mid;
            high = mid - 1;
         } else {
            low = mid + 1;
         }
      }
      return ans;
   }

   public static int lowerBound(List<Integer> list, int number) {
      int n = list.size();
      int low = 0;
      int high = n - 1;
      int ans = n;
      while (low <= high) {
         int mid = low + (high - low) / 2;
         if (list.get(mid) >= number) {
            ans = mid;
            high = mid - 1;
         } else {
            low = mid + 1;
         }
      }
      return ans;
   }
}
