package practice.arraysandstrings;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class URLifyTest {


   URLify classObj = new URLify();

   @Test
   void test_urlify_expectFormattedString_whenLengthIs13() {
      char[] input = {'M', 'r', ' ', 'J', 'o', 'h', 'n', ' ', 'S', 'm', 'i', 't', 'h', ' ', ' ',
          ' ', ' '};
      int length = 13;
      String output = "Mr%20John%20Smith";
      char[] output2 = {'M', 'r', '%', '2', '0', 'J', 'o', 'h', 'n', '%', '2', '0', 'S', 'm', 'i',
          't', 'h'};
      Assertions.assertEquals(output, classObj.urlify(input, length));
      classObj.replaceSpaces(input, length);
      Assertions.assertEquals(Arrays.toString(output2), Arrays.toString(input));
   }

}
