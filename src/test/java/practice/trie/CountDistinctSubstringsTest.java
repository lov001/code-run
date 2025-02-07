package practice.trie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountDistinctSubstringsTest {

   CountDistinctSubstrings classObj = new CountDistinctSubstrings();

   @Test
   void test_countDistinctSubstrings_expect6_whenInputIsSds() {
      Assertions.assertEquals(6, classObj.countDistinctSubstrings("sds"));
   }

   @Test
   void test_countDistinctSubstrings_expect7_whenInputIsAbc() {
      Assertions.assertEquals(7, classObj.countDistinctSubstrings("abc"));
   }
}
