package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KnapSackProblemTest {

   KnapSackProblem classObj = new KnapSackProblem();

   @Test
   void test_knapsack_expect13_whenNIs4AndMaxWeightIs5() {
      int[] weight = {1, 2, 4, 5};
      int[] value = {5, 4, 8, 6};
      Assertions.assertEquals(13, classObj.knapsack(weight, value, 4, 5));
   }
}
