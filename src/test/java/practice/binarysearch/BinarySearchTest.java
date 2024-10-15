package practice.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {

   BinarySearch classObj = new BinarySearch();

   @Test
   public void test_searchIterative_expect1_whenTargetIs3() {
      int[] input = {1, 3, 7, 9, 11, 12, 45};
      Assertions.assertEquals(1, classObj.searchIterative(input, 3));
      Assertions.assertEquals(1, classObj.searchRecursive(input, 3));
   }

   @Test
   public void test_searchIterative_expectMinus1_whenTargetIs9() {
      int[] input = {1, 2, 3, 4, 5, 6, 7};
      Assertions.assertEquals(-1, classObj.searchIterative(input, 9));
      Assertions.assertEquals(-1, classObj.searchRecursive(input, 9));
   }

   @Test
   public void test_searchIterative_expect0_whenTargetIs1() {
      int[] input = {1, 3, 7, 9, 11, 12, 45};
      Assertions.assertEquals(0, classObj.searchIterative(input, 1));
      Assertions.assertEquals(0, classObj.searchRecursive(input, 1));
   }
}
