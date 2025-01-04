package practice.arrays;

public class MaxConsecutiveOnes {

   public int consecutiveOnes(int n, int[] arr) {
      int max = Integer.MIN_VALUE;
      int count = 0;
      for (int i = 0; i < n; i++) {
         if (arr[i] == 1) {
            count++;
            max = Math.max(max, count);
         } else {
            count = 0;
         }
      }
      return max;
   }
}
