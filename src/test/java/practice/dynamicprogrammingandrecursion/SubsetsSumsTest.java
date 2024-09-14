package practice.dynamicprogrammingandrecursion;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubsetsSumsTest {

   SubsetSums classObj = new SubsetSums();

   @Test
   void test_subsetSums_expectOutputOfSize4_WhenNIs10() {
      ArrayList<Integer> input = new ArrayList<>(List.of(2, 3));
      List<Integer> expected = List.of(5, 2, 3, 0);
      List<Integer> actual = classObj.subsetSums(input, 2);
      Assertions.assertEquals(expected.size(), actual.size());
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }

   @Test
   void test_subsetSums_expectOutputOfSize8_WhenNIs3() {
      ArrayList<Integer> input = new ArrayList<>(List.of(1, 2, 1));
      List<Integer> expected = List.of(4, 3, 2, 1, 3, 2, 1, 0);
      List<Integer> actual = classObj.subsetSums(input, 10);
      Assertions.assertEquals(expected.size(), actual.size());
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }
}
