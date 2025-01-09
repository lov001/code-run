package practice.arrays;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NextGreaterPermutationTest {

   NextGreaterPermutation classObj = new NextGreaterPermutation();

   @Test
   void test_nextGreaterPermutation_expect213_whenNIs132() {
      List<Integer> input = new ArrayList<>();
      input.add(1);
      input.add(3);
      input.add(2);
      List<Integer> expected = new ArrayList<>();
      expected.add(2);
      expected.add(1);
      expected.add(3);
      List<Integer> actual = classObj.nextGreaterPermutation(input);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }

   @Test
   void test_nextGreaterPermutation_expect321_whenNIs312() {
      List<Integer> input = new ArrayList<>();
      input.add(3);
      input.add(1);
      input.add(2);
      List<Integer> expected = new ArrayList<>();
      expected.add(3);
      expected.add(2);
      expected.add(1);
      List<Integer> actual = classObj.nextGreaterPermutation(input);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }

   @Test
   void test_nextGreaterPermutation_expect123_whenNIs321() {
      List<Integer> input = new ArrayList<>();
      input.add(3);
      input.add(2);
      input.add(1);
      List<Integer> expected = new ArrayList<>();
      expected.add(1);
      expected.add(2);
      expected.add(3);
      List<Integer> actual = classObj.nextGreaterPermutation(input);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }

   @Test
   void test_nextGreaterPermutationBF_expect213_whenNIs132() {
      List<Integer> input = new ArrayList<>();
      input.add(1);
      input.add(3);
      input.add(2);
      List<Integer> expected = new ArrayList<>();
      expected.add(2);
      expected.add(1);
      expected.add(3);
      List<Integer> actual = classObj.nextGreaterPermutationBruteForce(input);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }

   @Test
   void test_nextGreaterPermutationBF_expect321_whenNIs312() {
      List<Integer> input = new ArrayList<>();
      input.add(3);
      input.add(1);
      input.add(2);
      List<Integer> expected = new ArrayList<>();
      expected.add(3);
      expected.add(2);
      expected.add(1);
      List<Integer> actual = classObj.nextGreaterPermutationBruteForce(input);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }

   @Test
   void test_nextGreaterPermutationBF_expect123_whenNIs321() {
      List<Integer> input = new ArrayList<>();
      input.add(3);
      input.add(2);
      input.add(1);
      List<Integer> expected = new ArrayList<>();
      expected.add(1);
      expected.add(2);
      expected.add(3);
      List<Integer> actual = classObj.nextGreaterPermutationBruteForce(input);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }

   @Test
   void test_nextGreaterPermutationBF_expect_whenNIs() {
      List<Integer> input = new ArrayList<>();
      input.add(6);
      input.add(10);
      input.add(8);
      input.add(13);
      input.add(13);
      List<Integer> expected = new ArrayList<>();
      expected.add(6);
      expected.add(10);
      expected.add(13);
      expected.add(8);
      expected.add(13);
      List<Integer> actual = classObj.nextGreaterPermutationBruteForce(input);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }
}
