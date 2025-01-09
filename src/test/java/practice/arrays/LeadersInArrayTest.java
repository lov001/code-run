package practice.arrays;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeadersInArrayTest {

   LeadersInAnArray classObj = new LeadersInAnArray();

   @Test
   void test_superiorElements_expect_whenNIs4() {
      int[] input = {1, 2, 3, 2};
      List<Integer> expected = new ArrayList<>();
      expected.add(2);
      expected.add(3);
      List<Integer> actual = classObj.superiorElements(input);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }

   @Test
   void test_superiorElements_expect_whenNIs4_() {
      int[] input = {1, 2, 2, 1};
      List<Integer> expected = new ArrayList<>();
      expected.add(1);
      expected.add(2);
      List<Integer> actual = classObj.superiorElements(input);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }

   @Test
   void test_superiorElements_expect_whenNIs3() {
      int[] input = {5, 4, 3};
      List<Integer> expected = new ArrayList<>();
      expected.add(3);
      expected.add(4);
      expected.add(5);
      List<Integer> actual = classObj.superiorElements(input);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }
}
