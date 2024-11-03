package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestStringChainTest {

   LongestStringChain classObj = new LongestStringChain();

   @Test
   void test_longestStrChain_expect3_whenInputOfLength4() {
      String[] input = {"x", "xx", "y", "xyx"};
      Assertions.assertEquals(3, classObj.longestStrChain(input));
   }

   @Test
   void test_longestStrChain_expect2_whenInputOfLength3() {
      String[] input = {"m", "nm", "mmm"};
      Assertions.assertEquals(2, classObj.longestStrChain(input));
   }

   @Test
   void test_longestStrChain_expect3_whenInputOfLength5() {
      String[] input = {"a", "bc", "ad", "adc", "bcd"};
      Assertions.assertEquals(3, classObj.longestStrChain(input));
   }
}
