package practice.dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PowerSetTest {

   PowerSet classObj = new PowerSet();

   @Test
   void test_getSubset_expectEmptySet_whenSetIsEmpty() {
      List<Integer> set = new ArrayList<>();
      List<List<Integer>> output = new ArrayList<>();
      output.add(new ArrayList<>());
      Assertions.assertEquals(output, classObj.getSubset(set, 0));
   }

   @Test
   void test_getSubset_expect2Elements_whenSetContainsOneElement() {
      List<Integer> set = new ArrayList<>();
      set.add(1);
      List<List<Integer>> output = new ArrayList<>();
      output.add(new ArrayList<>());
      output.add(List.of(1));
      Assertions.assertEquals(output, classObj.getSubset(set, 0));
   }

   @Test
   void test_getSubset_expect4Elements_whenSetContainsTwoElement() {
      List<Integer> set = new ArrayList<>(Arrays.asList(1, 2));
      List<List<Integer>> output = new ArrayList<>();
      output.add(new ArrayList<>());
      output.add(List.of(2));
      output.add(List.of(1));
      output.add(List.of(2, 1));
      Assertions.assertEquals(output, classObj.getSubset(set, 0));
   }

   @Test
   void test_getSubset_expect8Elements_whenSetContainsThreeElement() {
      List<Integer> set = new ArrayList<>(Arrays.asList(1, 2, 3));
      List<List<Integer>> output = new ArrayList<>();
      output.add(new ArrayList<>());
      output.add(List.of(3));
      output.add(List.of(2));
      output.add(List.of(3, 2));
      output.add(List.of(1));
      output.add(List.of(3, 1));
      output.add(List.of(2, 1));
      output.add(List.of(3, 2, 1));
      Assertions.assertEquals(output, classObj.getSubset(set, 0));
   }
}
