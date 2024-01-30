package practice.arraysandstrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringRotationTest {

   StringRotation classObj = new StringRotation();

   @Test
   void test_isSubstring_expectTrue_whenStringIsASubstring(){
      String input = "waterbottle";
      String str = "erbottlewat";
      Assertions.assertTrue(classObj.isSubstring(input, str));
   }

   @Test
   void test_isSubstring_expectFalse_whenStringIsNotASubstring(){
      String input = "helloworld";
      String str = "worldheol";
      Assertions.assertFalse(classObj.isSubstring(input, str));
   }

}
