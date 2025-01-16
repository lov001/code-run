package practice.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FourSumTest {

   FourSumProblem classObj = new FourSumProblem();

   @Test
   void test_fourSumBruteForce_expect1_whenNIs5() {
      int[] input = {1, 2, 1, 0, 1};
      List<List<Integer>> expected = new ArrayList<>();
      expected.add(Arrays.asList(1, 1, 1, 2));
      List<List<Integer>> actual = classObj.fourSumBruteForce(input, 5);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }

   @Test
   void test_fourSumBruteForce_expect2_whenNIs6() {
      int[] input = {2, 2, 2, 2, 1, 3};
      List<List<Integer>> expected = new ArrayList<>();
      expected.add(Arrays.asList(1, 2, 2, 3));
      expected.add(Arrays.asList(2, 2, 2, 2));
      List<List<Integer>> actual = classObj.fourSumBruteForce(input, 8);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }

   @Test
   void test_fourSumBruteForce_expect0_whenNIs6() {
      int[] input = {1, 1, 1, 0};
      List<List<Integer>> expected = new ArrayList<>();
      List<List<Integer>> actual = classObj.fourSumBruteForce(input, 4);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }

   @Test
   void test_fourSumHashing_expect1_whenNIs5() {
      int[] input = {1, 2, 1, 0, 1};
      List<List<Integer>> expected = new ArrayList<>();
      expected.add(Arrays.asList(1, 1, 1, 2));
      List<List<Integer>> actual = classObj.fourSumHashing(input, 5);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }

   @Test
   void test_fourSumHashing_expect2_whenNIs6() {
      int[] input = {2, 2, 2, 2, 1, 3};
      List<List<Integer>> expected = new ArrayList<>();
      expected.add(Arrays.asList(1, 2, 2, 3));
      expected.add(Arrays.asList(2, 2, 2, 2));
      List<List<Integer>> actual = classObj.fourSumHashing(input, 8);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }

   @Test
   void test_fourSumHashing_expect0_whenNIs6() {
      int[] input = {1, 1, 1, 0};
      List<List<Integer>> expected = new ArrayList<>();
      List<List<Integer>> actual = classObj.fourSumHashing(input, 4);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }

   @Test
   void test_fourSumTwoPointer_expect1_whenNIs5() {
      int[] input = {1, 2, 1, 0, 1};
      List<List<Integer>> expected = new ArrayList<>();
      expected.add(Arrays.asList(1, 1, 1, 2));
      List<List<Integer>> actual = classObj.fourSumTwoPointer(input, 5);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }

   @Test
   void test_fourSumTwoPointer_expect2_whenNIs6() {
      int[] input = {2, 2, 2, 2, 1, 3};
      List<List<Integer>> expected = new ArrayList<>();
      expected.add(Arrays.asList(1, 2, 2, 3));
      expected.add(Arrays.asList(2, 2, 2, 2));
      List<List<Integer>> actual = classObj.fourSumTwoPointer(input, 8);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }

   @Test
   void test_fourSumTwoPointer_expect0_whenNIs6() {
      int[] input = {1, 1, 1, 0};
      List<List<Integer>> expected = new ArrayList<>();
      List<List<Integer>> actual = classObj.fourSumTwoPointer(input, 4);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }
}
