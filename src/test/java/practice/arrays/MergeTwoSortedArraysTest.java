package practice.arrays;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeTwoSortedArraysTest {

   MergeTwoSortedArrays classObj = new MergeTwoSortedArrays();

   @Test
   void test_sortedArray_expectListOfSize6_whenNIs5AndMIs3() {
      int[] a = {1, 2, 3, 4, 6};
      int[] b = {2, 3, 5};
      List<Integer> expected = new ArrayList<>();
      expected.add(1);
      expected.add(2);
      expected.add(3);
      expected.add(4);
      expected.add(5);
      expected.add(6);
      List<Integer> actual = classObj.sortedArrayBruteForce(a, b);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }

   @Test
   void test_sortedArray_expectListOfSize4_whenNIs4AndMIs3() {
      int[] a = {1, 2, 3, 3};
      int[] b = {2, 2, 4};
      List<Integer> expected = new ArrayList<>();
      expected.add(1);
      expected.add(2);
      expected.add(3);
      expected.add(4);
      List<Integer> actual = classObj.sortedArrayBruteForce(a, b);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }

   @Test
   void test_sortedArrayOptimised_expectListOfSize6_whenNIs5AndMIs3() {
      int[] a = {1, 2, 3, 4, 6};
      int[] b = {2, 3, 5};
      List<Integer> expected = new ArrayList<>();
      expected.add(1);
      expected.add(2);
      expected.add(3);
      expected.add(4);
      expected.add(5);
      expected.add(6);
      List<Integer> actual = classObj.sortedArrayOptimised(a, b);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }

   @Test
   void test_sortedArrayOptimised_expectListOfSize4_whenNIs4AndMIs3() {
      int[] a = {1, 2, 3, 3};
      int[] b = {2, 2, 4};
      List<Integer> expected = new ArrayList<>();
      expected.add(1);
      expected.add(2);
      expected.add(3);
      expected.add(4);
      List<Integer> actual = classObj.sortedArrayOptimised(a, b);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }
}
