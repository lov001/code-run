package practice.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ThreeSumTest {

   ThreeSumProblem classObj = new ThreeSumProblem();

   @Test
   void test_triplet_expect2_whenNIs5() {
      int[] input = {-1, -1, 2, 0, 1};
      List<List<Integer>> expected = new ArrayList<>();
      expected.add(Arrays.asList(-1, -1, 2));
      expected.add(Arrays.asList(-1, 0, 1));
      List<List<Integer>> actual = classObj.tripletBruteForce(5, input);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }

   @Test
   void test_triplet_expect1_whenNIs4() {
      int[] input = {0, 0, 0, 0};
      List<List<Integer>> expected = new ArrayList<>();
      expected.add(Arrays.asList(0, 0, 0));
      List<List<Integer>> actual = classObj.tripletBruteForce(4, input);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }

   @Test
   void test_tripletWithHashing_expect2_whenNIs5() {
      int[] input = {-1, -1, 2, 0, 1};
      List<List<Integer>> expected = new ArrayList<>();
      expected.add(Arrays.asList(-1, -1, 2));
      expected.add(Arrays.asList(-1, 0, 1));
      List<List<Integer>> actual = classObj.tripletWithHashing(5, input);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }

   @Test
   void test_tripletWithHashing_expect1_whenNIs4() {
      int[] input = {0, 0, 0, 0};
      List<List<Integer>> expected = new ArrayList<>();
      expected.add(Arrays.asList(0, 0, 0));
      List<List<Integer>> actual = classObj.tripletWithHashing(4, input);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }
}
