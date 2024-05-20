package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TripleStepTest {

   TripleStep classObj = new TripleStep();

   @Test
   void test_countWays_expect1_whenNoOfStepsIs1() {
      Assertions.assertEquals(1, classObj.countWaysBruteForce(1));
      Assertions.assertEquals(1, classObj.countWaysOptimal(1));
   }

   @Test
   void test_countWays_expect2_whenNoOfStepsIs2() {
      Assertions.assertEquals(2, classObj.countWaysBruteForce(2));
      Assertions.assertEquals(2, classObj.countWaysOptimal(2));
   }

   @Test
   void test_countWays_expect13_whenNoOfStepsIs5() {
      Assertions.assertEquals(13, classObj.countWaysBruteForce(5));
      Assertions.assertEquals(13, classObj.countWaysOptimal(5));
   }
}
