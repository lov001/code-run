package practice.dynamicprogrammingandrecursion;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PermutationsTest {

   Permutations classObj = new Permutations();

   @Test
   void test_permute_expectOutputOfSize6_whenInputContains123() {
      int[] input = {1, 2, 3};
      List<List<Integer>> expected = new ArrayList<>();
      expected.add(List.of(1, 2, 3));
      expected.add(List.of(1, 3, 2));
      expected.add(List.of(2, 1, 3));
      expected.add(List.of(2, 3, 1));
      expected.add(List.of(3, 1, 2));
      expected.add(List.of(3, 2, 1));
      List<List<Integer>> actual = classObj.permuteWithExtraSpace(input);
      Assertions.assertEquals(expected.size(), actual.size());
      for (int i = 0; i < expected.size(); i++) {
         Assertions.assertArrayEquals(new List[]{expected.get(i)}, new List[]{actual.get(i)});
      }
   }

   @Test
   void test_permute_expectOutputOfSize2_whenInputContains01() {
      int[] input = {0, 1};
      List<List<Integer>> expected = new ArrayList<>();
      expected.add(List.of(0, 1));
      expected.add(List.of(1, 0));
      List<List<Integer>> actual = classObj.permuteWithExtraSpace(input);
      Assertions.assertEquals(expected.size(), actual.size());
      for (int i = 0; i < expected.size(); i++) {
         Assertions.assertArrayEquals(new List[]{expected.get(i)}, new List[]{actual.get(i)});
      }
   }

   @Test
   void test_permute_expectOutputOfSize1_whenInputContains1() {
      int[] input = {1};
      List<List<Integer>> expected = new ArrayList<>();
      expected.add(List.of(1));
      List<List<Integer>> actual = classObj.permuteWithExtraSpace(input);
      Assertions.assertEquals(expected.size(), actual.size());
      for (int i = 0; i < expected.size(); i++) {
         Assertions.assertArrayEquals(new List[]{expected.get(i)}, new List[]{actual.get(i)});
      }
   }

   @Test
   void test_permuteWithoutExtraSpace_expectOutputOfSize6_whenInputContains123() {
      int[] input = {1, 2, 3};
      List<List<Integer>> expected = new ArrayList<>();
      expected.add(List.of(1, 2, 3));
      expected.add(List.of(1, 3, 2));
      expected.add(List.of(2, 1, 3));
      expected.add(List.of(2, 3, 1));
      expected.add(List.of(3, 2, 1));
      expected.add(List.of(3, 1, 2));
      List<List<Integer>> actual = classObj.permuteWithoutExtraSpace(input);
      Assertions.assertEquals(expected.size(), actual.size());
      for (int i = 0; i < expected.size(); i++) {
         Assertions.assertArrayEquals(new List[]{expected.get(i)}, new List[]{actual.get(i)});
      }
   }

   @Test
   void test_permuteWithoutExtraSpace_expectOutputOfSize2_whenInputContains01() {
      int[] input = {0, 1};
      List<List<Integer>> expected = new ArrayList<>();
      expected.add(List.of(0, 1));
      expected.add(List.of(1, 0));
      List<List<Integer>> actual = classObj.permuteWithoutExtraSpace(input);
      Assertions.assertEquals(expected.size(), actual.size());
      for (int i = 0; i < expected.size(); i++) {
         Assertions.assertArrayEquals(new List[]{expected.get(i)}, new List[]{actual.get(i)});
      }
   }

   @Test
   void test_permuteWithoutExtraSpace_expectOutputOfSize1_whenInputContains1() {
      int[] input = {1};
      List<List<Integer>> expected = new ArrayList<>();
      expected.add(List.of(1));
      List<List<Integer>> actual = classObj.permuteWithoutExtraSpace(input);
      Assertions.assertEquals(expected.size(), actual.size());
      for (int i = 0; i < expected.size(); i++) {
         Assertions.assertArrayEquals(new List[]{expected.get(i)}, new List[]{actual.get(i)});
      }
   }
}
