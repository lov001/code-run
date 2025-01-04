package practice.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestSubArrayWithSumTest {

   LongestSubArrayWithSum classObj = new LongestSubArrayWithSum();

   @Test
   void test_longestSubArrayWithSumK_expect3_whenNIs7AndKis3() {
      int[] input = {1, 2, 3, 1, 1, 1, 1};
      Assertions.assertEquals(3, classObj.longestSubArrayWithSumKWithPrefixSum(input, 3));
   }

   @Test
   void test_longestSubArrayWithSumK_expect1_whenNIs5AndKis2() {
      int[] input = {2, 2, 4, 1, 2};
      Assertions.assertEquals(1, classObj.longestSubArrayWithSumKWithPrefixSum(input, 2));
   }
}
