package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestBitonicSubsequenceTest {

   LongestBitonicSequence classObj = new LongestBitonicSequence();

   @Test
   void test_longestBitonicSequence_expect3_whenInputOfLength5() {
      int[] input = {1, 2, 1, 2, 1};
      Assertions.assertEquals(3, classObj.longestBitonicSequence(input, 4));
   }

   @Test
   void test_longestBitonicSequence_expect4_whenInputOfLength5() {
      int[] input = {1 ,2 ,1 ,3, 4};
      Assertions.assertEquals(4, classObj.longestBitonicSequence(input, 5));
   }
}
