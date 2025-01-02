package practice.arrays;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RightRotateArrayTest {

   RightRotateArray classObj = new RightRotateArray();

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
      output.add(1);
      output.add(1);
      output.add(7);
      output.add(5);
      output.add(2);
      output.add(11);
      output.add(2);
      output.add(43);
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
      output.add(6);
      output.add(7);
      output.add(8);
      output.add(5);
      Assertions.assertArrayEquals(new ArrayList[]{output},
         new ArrayList[]{classObj.rotateArray(input, 3)});
   }

   @Test
   void test_rotateArrayByK_expect8_whenKIs1() {
      ArrayList<Integer> input = new ArrayList<>();
      input.add(1);
      input.add(2);
      ArrayList<Integer> output = new ArrayList<>();
      output.add(2);
      output.add(1);
      Assertions.assertArrayEquals(new ArrayList[]{output},
         new ArrayList[]{classObj.rotateArray(input, 1)});
   }

   @Test
   void rotateArrayByKOptimised_expect5_whenKIs2() {
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
      output.add(1);
      output.add(1);
      output.add(7);
      output.add(5);
      output.add(2);
      output.add(11);
      output.add(2);
      output.add(43);

      Assertions.assertArrayEquals(new ArrayList[]{output},
         new ArrayList[]{classObj.rotateArrayOptimised(input, 2)});
   }

   @Test
   void test_rotateArrayByKOptimised_expect8_whenKIs3() {
      ArrayList<Integer> input = new ArrayList<>();
      input.add(5);
      input.add(6);
      input.add(7);
      input.add(8);
      ArrayList<Integer> output = new ArrayList<>();
      output.add(6);
      output.add(7);
      output.add(8);
      output.add(5);

      Assertions.assertArrayEquals(new ArrayList[]{output},
         new ArrayList[]{classObj.rotateArrayOptimised(input, 3)});
   }

   @Test
   void test_rotateArrayByKOptimised_expect8_whenKIs1() {
      ArrayList<Integer> input = new ArrayList<>();
      input.add(1);
      input.add(2);
      ArrayList<Integer> output = new ArrayList<>();
      output.add(2);
      output.add(1);
      Assertions.assertArrayEquals(new ArrayList[]{output},
         new ArrayList[]{classObj.rotateArrayOptimised(input, 1)});
   }
}
