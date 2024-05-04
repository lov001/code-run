package leetcode.arrays.problem179;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LargestNumberTest {

   LargestNumber classObj = new LargestNumber();

   @Test
   void test_largestNumber_expect6054854654_whenArrayContains4Numbers() {
      int[] nums = {54, 546, 548, 60};
      Assertions.assertEquals("6054854654", classObj.largestNumber(nums));
   }

   @Test
   void test_largestNumber_expect210_whenArrayContains2Numbers() {
      int[] nums = {10, 2};
      Assertions.assertEquals("210", classObj.largestNumber(nums));
   }

   @Test
   void test_largestNumber_expect9534330_whenArrayContains5Numbers() {
      int[] nums = {3, 30, 34, 5, 9};
      Assertions.assertEquals("9534330", classObj.largestNumber(nums));
   }

   @Test
   void test_largestNumber_expect0_whenArrayContainsOnly0() {
      int[] nums = {0, 0};
      Assertions.assertEquals("0", classObj.largestNumber(nums));
   }

   @Test
   void test_largestNumber_expect270_whenArrayContainsOne0() {
      int[] nums = {27, 0};
      Assertions.assertEquals("270", classObj.largestNumber(nums));
   }

   @Test
   void test_largestNumber_expect6234100_whenArrayContainsOne0() {
      int[] nums = {62, 0, 34, 0, 1};
      Assertions.assertEquals("6234100", classObj.largestNumber(nums));
   }
}
