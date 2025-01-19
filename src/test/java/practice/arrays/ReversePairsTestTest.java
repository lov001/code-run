package practice.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReversePairsTestTest {

   ReversePairs classObj = new ReversePairs();

   @Test
   void test_teamBruteForce_expect3_whenNIs5() {
      int[] input = {4, 1, 2, 3, 1};
      Assertions.assertEquals(3, classObj.teamBruteForce(input, 5));
   }

   @Test
   void test_teamBruteForce_expect2_whenNIs4() {
      int[] input = {100, 49, 201, 100};
      Assertions.assertEquals(2, classObj.teamBruteForce(input, 4));
   }
}
