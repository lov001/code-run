package practice.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindPeakElementIITest {

   FindPeakElementII classObj = new FindPeakElementII();

   @Test
   public void test_searchMatrix_expectTrue_whenNIs2MIs2() {
      int[][] input = {{8, 6}, {10, 1}};
      Assertions.assertArrayEquals(new int[]{1, 0}, classObj.findPeakGrid(input));
   }

   @Test
   public void test_searchMatrix_expectFalse_whenNIs3MIs3() {
      int[][] input = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
      Assertions.assertArrayEquals(new int[]{2, 2}, classObj.findPeakGrid(input));
   }
}
