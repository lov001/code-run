package practice.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RotateMatrixBy90Test {

   RotateMatrixBy90 classObj = new RotateMatrixBy90();

   @Test
   void test_rotateMatrixBruteForce_expectRotatedMatrix_whenNIs2AndMIs2() {
      int[][] input = {
         {1, 2},
         {3, 4}
      };
      int[][] output = {
         {3, 1},
         {4, 2}
      };
      classObj.rotateMatrixBruteForce(input);
      Assertions.assertArrayEquals(output, input);
   }

   @Test
   void test_rotateMatrix_expectRotatedMatrix_whenNIs2AndMIs2() {
      int[][] input = {
         {1, 2},
         {3, 4}
      };
      int[][] output = {
         {3, 1},
         {4, 2}
      };
      classObj.rotateMatrix(input);
      Assertions.assertArrayEquals(output, input);
   }
}
