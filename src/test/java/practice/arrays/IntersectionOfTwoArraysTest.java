package practice.arrays;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntersectionOfTwoArraysTest {

   IntersectionOfTwoArrays classObj = new IntersectionOfTwoArrays();

   @Test
   void test_findArrayIntersection_expectListOfSize6_whenNIs5AndMIs3() {
      ArrayList<Integer> a = new ArrayList<>();
      a.add(1);
      a.add(2);
      a.add(2);
      a.add(2);
      a.add(3);
      a.add(4);
      ArrayList<Integer> b = new ArrayList<>();
      b.add(2);
      b.add(2);
      b.add(3);
      b.add(3);
      ArrayList<Integer> expected = new ArrayList<>();
      expected.add(2);
      expected.add(2);
      expected.add(3);
      ArrayList<Integer> actual = classObj.findArrayIntersection(a, 6, b, 4);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }

   @Test
   void test_findArrayIntersection_expectListOfSize4_whenNIs4AndMIs3() {
      ArrayList<Integer> a = new ArrayList<>();
      a.add(1);
      a.add(2);
      a.add(3);
      ArrayList<Integer> b = new ArrayList<>();
      b.add(3);
      b.add(4);
      ArrayList<Integer> expected = new ArrayList<>();
      expected.add(3);
      ArrayList<Integer> actual = classObj.findArrayIntersection(a, 3, b, 2);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }

   @Test
   void test_findArrayIntersectionOptimised_expectListOfSize6_whenNIs5AndMIs3() {
      ArrayList<Integer> a = new ArrayList<>();
      a.add(1);
      a.add(2);
      a.add(2);
      a.add(2);
      a.add(3);
      a.add(4);
      ArrayList<Integer> b = new ArrayList<>();
      b.add(2);
      b.add(2);
      b.add(3);
      b.add(3);
      ArrayList<Integer> expected = new ArrayList<>();
      expected.add(2);
      expected.add(2);
      expected.add(3);
      ArrayList<Integer> actual = classObj.findArrayIntersectionOptimised(a, 6, b, 4);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }

   @Test
   void test_findArrayIntersectionOptimised_expectListOfSize4_whenNIs4AndMIs3() {
      ArrayList<Integer> a = new ArrayList<>();
      a.add(1);
      a.add(2);
      a.add(3);
      ArrayList<Integer> b = new ArrayList<>();
      b.add(3);
      b.add(4);
      ArrayList<Integer> expected = new ArrayList<>();
      expected.add(3);
      ArrayList<Integer> actual = classObj.findArrayIntersectionOptimised(a, 3, b, 2);
      Assertions.assertArrayEquals(new List[]{expected}, new List[]{actual});
   }
}
