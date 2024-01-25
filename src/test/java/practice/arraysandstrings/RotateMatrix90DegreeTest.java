package practice.arraysandstrings;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RotateMatrix90DegreeTest {


   RotateMatrix90Degree classObj = new RotateMatrix90Degree();

   @Test
   void test_rotate_expectRotatedMatrix_when3x3Matrix() {
      int[][] input = {
          {1, 2, 3},
          {4, 5, 6},
          {7, 8, 9}
      };
      int[][] output = {
          {7, 4, 1},
          {8, 5, 2},
          {9, 6, 3}
      };
      Assertions.assertTrue(Arrays.deepEquals(output, classObj.rotate(input, 3, 3)));
   }

   @Test
   void test_rotate_expectRotatedMatrix_when4x4Matrix() {
      int[][] input = {
          {1, 2, 3, 4},
          {5, 6, 7, 8},
          {9, 10, 11, 12},
          {13, 14, 15, 16}
      };
      int[][] output = {
          {13, 9, 5, 1},
          {14, 10, 6, 2},
          {15, 11, 7, 3},
          {16, 12, 8, 4}
      };
      Assertions.assertTrue(Arrays.deepEquals(output, classObj.rotate(input, 4, 4)));
   }

}
