package leetcode.arrays.problem274;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HIndexTest {


   HIndex classObj = new HIndex();

   @Test
   void test_hIndex_expect3_whenInputSizeIs5() {
      int[] input = {3, 0, 6, 1, 5};
      Assertions.assertEquals(3, classObj.hIndex(input));
   }

   @Test
   void test_hIndex_expect1_whenInputSizeIs3() {
      int[] input = {1, 3, 1};
      Assertions.assertEquals(1, classObj.hIndex(input));
   }
}
