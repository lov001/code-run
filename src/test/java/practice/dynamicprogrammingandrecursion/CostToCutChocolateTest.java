package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CostToCutChocolateTest {

   CostToCutChocolate classObj = new CostToCutChocolate();

   @Test
   void test_cost_expect7_whenNIs4AndCIs2() {
      int[] input = {1, 3};
      Assertions.assertEquals(7, classObj.cost(4, 2, input));
   }

   @Test
   void test_cost_expect10_whenNIs5AndCIs3() {
      int[] input = {1, 3, 4};
      Assertions.assertEquals(10, classObj.cost(5, 3, input));
   }

   @Test
   void test_cost_expect23_whenNIs10AndCIs4() {
      int[] input = {1, 3, 4, 7};
      Assertions.assertEquals(23, classObj.cost(10, 4, input));
   }

   @Test
   void test_cost_expect13_whenNIs10AndCIs2() {
      int[] input = {1, 3};
      Assertions.assertEquals(13, classObj.cost(10, 2, input));
   }
}
