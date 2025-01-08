package practice.arrays;

public class AlternateNumbers {


   public int[] alternateNumbers(int[] a) {
      int n = a.length;
      int[] ans = new int[n];
      int negIndex = 1;
      int posIndex = 0;
      for (int element : a) {
         if (element < 0) {
            ans[negIndex] = element;
            negIndex += 2;
         } else {
            ans[posIndex] = element;
            posIndex += 2;
         }
      }
      return ans;
   }

   public int[] alternateNumbersBruteForce(int[] a) {
      int n = a.length;
      int[] positive = new int[n / 2];
      int[] negative = new int[n / 2];
      int negIndex = 0;
      int posIndex = 0;
      for (int element : a) {
         if (element < 0) {
            negative[negIndex++] = element;
         } else {
            positive[posIndex++] = element;
         }
      }
      for (int i = 0; i < n / 2; i++) {
         a[2 * i] = positive[i];
         a[2 * i + 1] = negative[i];
      }
      return a;
   }
}
