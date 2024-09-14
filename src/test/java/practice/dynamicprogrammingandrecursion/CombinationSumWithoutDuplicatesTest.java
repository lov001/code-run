package practice.dynamicprogrammingandrecursion;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CombinationSumWithoutDuplicatesTest {

   CombinationSumWithoutDuplicates classObj = new CombinationSumWithoutDuplicates();

   @Test
   void test_combinationSum_expectOutputOfSize4_WhenTargetIs8() {
      int[] input = {10, 1, 2, 7, 6, 1, 5};
      List<List<Integer>> expected = new ArrayList<>();
      expected.add(List.of(1, 1, 6));
      expected.add(List.of(1, 2, 5));
      expected.add(List.of(1, 7));
      expected.add(List.of(2, 6));
      List<List<Integer>> actual = classObj.combinationSum2(input, 8);
      Assertions.assertEquals(expected.size(), actual.size());
      Assertions.assertArrayEquals(new List[]{expected.get(0)}, new List[]{actual.get(0)});
      Assertions.assertArrayEquals(new List[]{expected.get(1)}, new List[]{actual.get(1)});
      Assertions.assertArrayEquals(new List[]{expected.get(2)}, new List[]{actual.get(2)});
      Assertions.assertArrayEquals(new List[]{expected.get(3)}, new List[]{actual.get(3)});
   }

   @Test
   void test_combinationSum_expectOutputOfSize2_WhenTargetIs5() {
      int[] input = {2, 5, 2, 1, 2};
      List<List<Integer>> expected = new ArrayList<>();
      expected.add(List.of(1, 2, 2));
      expected.add(List.of(5));
      List<List<Integer>> actual = classObj.combinationSum2(input, 5);
      Assertions.assertEquals(expected.size(), actual.size());
      Assertions.assertArrayEquals(new List[]{expected.get(0)}, new List[]{actual.get(0)});
      Assertions.assertArrayEquals(new List[]{expected.get(1)}, new List[]{actual.get(1)});
   }
}
