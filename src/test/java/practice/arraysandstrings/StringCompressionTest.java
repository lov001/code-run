package practice.arraysandstrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCompressionTest {

   StringCompression classObj = new StringCompression();

   @Test
   void test_compress_expectCompressedStringWhenItsLengthIsSmallerThanOriginalString(){
      String input = "aabcccccaaa";
      Assertions.assertEquals("a2b1c5a3", classObj.compress(input));
      Assertions.assertEquals("a2b1c5a3", classObj.optimalCompression(input));
   }

   @Test
   void test_compress_expectOriginalStringWhenItsLengthIsGreaterThanOriginalString(){
      String input = "abc";
      Assertions.assertEquals("abc", classObj.compress(input));
      Assertions.assertEquals("abc", classObj.optimalCompression(input));
   }
}
