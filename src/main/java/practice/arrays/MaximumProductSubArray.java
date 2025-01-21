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

   public int subArrayWithMaxProduct(int[] arr) {
      int n = arr.length;
      int maxProduct = Integer.MIN_VALUE;
      int prefix = 1;
      int suffix = 1;
      for (int i = 0; i < n; i++) {
         if (prefix == 0) prefix = 1;
         if (suffix == 0) suffix = 1;
         prefix *= arr[i];
         suffix *= arr[n - i - 1];
         maxProduct = Math.max(maxProduct, Math.max(prefix, suffix));
      }
      return maxProduct;
   }
}
