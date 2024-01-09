package practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import practice.arraysandstrings.IsUniqueString;

public class IsUniqueStringTest {

   IsUniqueString classObj = new IsUniqueString();

   @Test
   void test_isUniqueString_expectTrue_whenNoDuplicateCharacter(){
      String input = "abcdefg";
      Assertions.assertTrue(classObj.isUniqueString(input));
   }

   @Test
   void test_isUniqueString_expectFalse_whenDuplicateCharacterExists(){
      String input = "abbcse";
      Assertions.assertFalse(classObj.isUniqueString(input));
   }

}
