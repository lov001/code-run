package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LengthOfLongestIncreasingSubsequenceTest {

   LengthOfLongestIncreasingSubsequence classObj = new LengthOfLongestIncreasingSubsequence();

   @Test
   void test_longestIncreasingSubsequence_expect3_whenInputOfLength6() {
      int[] input = {5, 4, 11, 1, 16, 8};
      Assertions.assertEquals(3, classObj.longestIncreasingSubsequence(input));
   }

   @Test
   void test_longestIncreasingSubsequence_expect2_whenInputOfLength3() {
      int[] input = {1, 2, 2};
      Assertions.assertEquals(2, classObj.longestIncreasingSubsequence(input));
   }
}
