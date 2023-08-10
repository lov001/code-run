package leetcode.searching.binarysearch.problem81;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchInRotatedArrayIITest {


   SearchInRotatedArrayII classObj = new SearchInRotatedArrayII();

   @Test
   void test_search_expectTrue_whenTargetIs0() {
      int[] input = {2, 5, 6, 0, 0, 1, 2};
      Assertions.assertTrue(classObj.search(input, 0));
   }

   @Test
   void test_search_expectFalse_whenTargetIs3() {
      int[] input = {2, 5, 6, 0, 0, 1, 2};
      Assertions.assertFalse(classObj.search(input, 3));
   }

   @Test
   void test_search_expectTrue_whenTargetIs0_() {
      int[] input = {1, 0, 1, 1, 1};
      Assertions.assertTrue(classObj.search(input, 0));
   }

   @Test
   void test_search_expectTrue_whenTargetIs2_() {
      int[] input = {1, 2, 1, 1, 1};
      Assertions.assertTrue(classObj.search(input, 2));
   }

   @Test
   void test_search_expectTrue_whenTargetIs2() {
      int[] input = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1};
      Assertions.assertTrue(classObj.search(input, 2));
   }

}
