package practice.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpiralMatrixTest {

   SpiralMatrix classObj = new SpiralMatrix();

   @Test
   void test_spiralMatrix_expectSpiralMatrix_whenNIs3AndMIs4() {
      int[][] input = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
      int[] expected = {1, 3, 5, 7, 20, 60, 34, 30, 23, 10, 11, 16};
      int[] actual = classObj.spiralMatrix(input);
      Assertions.assertArrayEquals(expected, actual);
   }
}
