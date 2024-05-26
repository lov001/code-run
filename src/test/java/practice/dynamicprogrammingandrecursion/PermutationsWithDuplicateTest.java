package practice.dynamicprogrammingandrecursion;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PermutationsWithDuplicateTest {

   PermutationWithDuplicates classOBj = new PermutationWithDuplicates();

   @Test
   void test_getPermutations_expectEmptyList_whenStringIsEmpty() {
      Assertions.assertEquals(1, classOBj.getPermutations("").size());
      Assertions.assertEquals("", classOBj.getPermutations("").get(0));
   }

   @Test
   void test_getPermutations_expectOnePermutation_whenStringIsA() {
      String input = "a";
      List<String> output = List.of("a");
      Assertions.assertEquals(output, classOBj.getPermutations(input));
   }

   @Test
   void test_getPermutations_expectTwoPermutations_whenStringIsAB() {
      String input = "aa";
      List<String> output = List.of("aa");
      Assertions.assertEquals(output, classOBj.getPermutations(input));
   }

   @Test
   void test_getPermutations_expectThreePermutations_whenStringIsABC() {
      String input = "bbbbbb";
      List<String> output = List.of("bbbbbb");
      Assertions.assertEquals(output, classOBj.getPermutations(input));
   }
}
