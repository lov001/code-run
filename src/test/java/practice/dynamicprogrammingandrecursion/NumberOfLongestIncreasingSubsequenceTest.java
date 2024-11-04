package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfLongestIncreasingSubsequenceTest {

   NumberOfLongestIncreasingSubsequence classObj = new NumberOfLongestIncreasingSubsequence();

   @Test
   void test_findNumberOfLIS_expect2_whenInputOfLength5() {
      int[] input = {50, 3, 90, 60, 80};
      Assertions.assertEquals(2, classObj.findNumberOfLIS(input));
   }

   @Test
   void test_findNumberOfLIS_expect1_whenInputOfLength4() {
      int[] input = {3, 7, 4, 6};
      Assertions.assertEquals(1, classObj.findNumberOfLIS(input));
   }

   @Test
   void test_findNumberOfLIS_expect2_whenInputOfLength4() {
      int[] input = {5, 7, 2, 3};
      Assertions.assertEquals(2, classObj.findNumberOfLIS(input));
   }
}
