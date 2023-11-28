package leetcode.searching.binarysearch.problem744;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NextGreatestLetterTest {


   NextGreatestLetter classObj = new NextGreatestLetter();
   NextGreatestLetterUsingBinarySearch classObj2 = new NextGreatestLetterUsingBinarySearch();

   @Test
   void test_nextGreatestLetter_expectC_whenGivenInput() {
      char[] input = {'c', 'f', 'j'};
      Assertions.assertEquals('c', classObj.nextGreatestLetter(input, 'a'));
      Assertions.assertEquals('c', classObj2.nextGreatestLetter(input, 'a'));
   }

   @Test
   void test_nextGreatestLetter_expectF_whenGivenInput() {
      char[] input = {'c', 'f', 'j'};
      Assertions.assertEquals('f', classObj.nextGreatestLetter(input, 'c'));
      Assertions.assertEquals('f', classObj2.nextGreatestLetter(input, 'c'));
   }

   @Test
   void test_nextGreatestLetter_expectFirstCharacter_whenInputDoesNotHaveGreaterThanTarget() {
      char[] input = {'x', 'x', 'y', 'y'};
      Assertions.assertEquals('x', classObj.nextGreatestLetter(input, 'z'));
      Assertions.assertEquals('x', classObj2.nextGreatestLetter(input, 'z'));
   }

   @Test
   void test_nextGreatestLetter_expectF_whenTargetIsD() {
      char[] input = {'c', 'f', 'j'};
      Assertions.assertEquals('f', classObj.nextGreatestLetter(input, 'd'));
      Assertions.assertEquals('f', classObj2.nextGreatestLetter(input, 'd'));
   }

   @Test
   void test_nextGreatestLetter_expectC_whenTargetIsJ() {
      char[] input = {'c', 'f', 'j'};
      Assertions.assertEquals('c', classObj.nextGreatestLetter(input, 'j'));
      Assertions.assertEquals('c', classObj2.nextGreatestLetter(input, 'j'));
   }

   @Test
   void test_nextGreatestLetter_expectE_whenTargetIsG() {
      char[] input = {'e', 'e', 'g', 'g'};
      Assertions.assertEquals('e', classObj.nextGreatestLetter(input, 'g'));
      Assertions.assertEquals('e', classObj2.nextGreatestLetter(input, 'g'));
   }
}
