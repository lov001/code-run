package practice.trie;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumXorWithAnElementFromArrayTest {

   MaximumXorWithAnElementFromArray classObj = new MaximumXorWithAnElementFromArray();

   @Test
   void test_maxXorQueries_expectOutputOfSize2_whenNIs5AndMIs2() {
      ArrayList<Integer> input = new ArrayList<>();
      input.add(0);
      input.add(1);
      input.add(2);
      input.add(3);
      input.add(4);
      ArrayList<ArrayList<Integer>> queries = new ArrayList<>();
      ArrayList<Integer> q1 = new ArrayList<>();
      q1.add(1);
      q1.add(3);
      queries.add(q1);
      ArrayList<Integer> q2 = new ArrayList<>();
      q2.add(5);
      q2.add(6);
      queries.add(q2);
      ArrayList<Integer> expected = new ArrayList<>();
      expected.add(3);
      expected.add(7);
      ArrayList<Integer> actual = classObj.maxXorQueries(input, queries);
      Assertions.assertArrayEquals(new ArrayList[]{expected}, new ArrayList[]{actual});
   }

   @Test
   void test_maxXorQueries_expectMinus1_whenNIs1AndMIs1() {
      ArrayList<Integer> input = new ArrayList<>();
      input.add(1);
      ArrayList<ArrayList<Integer>> queries = new ArrayList<>();
      ArrayList<Integer> q1 = new ArrayList<>();
      q1.add(1);
      q1.add(0);
      queries.add(q1);
      ArrayList<Integer> expected = new ArrayList<>();
      expected.add(-1);
      ArrayList<Integer> actual = classObj.maxXorQueries(input, queries);
      Assertions.assertArrayEquals(new ArrayList[]{expected}, new ArrayList[]{actual});
   }
}
