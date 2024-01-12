package practice.arraysandstrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromePermutationTest {

   PalindromePermuation classObj = new PalindromePermuation();

   @Test
   void test_palindrome_expectTrue_whenStringIsAPalindrome(){
      String input = "Tact Coa";
      Assertions.assertTrue(classObj.palindrome(input));
      Assertions.assertTrue(classObj.isPermutationOfPalindrome(input));
      Assertions.assertTrue(classObj.isPermutationOfPalindrome2(input));
      Assertions.assertTrue(classObj.isPermutationOfPalindrome3(input));
   }

   @Test
   void test_palindrome_expectTrue_whenStringIsAPalindrome2(){
      String input = "atco cta";
      Assertions.assertTrue(classObj.palindrome(input));
      Assertions.assertTrue(classObj.isPermutationOfPalindrome(input));
      Assertions.assertTrue(classObj.isPermutationOfPalindrome2(input));
      Assertions.assertTrue(classObj.isPermutationOfPalindrome3(input));
   }

   @Test
   void test_palindrome_expectFalse_whenStringIsNotAPalindrome(){
      String input = "Raman Na";
      Assertions.assertFalse(classObj.palindrome(input));
      Assertions.assertFalse(classObj.isPermutationOfPalindrome(input));
      Assertions.assertFalse(classObj.isPermutationOfPalindrome2(input));
      Assertions.assertFalse(classObj.isPermutationOfPalindrome3(input));
   }

}
