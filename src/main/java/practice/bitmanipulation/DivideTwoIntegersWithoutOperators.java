package practice.bitmanipulation;

public class DivideTwoIntegersWithoutOperators {

   public int divideTwoInteger(int dividend, int divisor) {
      if (dividend == divisor) {
         return 1;
      }

      boolean sign = dividend < 0 || divisor >= 0;
      if (dividend < 0 && divisor > 0) {
         sign = false;
      }
      int n = Math.abs(dividend);
      int d = Math.abs(divisor);
      int ans = 0;
      while (n >= d) {
         int count = 0;
         while (n >= (d << (count + 1))) {
            count++;
         }
         ans += (1 << count);
         n -= (d * (1 << count));
      }
      if (ans >= Math.pow(2, 31) && sign) {
         return Integer.MAX_VALUE;
      } else if (ans >= Math.pow(2, 31) && !sign) {
         return Integer.MIN_VALUE;
      }
      return sign ? ans : -1 * ans;
   }
}
