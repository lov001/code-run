package practice.binarysearch;

import static practice.utils.BinarySearchUtils.upperBound;

public class MedianInRowWiseSortedMatrix {

   public int findMedian(int[][] matrix, int m, int n) {
      int low = Integer.MAX_VALUE;
      int high = Integer.MIN_VALUE;
      for (int i = 0; i < m; i++) {
         low = Math.min(low, matrix[i][0]);
         high = Math.max(high, matrix[i][n - 1]);
      }
      int req = (m * n) / 2;
      while (low <= high) {
         int mid = (low + high) / 2;
         int smallestEqual = countSmallEqual(matrix, m, mid);
         if (smallestEqual <= req) {
            low = mid + 1;
         } else {
            high = mid - 1;
         }
      }
      return low;
   }

   private int countSmallEqual(int[][] matrix, int m, int mid) {
      int count = 0;
      for (int i = 0; i < m; i++) {
         count += upperBound(matrix[i], mid);
      }
      return count;
   }
}
