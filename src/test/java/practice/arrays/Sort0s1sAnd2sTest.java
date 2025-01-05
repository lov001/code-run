package practice.arrays;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Sort0s1sAnd2sTest {

   Sort0s1sAnd2s classObj = new Sort0s1sAnd2s();

   @Test
   void test_sortArray_expectSortedArray_whenNIs8() {
      ArrayList<Integer> input = new ArrayList<>();
      input.add(2);
      input.add(2);
      input.add(2);
      input.add(2);
      input.add(0);
      input.add(0);
      input.add(1);
      input.add(0);
      ArrayList<Integer> output = new ArrayList<>();
      output.add(0);
      output.add(0);
      output.add(0);
      output.add(1);
      output.add(2);
      output.add(2);
      output.add(2);
      output.add(2);
      classObj.sortArray(input, 8);
      Assertions.assertArrayEquals(new ArrayList[]{output}, new ArrayList[]{input});
   }

   @Test
   void test_sortArray_expectSortedArray_whenNIs5() {
      ArrayList<Integer> input = new ArrayList<>();
      input.add(1);
      input.add(1);
      input.add(1);
      input.add(1);
      input.add(1);
      ArrayList<Integer> output = new ArrayList<>();
      output.add(1);
      output.add(1);
      output.add(1);
      output.add(1);
      output.add(1);
      classObj.sortArray(input, 5);
      Assertions.assertArrayEquals(new ArrayList[]{output}, new ArrayList[]{input});
   }
}
