package practice.arrays;

public class MaximumProductSubArray {

   public int subArrayWithMaxProductBruteForce(int[] arr) {
      int n = arr.length;
      int maxProduct = arr[0];
      for (int i = 0; i < n - 1; i++) {
         int product = arr[i];
         for (int j = i + 1; j < n; j++) {
            maxProduct = Math.max(maxProduct, product);
            product *= arr[j];
         }
         maxProduct = Math.max(maxProduct, product);
      }
      return maxProduct;
   }
}
