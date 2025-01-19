package practice.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeTwoSortedArraysWithoutExtraSpaceTest {

   MergeTwoSortedArraysWithoutExtraSpace classObj = new MergeTwoSortedArraysWithoutExtraSpace();

   @Test
   void test_sortedArray_expectListOfSize6_whenNIs5AndMIs3() {
      long[] a = {1, 2, 3, 4, 6};
      long[] b = {2, 3, 5};
      classObj.mergeTwoSortedArraysWithoutExtraSpace(a, b);
      Assertions.assertEquals(1, a[0]);
      Assertions.assertEquals(2, a[1]);
      Assertions.assertEquals(2, a[2]);
      Assertions.assertEquals(3, a[3]);
      Assertions.assertEquals(3, a[4]);
      Assertions.assertEquals(4, b[0]);
      Assertions.assertEquals(5, b[1]);
      Assertions.assertEquals(6, b[2]);
   }
}
