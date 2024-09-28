package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubsetSumEqualToKTest {

   SubsetSumEqualToK classObj = new SubsetSumEqualToK();

   @Test
   void test_subsetSumToK_expectTrue_whenNIs4AndKIs5() {
      int[] input = {4, 3, 2, 1};
      Assertions.assertTrue(classObj.subsetSumToK(4, 5, input));
      Assertions.assertTrue(classObj.subsetSumToKUsingTabulation(4, 5, input));
      Assertions.assertTrue(classObj.subsetSumToKUsingSpaceOptimisation(4, 5, input));
   }

   @Test
   void test_subsetSumToK_expectFalse_whenNIs5AndKIs4() {
      int[] input = {2, 5, 1, 6, 7};
      Assertions.assertFalse(classObj.subsetSumToK(5, 4, input));
      Assertions.assertFalse(classObj.subsetSumToKUsingTabulation(5, 4, input));
      Assertions.assertFalse(classObj.subsetSumToKUsingSpaceOptimisation(5, 4, input));
   }

   @Test
   void test_subsetSumToK_expectTrue_whenNIs4AndKIs4() {
      int[] input = {6, 1, 2, 1};
      Assertions.assertTrue(classObj.subsetSumToK(4, 4, input));
      Assertions.assertTrue(classObj.subsetSumToKUsingTabulation(4, 4, input));
      Assertions.assertTrue(classObj.subsetSumToKUsingSpaceOptimisation(4, 4, input));
   }

   @Test
   void test_subsetSumToK_expectFalse_whenNIs5AndKIs6() {
      int[] input = {1, 7, 2, 9, 10};
      Assertions.assertFalse(classObj.subsetSumToK(5, 6, input));
      Assertions.assertFalse(classObj.subsetSumToKUsingTabulation(5, 6, input));
      Assertions.assertFalse(classObj.subsetSumToKUsingSpaceOptimisation(5, 6, input));
   }
}
