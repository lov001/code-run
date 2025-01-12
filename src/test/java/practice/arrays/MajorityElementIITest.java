package practice.arrays;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MajorityElementIITest {

   MajorityElementII classObj = new MajorityElementII();

   @Test
   void test_majorityElement_expect1And2_whenNIs6() {
      int[] input = {1, 1, 1, 2, 2, 2};
      List<Integer> expected = new ArrayList<>();
      expected.add(1);
      expected.add(2);
      List<Integer> actual = classObj.majorityElementBruteForce(input);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }

   @Test
   void test_majorityElement_expect4_whenNIs1() {
      int[] input = {4};
      List<Integer> expected = new ArrayList<>();
      expected.add(4);
      List<Integer> actual = classObj.majorityElementBruteForce(input);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }

   @Test
   void test_majorityElement_expect1_whenNIs9() {
      int[] input = {2, 2, 1, 3, 1, 1, 3, 1, 1};
      List<Integer> expected = new ArrayList<>();
      expected.add(1);
      List<Integer> actual = classObj.majorityElementBruteForce(input);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }

   @Test
   void test_majorityElement_expect2_whenNIs6() {
      int[] input = {2, 2, 0, 1, 2, 1};
      List<Integer> expected = new ArrayList<>();
      expected.add(2);
      List<Integer> actual = classObj.majorityElementBruteForce(input);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }
}
