package practice.dynamicprogrammingandrecursion;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubsetsWithSumTest {

   SubsetsWithSum classObj = new SubsetsWithSum();

   @Test
   void test_subsetsWithSum_expectOutputOfSize3_WhenSumIs10() {
      int[] input = {2, 3, 5, 6, 8, 10};
      List<List<Integer>> expected = new ArrayList<>();
      expected.add(List.of(2, 3, 5));
      expected.add(List.of(2, 8));
      expected.add(List.of(10));
      List<List<Integer>> actual = classObj.subsetsWithSum(input, 10);
      Assertions.assertEquals(expected.size(), actual.size());
      for (int i = 0; i < expected.size(); i++) {
         Assertions.assertEquals(expected.get(i), actual.get(i));
      }
   }

   @Test
   void test_subsetsWithSum_expectOutputOfSize3_WhenSumIs10_() {
      int[] input = {1, 2, 3, 4, 5};
      List<List<Integer>> expected = new ArrayList<>();
      expected.add(List.of(1, 2, 3, 4));
      expected.add(List.of(1, 4, 5));
      expected.add(List.of(2, 3, 5));
      List<List<Integer>> actual = classObj.subsetsWithSum(input, 10);
      Assertions.assertEquals(expected.size(), actual.size());
      for (int i = 0; i < expected.size(); i++) {
         Assertions.assertEquals(expected.get(i), actual.get(i));
      }
   }
}
