package practice.arraysandstrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckStringPermutationTest {

   CheckStringPermutation classObj = new CheckStringPermutation();

   @Test
   void test_checkPermutation_expectTrue_whenBothStringsArePermutationsOfEachOther(){
      String input1 = "aabbaXaabaabXa";
      String input2 = "baXabaXabaaaab";
      Assertions.assertTrue(classObj.checkPermutation(input1, input2));
      Assertions.assertTrue(classObj.checkPermutation2(input1, input2));
   }

   @Test
   void test_checkPermutation_expectFalse_whenBothStringsAreNotPermutationsOfEachOther(){
      String input1 = "abba";
      String input2 = "abbbab";
      Assertions.assertFalse(classObj.checkPermutation(input1, input2));
      Assertions.assertFalse(classObj.checkPermutation2(input1, input2));
   }

}
