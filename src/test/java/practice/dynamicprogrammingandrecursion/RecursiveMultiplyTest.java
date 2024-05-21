package practice.dynamicprogrammingandrecursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RecursiveMultiplyTest {

   RecursiveMultiply classObj = new RecursiveMultiply();

   @Test
   void test_minProduct_expect56_whenAIs8AndBIs7() {
      Assertions.assertEquals(56, classObj.minProduct(8, 7));
   }

   @Test
   void test_minProduct_expect391_whenAIs17AndBIs23() {
      Assertions.assertEquals(391, classObj.minProduct(17, 23));
   }
}
