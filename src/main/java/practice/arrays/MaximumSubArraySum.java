package practice.arrays;

public class MaximumSubArraySum {

   public long maxSubArraySumUsingKadaneAlgorithm(int[] arr, int n) {
      long maxSum = Integer.MIN_VALUE;
      long sum = 0;
      int start = -1;
      int ansStart = -1;
      int ansEnd = -1;
      for (int j = 0; j < n; j++) {
         if (sum == 0) {
            start = j;
         }
         sum += arr[j];
         if (sum > maxSum) {
            maxSum = sum;
            ansStart = start;
            ansEnd = j;
         }
         if (sum < 0) {
            sum = 0;
         }
      }
      for (int i = ansStart; i <= ansEnd; i++) {
         System.out.print(arr[i] + " ");
      }
      System.out.println();
      return Math.max(maxSum, 0);
   }

   public long maxSubArraySum(int[] arr, int n) {
      long maxSum = Integer.MIN_VALUE;
      for (int i = 0; i < n; i++) {
         long sum = 0;
         for (int j = i; j < n; j++) {
            sum += arr[j];
            maxSum = Math.max(maxSum, sum);
         }
      }
      return maxSum < 0 ? 0 : maxSum;
   }
}
