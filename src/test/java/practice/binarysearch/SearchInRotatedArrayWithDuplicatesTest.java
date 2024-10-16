package practice.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchInRotatedArrayWithDuplicatesTest {

   SearchInRotatedArrayWithDuplicates classObj = new SearchInRotatedArrayWithDuplicates();

   @Test
   public void test_search_expectTrue_whenTargetIs3() {
      int[] input = {6, 10, 1, 3, 5};
      Assertions.assertTrue(classObj.search(input, 3));
   }

   @Test
   public void test_search_expectTrue_whenTargetIs4() {
      int[] input = {3, 4, 5, 0, 0, 1, 2};
      Assertions.assertTrue(classObj.search(input, 4));
   }

   @Test
   public void test_search_expectFalse_whenTargetIs47() {
      int[] input = {31, 44, 56, 0, 10, 13};
      Assertions.assertFalse(classObj.search(input, 47));
   }
}
