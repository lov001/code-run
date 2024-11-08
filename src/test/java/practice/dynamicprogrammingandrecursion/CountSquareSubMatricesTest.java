package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountSquareSubMatricesTest {

   CountSquareSubMatrices classObj = new CountSquareSubMatrices();

   @Test
   void test_countSquares_expect5_when2x2Matrix() {
      int[][] input = {
         {1, 1},
         {1, 1}
      };
      Assertions.assertEquals(5, classObj.countSquares(2, 2, input));
   }

   @Test
   void test_countSquares_expect2_when2x2Matrix() {
      int[][] input = {
         {1, 0},
         {0, 1}
      };
      Assertions.assertEquals(2, classObj.countSquares(2, 2, input));
   }

   @Test
   void test_countSquares_expect7_when3x4Matrix() {
      int[][] input = {
         {0, 1, 1, 0},
         {1, 1, 1, 0},
         {0, 0, 1, 0}
      };
      Assertions.assertEquals(7, classObj.countSquares(3, 4, input));
   }
}
