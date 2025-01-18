package practice.arrays;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeOverlappingIntervalsTest {

   MergeOverlappingIntervals classObj = new MergeOverlappingIntervals();

   @Test
   void test_mergeOverlappingIntervals_expectSize2_whenNIs4() {
      int[][] input = {
         {1, 3},
         {2, 4},
         {3, 5},
         {6, 7}
      };
      List<List<Integer>> expected = new ArrayList<>();
      expected.add(List.of(1, 5));
      expected.add(List.of(6, 7));
      List<List<Integer>> actual = classObj.mergeOverlappingIntervals(input);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }

   @Test
   void test_mergeOverlappingIntervals_expectSize1_whenNIs9() {
      int[][] input = {
         {1, 2},
         {1, 3},
         {1, 6},
         {3, 4},
         {4, 4},
         {4, 5},
         {5, 5},
         {6, 6},
         {6, 6}
      };
      List<List<Integer>> expected = new ArrayList<>();
      expected.add(List.of(1, 6));
      List<List<Integer>> actual = classObj.mergeOverlappingIntervals(input);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }

   @Test
   void test_mergeOverlappingIntervals_expectSize1_whenNIs7() {
      int[][] input = {
         {2, 2},
         {2, 3},
         {2, 5},
         {3, 6},
         {4, 4},
         {4, 5},
         {6, 6}
      };
      List<List<Integer>> expected = new ArrayList<>();
      expected.add(List.of(2, 6));
      List<List<Integer>> actual = classObj.mergeOverlappingIntervals(input);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }

   @Test
   void test_mergeOverlappingIntervalsOptimal_expectSize2_whenNIs4() {
      int[][] input = {
         {1, 3},
         {2, 4},
         {3, 5},
         {6, 7}
      };
      List<List<Integer>> expected = new ArrayList<>();
      expected.add(List.of(1, 5));
      expected.add(List.of(6, 7));
      List<List<Integer>> actual = classObj.mergeOverlappingIntervalsOptimal(input);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }

   @Test
   void test_mergeOverlappingIntervalsOptimal_expectSize1_whenNIs9() {
      int[][] input = {
         {1, 2},
         {1, 3},
         {1, 6},
         {3, 4},
         {4, 4},
         {4, 5},
         {5, 5},
         {6, 6},
         {6, 6}
      };
      List<List<Integer>> expected = new ArrayList<>();
      expected.add(List.of(1, 6));
      List<List<Integer>> actual = classObj.mergeOverlappingIntervalsOptimal(input);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }

   @Test
   void test_mergeOverlappingIntervalsOptimal_expectSize1_whenNIs7() {
      int[][] input = {
         {2, 2},
         {2, 3},
         {2, 5},
         {3, 6},
         {4, 4},
         {4, 5},
         {6, 6}
      };
      List<List<Integer>> expected = new ArrayList<>();
      expected.add(List.of(2, 6));
      List<List<Integer>> actual = classObj.mergeOverlappingIntervalsOptimal(input);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }
}
