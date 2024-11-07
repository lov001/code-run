package practice.arraysandstrings;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LargestRectangleInHistogramTest {

   LargestRectangleInHistogram classObj = new LargestRectangleInHistogram();

   @Test
   void test_largestRectangle_expect10_whenNIs6() {
      ArrayList<Integer> input = new ArrayList<>();
      input.add(2);
      input.add(1);
      input.add(5);
      input.add(6);
      input.add(2);
      input.add(3);
      Assertions.assertEquals(10, classObj.largestRectangle(input));
      Assertions.assertEquals(10, classObj.largestRectangleArea(input,6));
   }

   @Test
   void test_largestRectangle_expect8_whenNIs10() {
      ArrayList<Integer> input = new ArrayList<>();
      input.add(1);
      input.add(0);
      input.add(1);
      input.add(2);
      input.add(2);
      input.add(2);
      input.add(2);
      input.add(1);
      input.add(0);
      input.add(2);
      Assertions.assertEquals(8, classObj.largestRectangle(input));
      Assertions.assertEquals(8, classObj.largestRectangleArea(input, 10));
   }

   @Test
   void test_largestRectangle_expect4_whenNIs10() {
      ArrayList<Integer> input = new ArrayList<>();
      input.add(1);
      input.add(2);
      input.add(1);
      input.add(0);
      input.add(1);
      input.add(1);
      input.add(0);
      input.add(0);
      input.add(2);
      input.add(2);
      Assertions.assertEquals(4, classObj.largestRectangle(input));
      Assertions.assertEquals(4, classObj.largestRectangleArea(input, 10));
   }
}
