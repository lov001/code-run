package practice.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import practice.greedy.FractionalKnapsack.Pair;

public class FractionalKnapsackTest {

   FractionalKnapsack classObj = new FractionalKnapsack();

   @Test
   void test_maximumValue_expect380_whenNIs4AndWeightIs90() {
      Pair[] pairs = new Pair[4];
      pairs[0] = new Pair(100, 20);
      pairs[1] = new Pair(60, 10);
      pairs[2] = new Pair(100, 50);
      pairs[3] = new Pair(200, 50);
      Assertions.assertEquals(380.0, classObj.maximumValue(pairs, 4, 90));
   }
}
