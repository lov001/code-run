package practice.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KthMissingNumberTest {

   KthMissingNumber classObj = new KthMissingNumber();

   @Test
   void test_missingK_expect1_whenKIs1() {
      int[] input = {4, 7, 9, 10};
      Assertions.assertEquals(1, classObj.missingK(input, 4, 1));
   }

   @Test
   void test_missingK_expect6_whenKIs3() {
      int[] input = {2, 4, 5, 7};
      Assertions.assertEquals(6, classObj.missingK(input, 4, 3));
   }

   @Test
   void test_missingK_expect5_whenKIs4() {
      int[] input = {4, 7, 9, 10};
      Assertions.assertEquals(5, classObj.missingK(input, 4, 4));
   }

   @Test
   void test_missingK_expect13_whenKIs3() {
      int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      Assertions.assertEquals(13, classObj.missingK(input, 10, 3));
   }
}
