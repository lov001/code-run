package practice.dynamicprogrammingandrecursion;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CombinationSumTest {

   CombinationSum classObj = new CombinationSum();

   @Test
   void test_combinationSum_expectOutputOfSize2_WhenTargetIs7() {
      int[] input = {2, 3, 6, 7};
      List<List<Integer>> expected = new ArrayList<>();
      expected.add(List.of(2, 2, 3));
      expected.add(List.of(7));
      List<List<Integer>> actual = classObj.combinationSum(input, 7);
      Assertions.assertEquals(expected.size(), actual.size());
      Assertions.assertArrayEquals(new List[]{expected.get(0)}, new List[]{actual.get(0)});
      Assertions.assertArrayEquals(new List[]{expected.get(1)}, new List[]{actual.get(1)});
   }

   @Test
   void test_combinationSum_expectOutputOfSize3_WhenTargetIs8() {
      int[] input = {2, 3, 5};
      List<List<Integer>> expected = new ArrayList<>();
      expected.add(List.of(2, 2, 2, 2));
      expected.add(List.of(2, 3, 3));
      expected.add(List.of(3, 5));
      List<List<Integer>> actual = classObj.combinationSum(input, 8);
      Assertions.assertEquals(expected.size(), actual.size());
      Assertions.assertArrayEquals(new List[]{expected.get(0)}, new List[]{actual.get(0)});
      Assertions.assertArrayEquals(new List[]{expected.get(1)}, new List[]{actual.get(1)});
      Assertions.assertArrayEquals(new List[]{expected.get(2)}, new List[]{actual.get(2)});
   }
}
