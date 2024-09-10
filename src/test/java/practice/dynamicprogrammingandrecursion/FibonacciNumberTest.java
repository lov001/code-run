package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciNumberTest {

   FibonacciNumber classObj = new FibonacciNumber();

   @Test
   void test_fib_expect1_whenNIs2() {
      Assertions.assertEquals(1, classObj.fib(2, "recursion"));
      Assertions.assertEquals(1, classObj.fib(2, "memoization"));
      Assertions.assertEquals(1, classObj.fib(2, "tabulation"));
   }

   @Test
   void test_fib_expect2_whenNIs3() {
      Assertions.assertEquals(2, classObj.fib(3, "recursion"));
      Assertions.assertEquals(2, classObj.fib(3, "memoization"));
      Assertions.assertEquals(2, classObj.fib(3, "tabulation"));
   }

   @Test
   void test_fib_expect3_whenNIs4() {
      Assertions.assertEquals(3, classObj.fib(4, "recursion"));
      Assertions.assertEquals(3, classObj.fib(4, "memoization"));
      Assertions.assertEquals(3, classObj.fib(4, "tabulation"));
   }
}
