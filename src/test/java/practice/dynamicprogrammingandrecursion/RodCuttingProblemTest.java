package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RodCuttingProblemTest {

   RodCuttingProblem classObj = new RodCuttingProblem();

   @Test
   void test_cutRod_expect12_whenNIs5() {
      int[] price = {2, 5, 7, 8, 10};
      Assertions.assertEquals(12, classObj.cutRod(price, 5));
   }

   @Test
   void test_cutRod_expect24_whenNIs8() {
      int[] price = {3, 5, 8, 9, 10, 17, 17, 20};
      Assertions.assertEquals(24, classObj.cutRod(price, 8));
   }

   @Test
   void test_cutRod_expect18_whenNIs6() {
      int[] price = {3, 5, 6, 7, 10, 12};
      Assertions.assertEquals(18, classObj.cutRod(price, 6));
   }
}
