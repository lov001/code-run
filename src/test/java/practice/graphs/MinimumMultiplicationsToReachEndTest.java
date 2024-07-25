package practice.graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumMultiplicationsToReachEndTest {

   MinimumMultiplicationsToReachEnd classObj = new MinimumMultiplicationsToReachEnd();

   @Test
   void test_minimumMultiplications_expect2_whenGivenArray() {
      int[] array = {2, 5, 7};
      Assertions.assertEquals(2, classObj.minimumMultiplications(array, 3, 30));
   }

   @Test
   void test_minimumMultiplications_expect4_whenGivenArray() {
      int[] array = {3, 4, 65};
      Assertions.assertEquals(4, classObj.minimumMultiplications(array, 7, 66175));
   }
}
