package practice.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LowerBoundTest {

   LowerBound classObj = new LowerBound();

   @Test
   public void test_lowerBound_expect0_whenTargetIs0() {
      int[] input = {1, 2, 2, 3};
      Assertions.assertEquals(0, classObj.lowerBound(input, 4, 0));
   }

   @Test
   public void test_lowerBound_expect0_whenTargetIs0AndSizeIs6() {
      int[] input = {1, 2, 2, 3, 3, 5};
      Assertions.assertEquals(0, classObj.lowerBound(input, 6, 0));
   }

   @Test
   public void test_lowerBound_expect6_whenTargetIs7() {
      int[] input = {1, 2, 2, 3, 3, 5};
      Assertions.assertEquals(6, classObj.lowerBound(input, 6, 7));
   }
}
