package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UnboundedKnapSackProblemTest {

   UnboundedKnapsack classObj = new UnboundedKnapsack();

   @Test
   void test_knapsack_expect27_whenNIs3AndMaxWeightIs10() {
      int[] weight = {2, 4, 6};
      int[] value = {5, 11, 13};
      Assertions.assertEquals(27, classObj.unboundedKnapsack(3, 10, value, weight));
      Assertions.assertEquals(27, classObj.unboundedKnapsackTabulation(3, 10, value, weight));
      Assertions.assertEquals(27, classObj.unboundedKnapsackSpaceOptimisation(3, 10, value, weight));
   }

   @Test
   void test_knapsack_expect21_whenNIs3AndMaxWeightIs15() {
      int[] weight = {5, 10, 20};
      int[] value = {7, 2, 4};
      Assertions.assertEquals(21, classObj.unboundedKnapsack(3, 15, value, weight));
      Assertions.assertEquals(21, classObj.unboundedKnapsackTabulation(3, 15, value, weight));
      Assertions.assertEquals(21, classObj.unboundedKnapsackSpaceOptimisation(3, 15, value, weight));
   }

   @Test
   void test_knapsack_expect0_whenNIs2AndMaxWeightIs0() {
      int[] weight = {4, 17};
      int[] value = {6, 12};
      Assertions.assertEquals(0, classObj.unboundedKnapsack(2, 3, value, weight));
      Assertions.assertEquals(0, classObj.unboundedKnapsackTabulation(2, 3, value, weight));
      Assertions.assertEquals(0, classObj.unboundedKnapsackSpaceOptimisation(2, 3, value, weight));
   }
}
