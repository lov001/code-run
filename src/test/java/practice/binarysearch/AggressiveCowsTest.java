package practice.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AggressiveCowsTest {

   AggressiveCows classObj = new AggressiveCows();

   @Test
   void test_aggressiveCows_expect2_whenKIs2() {
      int[] input = {1, 2, 3};
      Assertions.assertEquals(2, classObj.aggressiveCows(input, 2));
   }

   @Test
   void test_aggressiveCows_expect3_whenKIs4() {
      int[] input = {0, 3, 4, 7, 10, 9};
      Assertions.assertEquals(3, classObj.aggressiveCows(input, 4));
   }

   @Test
   void test_aggressiveCows_expect5_whenKIs2() {
      int[] input = {4, 2, 1, 3, 6};
      Assertions.assertEquals(5, classObj.aggressiveCows(input, 2));
   }
}
