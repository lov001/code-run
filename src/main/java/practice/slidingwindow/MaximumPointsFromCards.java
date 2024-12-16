package practice.slidingwindow;

public class MaximumPointsFromCards {

   public int maxPoints(int[] arr, int K) {
      int leftSum = 0, rightSum = 0;
      int n = arr.length;
      for (int i = 0; i < K; i++) {
         leftSum += arr[i];
      }
      int maxPoints = leftSum;
      int rightIndex = n - 1;
      for (int i = K - 1; i >= 0; i--) {
         leftSum -= arr[i];
         rightSum += arr[rightIndex];
         rightIndex--;
         maxPoints = Math.max(maxPoints, leftSum + rightSum);
      }
      return maxPoints;
   }

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
