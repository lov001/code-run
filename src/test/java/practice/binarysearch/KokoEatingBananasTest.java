package practice.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KokoEatingBananasTest {

   KokoEatingBananas classObj = new KokoEatingBananas();

   @Test
   void test_minimumRateToEatBananas_expect4_whenHourIs8() {
      int[] input = {3, 6, 7, 11};
      Assertions.assertEquals(4, classObj.minimumRateToEatBananas(input, 8));
   }

   @Test
   void test_minimumRateToEatBananas_expect3_whenHourIs7() {
      int[] input = {3, 6, 2, 8};
      Assertions.assertEquals(3, classObj.minimumRateToEatBananas(input, 7));
   }

   @Test
   void test_minimumRateToEatBananas_expect25_whenHourIs5() {
      int[] input = {25, 12, 8, 14, 19};
      Assertions.assertEquals(25, classObj.minimumRateToEatBananas(input, 5));
   }

   @Test
   void test_minimumRateToEatBananas_expect5_whenHourIs8() {
      int[] input = {7, 15, 6, 3};
      Assertions.assertEquals(5, classObj.minimumRateToEatBananas(input, 8));
   }
}
