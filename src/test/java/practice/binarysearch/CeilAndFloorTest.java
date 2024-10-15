package practice.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CeilAndFloorTest {

   CeilAndFloor classObj = new CeilAndFloor();

   @Test
   public void test_getFloorAndCeil_expect4_whenTargetIs5() {
      int[] input = {3, 4, 7, 8, 8, 10};
      int[] expected = {4};
      int[] actual = classObj.getFloorAndCeil(input, 6, 5);
      Assertions.assertEquals(expected[0], actual[0]);
   }

   @Test
   public void test_getFloorAndCeil_expect8And8_whenTargetIs8() {
      int[] input = {3, 4, 4, 7, 8, 10};
      int[] expected = {8, 8};
      int[] actual = classObj.getFloorAndCeil(input, 6, 8);
      Assertions.assertArrayEquals(expected, actual);
   }

   @Test
   public void test_getFloorAndCeil_expect1And3_whenTargetIs2() {
      int[] input = {3, 4, 4, 7, 8, 10};
      int[] expected = {-1, 3};
      int[] actual = classObj.getFloorAndCeil(input, 6, 2);
      Assertions.assertArrayEquals(expected, actual);
   }
}
