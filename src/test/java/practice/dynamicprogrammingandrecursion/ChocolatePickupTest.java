package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChocolatePickupTest {

   ChocolatePickup classObj = new ChocolatePickup();

   @Test
   void test_maximumChocolates_expect21_when3x4Grid() {
      int[][] grid = {
         {2, 3, 1, 2},
         {3, 4, 2, 2},
         {5, 6, 3, 5}
      };
      Assertions.assertEquals(21, classObj.maximumChocolates(3, 4, grid));
      Assertions.assertEquals(21, classObj.maximumChocolatesTabulation(3, 4, grid));
   }

   @Test
   void test_maximumChocolates_expect5_when2x2Grid() {
      int[][] grid = {
         {1, 1},
         {1, 2},
      };
      Assertions.assertEquals(5, classObj.maximumChocolates(2, 2, grid));
      Assertions.assertEquals(5, classObj.maximumChocolatesTabulation(2, 2, grid));
   }

   @Test
   void test_maximumChocolates_expect23_when2x2Grid() {
      int[][] grid = {
         {3, 7},
         {7, 6},
      };
      Assertions.assertEquals(23, classObj.maximumChocolates(2, 2, grid));
      Assertions.assertEquals(23, classObj.maximumChocolatesTabulation(2, 2, grid));
   }

   @Test
   void test_maximumChocolates_expect25_when3x2Grid() {
      int[][] grid = {
         {4, 5},
         {3, 7},
         {4, 2},
      };
      Assertions.assertEquals(25, classObj.maximumChocolates(3, 2, grid));
      Assertions.assertEquals(25, classObj.maximumChocolatesTabulation(3, 2, grid));
   }
}
