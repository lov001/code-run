package practice.arraysandstrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import practice.arraysandstrings.IsUniqueString;
import practice.arraysandstrings.IsUniqueStringWithHashTable;

public class IsUniqueStringTest {

   IsUniqueString classObj = new IsUniqueString();
   IsUniqueStringWithHashTable classObj2 = new IsUniqueStringWithHashTable();

   @Test
   void test_isUniqueString_expectTrue_whenNoDuplicateCharacter(){
      String input = "abcdefg";
      Assertions.assertTrue(classObj.isUniqueString(input));
      Assertions.assertTrue(classObj2.isUniqueString(input));
   }

   @Test
   void test_isUniqueString_expectFalse_whenDuplicateCharacterExists(){
      String input = "abbcse";
      Assertions.assertFalse(classObj.isUniqueString(input));
      Assertions.assertFalse(classObj2.isUniqueString(input));
   }

}
