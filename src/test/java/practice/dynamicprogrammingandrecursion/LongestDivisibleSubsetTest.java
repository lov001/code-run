package practice.dynamicprogrammingandrecursion;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestDivisibleSubsetTest {

   LongestDivisibleSubset classObj = new LongestDivisibleSubset();

   @Test
   void test_divisibleSet_expect1_4_8_16_whenInputOfLength6() {
      int[] input = {5, 4, 11, 1, 16, 8};
      List<Integer> expected = List.of(1, 4, 8, 16);
      List<Integer> actual = classObj.divisibleSet(input);
      Assertions.assertArrayEquals(expected.toArray(), actual.toArray());
   }

   @Test
   void test_divisibleSet_expect1_2_whenInputOfLength3() {
      int[] input = {1, 2, 5};
      List<Integer> expected = List.of(1, 2);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{classObj.divisibleSet(input)});
   }
}
