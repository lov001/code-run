package practice.slidingwindow;

public class MaximumPointsFromCards {

   public int maxPointsBruteForce(int[] arr, int K) {
      int left = K, right = 0;
      int maxPoints = Integer.MIN_VALUE;
      int n = arr.length;
      while (left >= 0 && right <= K) {
         int sum = 0;
         for (int i = 0; i < left; i++) {
            sum += arr[i];
         }
         for (int i = n - right; i < n; i++) {
            sum += arr[i];
         }
         maxPoints = Math.max(maxPoints, sum);
         left--;
         right++;
      }
      return maxPoints;
   }
}
