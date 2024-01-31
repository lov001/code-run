package practice.arraysandstrings;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ZeroMatrixTest {


   ZeroMatrix classObj = new ZeroMatrix();

   @Test
   void test_zeroMatrix_expectZeroedMatrix_when1() {
      int[][] input = {
          {1, 2, 3},
          {4, 0, 1},
          {0, 1, 1}
      };
      int[][] output = {
          {0, 0, 3},
          {0, 0, 0},
          {0, 0, 0}
      };
      classObj.zeroMatrix(input, 3, 3);
      Assertions.assertTrue(Arrays.deepEquals(output, input));
   }

}
