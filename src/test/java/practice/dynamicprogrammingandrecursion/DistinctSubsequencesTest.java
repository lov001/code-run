package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DistinctSubsequencesTest {

   DistinctSubsequences classObj = new DistinctSubsequences();

   @Test
   void test_distinctSubsequences_expect3_whenS1OfLength10AndS2OfLength3() {
      Assertions.assertEquals(3, classObj.distinctSubsequences("brootgroot", "brt"));
   }

   @Test
   void test_distinctSubsequences_expect20_whenS1OfLength16AndS2OfLength3() {
      Assertions.assertEquals(20, classObj.distinctSubsequences("dingdingdingding", "ing"));
   }

   @Test
   void test_distinctSubsequences_expect5_whenS1OfLength5AndS2OfLength1() {
      Assertions.assertEquals(5, classObj.distinctSubsequences("aaaaa", "a"));
   }
}
