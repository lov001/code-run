package practice.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumNumberOfPlatformsTest {

   MinimumNumberOfPlatforms classObj = new MinimumNumberOfPlatforms();

   @Test
   void test_calculateMinPlatforms_expect2_whenNIs4() {
      int[] arrival = {100, 200, 300, 400};
      int[] departure = {200, 300, 400, 500};
      Assertions.assertEquals(2, classObj.calculateMinPlatforms(arrival, departure, 4));
   }

   @Test
   void test_calculateMinPlatforms_expect3_whenNIs6() {
      int[] arrival = {900, 940, 950, 1100, 1500, 1800};
      int[] departure = {910, 1200, 1120, 1130, 1900, 2000};
      Assertions.assertEquals(3, classObj.calculateMinPlatforms(arrival, departure, 6));
   }

   @Test
   void test_calculateMinPlatforms_expect1_whenNIs2() {
      int[] arrival = {900, 1000};
      int[] departure = {999, 1100};
      Assertions.assertEquals(1, classObj.calculateMinPlatforms(arrival, departure, 2));
   }
}
