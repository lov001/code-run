package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DistinctSubsequencesTest {

   DistinctSubsequences classObj = new DistinctSubsequences();

   @Test
   void test_distinctSubsequences_expect3_whenS1OfLength10AndS2OfLength3() {
      Assertions.assertEquals(3, classObj.distinctSubsequences("brootgroot", "brt"));
      Assertions.assertEquals(3, classObj.distinctSubsequencesTabulation("brootgroot", "brt"));
      Assertions.assertEquals(3,
         classObj.distinctSubsequencesSpaceOptimisation("brootgroot", "brt"));
      Assertions.assertEquals(3,
         classObj.distinctSubsequencesSpaceOptimisation1DArray("brootgroot", "brt"));
   }

   @Test
   void test_distinctSubsequences_expect20_whenS1OfLength16AndS2OfLength3() {
      Assertions.assertEquals(20, classObj.distinctSubsequences("dingdingdingding", "ing"));
      Assertions.assertEquals(20,
         classObj.distinctSubsequencesTabulation("dingdingdingding", "ing"));
      Assertions.assertEquals(20,
         classObj.distinctSubsequencesSpaceOptimisation("dingdingdingding", "ing"));
      Assertions.assertEquals(20,
         classObj.distinctSubsequencesSpaceOptimisation1DArray("dingdingdingding", "ing"));
   }

   @Test
   void test_distinctSubsequences_expect5_whenS1OfLength5AndS2OfLength1() {
      Assertions.assertEquals(5, classObj.distinctSubsequences("aaaaa", "a"));
      Assertions.assertEquals(5, classObj.distinctSubsequencesTabulation("aaaaa", "a"));
      Assertions.assertEquals(5, classObj.distinctSubsequencesSpaceOptimisation("aaaaa", "a"));
      Assertions.assertEquals(5,
         classObj.distinctSubsequencesSpaceOptimisation1DArray("aaaaa", "a"));
   }
}
