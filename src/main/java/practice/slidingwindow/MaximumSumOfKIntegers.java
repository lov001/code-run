package practice.slidingwindow;

public class MaximumSumOfKIntegers {

   public int maxSumOfKIntegers(int[] arr, int k) {
      int n = arr.length;
      if (n < k) {
         // Not enough elements to calculate the sum
         return -1;
      }
      int maxSum = Integer.MIN_VALUE;
      for (int i = 0; i < n - k + 1; i++) {
         int currentSum = 0;
         for (int j = i; j < i + k; j++) {
            currentSum += arr[j];
         }
         maxSum = Math.max(maxSum, currentSum);
      }
      return maxSum;
   }
}
