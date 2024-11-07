package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumRectangleAreaTest {

   MaximumRectangleArea classObj = new MaximumRectangleArea();

   @Test
   void test_maximalAreaOfSubMatrixOfAll1_expect4_when2x2Matrix() {
      int[][] input = {
         {1, 1},
         {1, 1}
      };
      Assertions.assertEquals(4, classObj.maximalAreaOfSubMatrixOfAll1(input, 2, 2));
   }

   @Test
   void test_maximalAreaOfSubMatrixOfAll1_expect5_when5x4Matrix() {
      int[][] input = {
         {1, 0, 1, 1},
         {1, 0, 1, 1},
         {0, 1, 0, 1},
         {1, 1, 1, 1},
         {0, 0, 0, 1},
      };
      Assertions.assertEquals(5, classObj.maximalAreaOfSubMatrixOfAll1(input, 5, 4));
   }

   @Test
   void test_maximalAreaOfSubMatrixOfAll1_expect1_when2x2Matrix() {
      int[][] input = {
         {1, 0},
         {0, 1}
      };
      Assertions.assertEquals(1, classObj.maximalAreaOfSubMatrixOfAll1(input, 2, 2));
   }

   @Test
   void test_maximalAreaOfSubMatrixOfAll1_expect8_when4x4Matrix() {
      int[][] input = {
         {1, 1, 1, 1},
         {1, 1, 1, 1},
         {0, 1, 0, 1},
         {0, 0, 1, 1},
         {0, 0, 1, 1},
      };
      Assertions.assertEquals(8, classObj.maximalAreaOfSubMatrixOfAll1(input, 4, 4));
   }
}
