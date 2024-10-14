package practice.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchInsertPositionTest {

   SearchInsertPosition classObj = new SearchInsertPosition();

   @Test
   public void test_searchInsert_expect3_whenTargetIs6() {
      int[] input = {1, 2, 4, 7};
      Assertions.assertEquals(3, classObj.searchInsert(input, 6));
   }

   @Test
   public void test_searchInsert_expect4_whenTargetIs9() {
      int[] input = {1, 2, 4, 7};
      Assertions.assertEquals(4, classObj.searchInsert(input, 9));
   }

   @Test
   public void test_searchInsert_expect0_whenTargetIs1() {
      int[] input = {2, 5, 7};
      Assertions.assertEquals(0, classObj.searchInsert(input, 1));
   }
}
