package practice.dynamicprogrammingandrecursion;

public class FibonacciNumber {

   public int fib(int n) {
      return solve(n);
   }

   private int solve(int number) {
      if (number <= 1) {
         return number;
      }
      return solve(number - 1) + solve(number - 2);
   }

}
