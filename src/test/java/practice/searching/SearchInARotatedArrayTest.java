package practice.searching;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchInARotatedArrayTest {

   SearchInRotatedArray classObj = new SearchInRotatedArray();

   @Test
   void test_search_expect8_whenElementToBeSearchedIsInRightSide() {
      int[] input = {15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14};
      Assertions.assertEquals(8, classObj.search(input, 0, 11, 5));
   }

   @Test
   void test_search_expect5_whenElementToBeSearchedIsMiddle() {
      int[] input = {15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14};
      Assertions.assertEquals(5, classObj.search(input, 0, 11, 1));
   }

   @Test
   void test_search_expect1_whenElementToBeSearchedIsInLeftSide() {
      int[] input = {15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14};
      Assertions.assertEquals(1, classObj.search(input, 0, 11, 16));
   }
}
