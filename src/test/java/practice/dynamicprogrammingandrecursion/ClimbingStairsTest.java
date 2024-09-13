package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClimbingStairsTest {

   ClimbingStairs classObj = new ClimbingStairs();

   @Test
   void test_climbStairs_expect2_whenNIs0(){
      Assertions.assertEquals(1, classObj.climbStairs(0));
   }

   @Test
   void test_climbStairs_expect2_whenNIs2(){
      Assertions.assertEquals(2, classObj.climbStairs(2));
   }

   @Test
   void test_climbStairs_expect3_whenNIs3(){
      Assertions.assertEquals(3, classObj.climbStairs(3));
   }

   @Test
   void test_climbStairs_expect3_whenNIs44(){
      Assertions.assertEquals(1134903170, classObj.climbStairs(44));
   }
}
