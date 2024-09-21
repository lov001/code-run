package practice.dynamicprogrammingandrecursion;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumSumOfNonAdjacentElementsTest {

   MaximumSumOfNonAdjacentElements classObj = new MaximumSumOfNonAdjacentElements();

   @Test
   void test_maximumNonAdjacentSum_expect5_whenInputSizeIs3() {
      ArrayList<Integer> input = new ArrayList<>();
      input.add(1);
      input.add(2);
      input.add(4);
      Assertions.assertEquals(5, classObj.maximumNonAdjacentSum(input));
   }

   @Test
   void test_maximumNonAdjacentSum_expect11_whenInputSizeIs4() {
      ArrayList<Integer> input = new ArrayList<>();
      input.add(2);
      input.add(1);
      input.add(4);
      input.add(9);
      Assertions.assertEquals(11, classObj.maximumNonAdjacentSum(input));
   }

   @Test
   void test_maximumNonAdjacentSum_expect8_whenInputSizeIs5() {
      ArrayList<Integer> input = new ArrayList<>();
      input.add(1);
      input.add(2);
      input.add(3);
      input.add(5);
      input.add(4);
      Assertions.assertEquals(8, classObj.maximumNonAdjacentSum(input));
   }

   @Test
   void test_maximumNonAdjacentSum_expect24_whenInputSizeIs9() {
      ArrayList<Integer> input = new ArrayList<>();
      input.add(1);
      input.add(2);
      input.add(3);
      input.add(1);
      input.add(3);
      input.add(5);
      input.add(8);
      input.add(1);
      input.add(9);
      Assertions.assertEquals(24, classObj.maximumNonAdjacentSum(input));
   }
}
