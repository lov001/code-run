package practice.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumDaysToMakeMBouquetsTest {

   MinimumDaysToMakeMBouquets classObj = new MinimumDaysToMakeMBouquets();

   @Test
   void test_roseGardenBruteForce_expect3_whenNoOfRoses3AndNoOfBouquets2() {
      int[] input = {1, 2, 1, 2, 7, 2, 2, 3, 1};
      Assertions.assertEquals(3, classObj.roseGardenBruteForce(input, 3, 2));
      Assertions.assertEquals(3, classObj.roseGarden(input, 3, 2));
   }

   @Test
   void test_roseGardenBruteForce_expect3_whenNoOfRoses3AndNoOfBouquets2_() {
      int[] input = {1, 2, 1, 2, 7, 2, 2, 3, 1};
      Assertions.assertEquals(3, classObj.roseGardenBruteForce(input, 3, 2));
      Assertions.assertEquals(3, classObj.roseGarden(input, 3, 2));
   }

   @Test
   void test_roseGardenBruteForce_expect1_whenNoOfRoses1AndNoOfBouquets1() {
      int[] input = {1, 1, 1, 1};
      Assertions.assertEquals(1, classObj.roseGardenBruteForce(input, 1, 1));
      Assertions.assertEquals(1, classObj.roseGarden(input, 1, 1));
   }
}
