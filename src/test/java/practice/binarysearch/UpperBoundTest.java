package practice.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UpperBoundTest {

   UpperBound classObj = new UpperBound();

   @Test
   public void test_upperBound_expect2_whenTargetIs5() {
      int[] input = {2, 4, 6, 7};
      Assertions.assertEquals(2, classObj.upperBound(input, 4, 5));
   }

   @Test
   public void test_upperBound_expect3_whenTargetIs7AndSizeIs5() {
      int[] input = {1, 4, 7, 8, 10};
      Assertions.assertEquals(3, classObj.upperBound(input, 5, 7));
   }

   @Test
   public void test_upperBound_expect5_whenTargetIs10() {
      int[] input = {1, 2, 5, 6, 10};
      Assertions.assertEquals(5, classObj.upperBound(input, 5, 10));
   }
}
