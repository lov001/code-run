package practice.dynamicprogrammingandrecursion;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestIncreasingSubsequenceTest {

   LongestIncreasingSubsequence classObj = new LongestIncreasingSubsequence();

   @Test
   void test_longestIncreasingSubsequence_expect3_whenInputOfLength6() {
      int[] input = {5, 4, 11, 1, 16, 8};
      List<Integer> expected = List.of(5, 11, 16);
      List<Integer> actual = classObj.longestIncreasingSubsequenceOptimised(input);
      Assertions.assertArrayEquals(expected.toArray(), actual.toArray());
   }

   @Test
   void test_longestIncreasingSubsequence_expect2_whenInputOfLength3() {
      int[] input = {1, 2, 2};
      List<Integer> expected = List.of(1, 2);
      Assertions.assertArrayEquals(new List[]{expected},
         new List[]{classObj.longestIncreasingSubsequenceOptimised(input)});
   }
}
