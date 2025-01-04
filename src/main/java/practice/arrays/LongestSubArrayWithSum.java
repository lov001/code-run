package practice.arrays;

public class LongestSubArrayWithSum {

   public int longestSubArrayWithSumKWithPrefixSum(int[] a, long k) {
      int maxLength = 0;
      int n = a.length;
      for (int i = 0; i < n; i++) {
         long sum = 0;
         for (int j = i; j < n; j++) {
            sum += a[j];
            if (sum == k) {
               maxLength = Math.max(maxLength, j - i + 1);
            } else if (sum > k) {
               break;
            }
         }
      }
      return maxLength;
   }
}
