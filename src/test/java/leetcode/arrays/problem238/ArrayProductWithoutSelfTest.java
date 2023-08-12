package leetcode.arrays.problem238;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayProductWithoutSelfTest {


   ArrayProductWithoutSelf classObj = new ArrayProductWithoutSelf();

   @Test
   void test_productExceptSelf_exceptProduct_whenGivenArray() {
      int[] input = {1, 2, 3, 4};
      int[] output = {24, 12, 8, 6};
      Assertions.assertEquals(Arrays.toString(output),
          Arrays.toString(classObj.productExceptSelf(input)));
   }

   @Test
   void test_productExceptSelf_exceptProduct_whenGivenArrayHasZero() {
      int[] input = {-1, 1, 0, -3, 3};
      int[] output = {0, 0, 9, 0, 0};
      Assertions.assertEquals(Arrays.toString(output),
          Arrays.toString(classObj.productExceptSelf(input)));
   }

   @Test
   void test_productExceptSelf_exceptProduct_whenGivenArrayHasAllZero() {
      int[] input = {0, 0};
      int[] output = {0, 0};
      Assertions.assertEquals(Arrays.toString(output),
          Arrays.toString(classObj.productExceptSelf(input)));
   }

   @Test
   void test_productExceptSelf_exceptProduct_whenGivenArrayHasOneZero() {
      int[] input = {1, 0};
      int[] output = {0, 1};
      Assertions.assertEquals(Arrays.toString(output),
          Arrays.toString(classObj.productExceptSelf(input)));
   }

   @Test
   void test_productExceptSelf_exceptProduct_whenGivenArrayContainsZeroZero() {
      int[] input = {2, 3, 0, 0};
      int[] output = {0, 0, 0, 0};
      Assertions.assertEquals(Arrays.toString(output),
          Arrays.toString(classObj.productExceptSelf(input)));
   }

   @Test
   void test_productExceptSelf_exceptProduct_whenGivenArray_() {
      int[] input = {0, 2, 3, 4};
      int[] output = {24, 0, 0, 0};
      Assertions.assertEquals(Arrays.toString(output),
          Arrays.toString(classObj.productExceptSelf(input)));
   }
}
