package practice.binarysearch;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchInRotatedArrayTest {

   SearchInRotatedArray classObj = new SearchInRotatedArray();

   @Test
   public void test_search_expect3_whenTargetIs2() {
      ArrayList<Integer> input = new ArrayList<>();
      input.add(12);
      input.add(15);
      input.add(18);
      input.add(2);
      input.add(4);
      Assertions.assertEquals(3, classObj.search(input, 5, 2));
   }

   @Test
   public void test_search_expectMinus1_whenTargetIs3() {
      ArrayList<Integer> input = new ArrayList<>();
      input.add(8);
      input.add(9);
      input.add(4);
      input.add(5);
      Assertions.assertEquals(-1, classObj.search(input, 4, 3));
   }

   @Test
   public void test_search_expect1_whenTargetIs3() {
      ArrayList<Integer> input = new ArrayList<>();
      input.add(2);
      input.add(3);
      input.add(5);
      input.add(8);
      Assertions.assertEquals(1, classObj.search(input, 4, 3));
   }
}
