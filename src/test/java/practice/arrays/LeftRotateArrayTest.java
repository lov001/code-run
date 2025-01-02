package practice.arrays;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeftRotateArrayTest {

   LeftRotateArray classObj = new LeftRotateArray();

   @Test
   void test_rotateArrayByOne_expect5_whenNIs5() {
      int[] input = {1, 2, 3, 4, 5};
      int[] output = {2, 3, 4, 5, 1};
      Assertions.assertArrayEquals(output, classObj.rotateArrayByOne(input, 5));
   }

   @Test
   void test_rotateArrayByOne_expect8_whenNIs6() {
      int[] input = {4, 7, 8, 6, 7, 6};
      int[] output = {7, 8, 6, 7, 6, 4};
      Assertions.assertArrayEquals(output, classObj.rotateArrayByOne(input, 6));
   }

   @Test
   void test_rotateArrayByK_expect5_whenKIs2() {
      ArrayList<Integer> input = new ArrayList<>();
      input.add(7);
      input.add(5);
      input.add(2);
      input.add(11);
      input.add(2);
      input.add(43);
      input.add(1);
      input.add(1);
      ArrayList<Integer> output = new ArrayList<>();
      output.add(2);
      output.add(11);
      output.add(2);
      output.add(43);
      output.add(1);
      output.add(1);
      output.add(7);
      output.add(5);
      Assertions.assertArrayEquals(new ArrayList[]{output},
         new ArrayList[]{classObj.rotateArray(input, 2)});
   }

   @Test
   void test_rotateArrayByK_expect8_whenKIs3() {
      ArrayList<Integer> input = new ArrayList<>();
      input.add(5);
      input.add(6);
      input.add(7);
      input.add(8);
      ArrayList<Integer> output = new ArrayList<>();
      output.add(8);
      output.add(5);
      output.add(6);
      output.add(7);
      Assertions.assertArrayEquals(new ArrayList[]{output},
         new ArrayList[]{classObj.rotateArray(input, 3)});
   }
}
