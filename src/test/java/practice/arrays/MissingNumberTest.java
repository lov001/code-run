package practice.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MissingNumberTest {

   MissingNumber classObj = new MissingNumber();

   @Test
   void test_missingNumber_expect3_whenNIs5() {
      int[] input = {1, 2, 4, 5};
      Assertions.assertEquals(3, classObj.missingNumber(input, 5));
   }

   @Test
   void test_missingNumber_expect4_whenNIs4() {
      int[] input = {1, 2, 3};
      Assertions.assertEquals(4, classObj.missingNumber(input, 4));
   }

   @Test
   void test_missingNumber_expect4_whenNIs8() {
      int[] input = {1, 2, 3, 5, 6, 7, 8};
      Assertions.assertEquals(4, classObj.missingNumber(input, 8));
   }
}
