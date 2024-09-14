package practice.dynamicprogrammingandrecursion;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Subsets2Test {

   Subsets2 classObj = new Subsets2();

   @Test
   void test_subsets2_expectOutputOfSize6_whenInputSizeIs3() {
      int[] input = {1, 2, 2};
      List<List<Integer>> expected = new ArrayList<>();
      expected.add(List.of());
      expected.add(List.of(1));
      expected.add(List.of(1, 2));
      expected.add(List.of(1, 2, 2));
      expected.add(List.of(2));
      expected.add(List.of(2, 2));
      List<List<Integer>> actual = classObj.subsetsWithDup(input);
      Assertions.assertEquals(expected.size(), actual.size());
      for (int i = 0; i < expected.size(); i++) {
         Assertions.assertArrayEquals(new List[]{expected.get(i)}, new List[]{actual.get(i)});
      }
   }

   @Test
   void test_subsets2_expectOutputOfSize2_whenInputSizeIs1() {
      int[] input = {0};
      List<List<Integer>> expected = new ArrayList<>();
      expected.add(List.of());
      expected.add(List.of(0));
      List<List<Integer>> actual = classObj.subsetsWithDup(input);
      Assertions.assertEquals(expected.size(), actual.size());
      for (int i = 0; i < expected.size(); i++) {
         Assertions.assertArrayEquals(new List[]{expected.get(i)}, new List[]{actual.get(i)});
      }
   }
}
