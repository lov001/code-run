package practice.dynamicprogrammingandrecursion;

import java.util.Arrays;

public class LongestBitonicSequence {

   public int longestBitonicSequence(int[] arr, int n) {
      int[] dp1 = new int[n];
      Arrays.fill(dp1, 1);
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < i; j++) {
            if (arr[i] > arr[j] && (1 + dp1[j] > dp1[i])) {
               dp1[i] = 1 + dp1[j];
            }
         }
      }
      int[] dp2 = new int[n];
      Arrays.fill(dp2, 1);
      for (int i = n - 1; i >= 0; i--) {
         for (int j = n - 1; j >= i; j--) {
            if (arr[i] > arr[j] && (1 + dp2[j] > dp2[i])) {
               dp2[i] = 1 + dp2[j];
            }
         }
      }
      int max = 1;
      for (int i = 0; i < n; i++) {
         max = Math.max(max, dp1[i] + dp2[i] - 1);
      }

      return max;
   }
}
