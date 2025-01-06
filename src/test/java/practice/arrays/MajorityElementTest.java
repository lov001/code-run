package practice.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MajorityElementTest {

   MajorityElement classObj = new MajorityElement();

   @Test
   void test_majorityElement_expect1_whenNIs9() {
      int[] input = {2, 2, 1, 3, 1, 1, 3, 1, 1};
      Assertions.assertEquals(1, classObj.majorityElement(input));
      Assertions.assertEquals(1, classObj.majorityElementMooreAlgorithm(input));
   }

   @Test
   void test_majorityElement_expect4_whenNIs1() {
      int[] input = {4};
      Assertions.assertEquals(4, classObj.majorityElement(input));
      Assertions.assertEquals(4, classObj.majorityElementMooreAlgorithm(input));
   }

   @Test
   void test_majorityElement_expect56_whenNIs5() {
      int[] input = {-53, 75, 56, 56, 56};
      Assertions.assertEquals(56, classObj.majorityElement(input));
      Assertions.assertEquals(56, classObj.majorityElementMooreAlgorithm(input));
   }
}
