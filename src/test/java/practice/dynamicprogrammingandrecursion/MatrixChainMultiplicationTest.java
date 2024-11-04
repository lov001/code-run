package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MatrixChainMultiplicationTest {

   MatrixChainMultiplication classObj = new MatrixChainMultiplication();

   @Test
   void test_matrixMultiplication_expect70_whenNIs4() {
      int[] input = {4, 5, 3, 2};
      Assertions.assertEquals(70, classObj.matrixMultiplication(input, 4));
   }

   @Test
   void test_matrixMultiplication_expect8000_whenNIs4() {
      int[] input = {10, 15, 20, 25};
      Assertions.assertEquals(8000, classObj.matrixMultiplication(input, 4));
   }

   @Test
   void test_matrixMultiplication_expect18_whenNIs4() {
      int[] input = {1, 4, 3, 2};
      Assertions.assertEquals(18, classObj.matrixMultiplication(input, 4));
   }
}
