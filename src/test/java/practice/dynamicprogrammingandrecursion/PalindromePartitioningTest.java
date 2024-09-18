package practice.dynamicprogrammingandrecursion;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromePartitioningTest {

   PalindromePartitioning classObj = new PalindromePartitioning();

   @Test
   void test_partition_expectOutputOfSize2_whenInputIsaab() {
      List<List<String>> expected = new ArrayList<>();
      expected.add(List.of("a", "a", "b"));
      expected.add(List.of("aa", "b"));
      List<List<String>> actual = classObj.partition("aab");
      Assertions.assertEquals(expected.size(), actual.size());
      for (int i = 0; i < expected.size(); i++) {
         Assertions.assertArrayEquals(new List[]{expected.get(i)}, new List[]{actual.get(i)});
      }
   }

   @Test
   void test_partition_expectOutputOfSize1_whenInputIsa() {
      List<List<String>> expected = new ArrayList<>();
      expected.add(List.of("a"));
      List<List<String>> actual = classObj.partition("a");
      Assertions.assertEquals(expected.size(), actual.size());
      for (int i = 0; i < expected.size(); i++) {
         Assertions.assertArrayEquals(new List[]{expected.get(i)}, new List[]{actual.get(i)});
      }
   }
}
