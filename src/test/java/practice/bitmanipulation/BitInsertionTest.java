package practice.bitmanipulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BitInsertionTest {

   BitInsertion classObj = new BitInsertion();

   @Test
   void test_insert_expectResult_when() {
      int N = 1024;
      int M = 19;
      int j = 6, i = 2;
      int expectedResult = 1100;
      Assertions.assertEquals(expectedResult, classObj.insert(N, M, j, i));
   }
}
