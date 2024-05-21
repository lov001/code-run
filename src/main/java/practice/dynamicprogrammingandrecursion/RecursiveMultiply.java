package practice.dynamicprogrammingandrecursion;

public class RecursiveMultiply {

   public int minProduct(int a, int b) {
      int smaller = Math.min(a, b);
      int bigger = Math.max(a, b);
      int[] memo = new int[smaller + 1];
      return minProductHelper(smaller, bigger, memo);
   }

   private int minProductHelper(int smaller, int bigger, int[] memo) {
      if (smaller == 0) {
         return 0;
      } else if (smaller == 1) {
         return bigger;
      } else if (memo[smaller] > 1) {
         return memo[smaller];
      }
      int s = smaller >> 1;
      int halfProd = minProduct(s, bigger);
      if (smaller % 2 == 0) {
         memo[smaller] = halfProd + halfProd;
      } else {
         memo[smaller] = halfProd + halfProd + bigger;
      }
      return memo[smaller];
   }
}
