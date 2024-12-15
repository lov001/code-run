package practice.binarysearch;

public class FindPeakElementII {

   public int[] findPeakGrid(int[][] G) {
      int m = G[0].length;
      int low = 0;
      int high = m - 1;
      while (low <= high) {
         int mid = low + (high - low) / 2;
         int maxElementRow = findMaxIndex(mid, G);
         int maxElement = G[maxElementRow][mid];
         if (isPeakElement(maxElementRow, maxElement, mid, G)) {
            return new int[]{maxElementRow, mid};
         } else if (G[maxElementRow][mid - 1] < maxElement) {
            low = mid + 1;
         } else {
            high = mid - 1;
         }
      }
      return new int[]{-1, -1};
   }

   private boolean isPeakElement(int maxElementRow, int maxElement, int column, int[][] G) {
      int left = column - 1 >= 0 ? G[maxElementRow][column - 1] : -1;
      int right = column + 1 < G[0].length ? G[maxElementRow][column + 1] : -1;
      return left < maxElement && right < maxElement;
   }

   private int findMaxIndex(int column, int[][] G) {
      int max = Integer.MIN_VALUE;
      int index = -1;
      for (int i = 0; i < G.length; i++) {
         if (G[i][column] > max) {
            max = G[i][column];
            index = i;
         }
      }
      return index;
   }
}
