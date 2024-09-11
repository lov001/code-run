package practice.dynamicprogrammingandrecursion;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubsetsTest {

   Subsets classObj = new Subsets();

   @Test
   void test_subsets_expectOutputOfSize8_WhenInputSizeIs3() {
      int[] input = {1, 2, 3};
      List<List<Integer>> expected = new ArrayList<>();
      expected.add(List.of(1, 2, 3));
      expected.add(List.of(1, 2));
      expected.add(List.of(1, 3));
      expected.add(List.of(1));
      expected.add(List.of(2, 3));
      expected.add(List.of(2));
      expected.add(List.of(3));
      expected.add(List.of());
      List<List<Integer>> actual = classObj.subsets(input);
      Assertions.assertEquals(expected.size(), actual.size());
      for (int i = 0; i < expected.size(); i++) {
         Assertions.assertEquals(expected.get(i), actual.get(i));
      }
   }

   @Test
   void test_subsets_expectOutputOfSize2_WhenInputSizeIs1() {
      int[] input = {0};
      List<List<Integer>> expected = new ArrayList<>();
      expected.add(List.of(0));
      expected.add(List.of());
      List<List<Integer>> actual = classObj.subsets(input);
      Assertions.assertEquals(expected.size(), actual.size());
      for (int i = 0; i < expected.size(); i++) {
         Assertions.assertEquals(expected.get(i), actual.get(i));
      }
   }
}
