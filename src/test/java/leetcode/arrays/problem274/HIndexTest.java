package leetcode.arrays.problem274;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HIndexTest {


   HIndex classObj = new HIndex();

   @Test
   void test_hIndex_expect3_whenInputSizeIs5() {
      int[] input = {3, 0, 6, 1, 5};
      Assertions.assertEquals(3, classObj.hIndex(input));
   }

   @Test
   void test_hIndex_expect3_whenInputSizeIs5_() {
      int[] input = {1, 2, 4, 8, 9};
      Assertions.assertEquals(3, classObj.hIndex(input));
   }

   @Test
   void test_hIndex_expect2_whenInputSizeIs5() {
      int[] input = {0, 1, 2, 3, 4};
      Assertions.assertEquals(2, classObj.hIndex(input));
   }

   @Test
   void test_hIndex_expect3_whenInputSizeIs4() {
      int[] input = {1, 8, 9, 10};
      Assertions.assertEquals(3, classObj.hIndex(input));
   }

   @Test
   void test_hIndex_expect1_whenInputSizeIs3() {
      int[] input = {1, 3, 1};
      Assertions.assertEquals(1, classObj.hIndex(input));
   }

   @Test
   void test_hIndex_expect1_whenInputSizeIs1() {
      int[] input = {100};
      Assertions.assertEquals(1, classObj.hIndex(input));
   }
}
